package gov.iti.jets.services;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import gov.iti.jets.exceptions.NotFoundException;
import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.repositories.RepositoryImpl;
import gov.iti.jets.services.mappers.Mapper;
import gov.iti.jets.services.validation.ValidatorHandler;

public class ServiceImpl<E,D,P> implements Service<E,D,P>{

    private Mapper<E,D> _mapper;
    private RepositoryImpl<E, P> _impl;


    public ServiceImpl(Class<E> _entityType , Mapper<E,D> _mapper){
       this._mapper = _mapper;
       this._impl = new RepositoryImpl<>(_entityType);
    }


    public RepositoryImpl<E, P> get_impl() {
        return _impl;
    }


    @Override
    public D add(D d) throws ValidationException, Exception {

        var validator = ValidatorHandler.getValidator();

        Set<ConstraintViolation<D>> violations = validator.validate(d);

        if (violations.size() > 0) {
            throw new ValidationException(ValidatorHandler.<D>getErrorMessage(violations));
        }

        E e  = _mapper.toEntity(d);

        System.out.println("entity " + e);
        
        E res = _impl.create(e);

        if (res == null) {
            throw new Exception("un saved");
        }

        return _mapper.toDto(res);
        
    }

    @Override
    public boolean delete(P key) throws NotFoundException {
        E e = _impl.find(key);
        if(e == null){
            throw new NotFoundException("entity with id " + key + " not found");
        }
         _impl.remove(e);
        return true;
    }

    @Override
    public D get(P key) {
        E e = _impl.find(key);
        return _mapper.toDto(e);
    }

    @Override
    public List<D> get() {
        List<E> e = _impl.findAll();
        return _mapper.mapToDto(e);
    }


    @Override
    public D update(D d) throws ValidationException, Exception {
        var validator = ValidatorHandler.getValidator();

        Set<ConstraintViolation<D>> violations = validator.validate(d);

        if (violations.size() > 0) {
            throw new ValidationException(ValidatorHandler.<D>getErrorMessage(violations));
        }


        E e = _mapper.toEntity(d);

        System.out.println(e);


        E res = _impl.update(e);

        if (res == null) {
            throw new Exception("there is an error ! try again later");
        }

        System.out.println("res" + res);

        return _mapper.toDto(res);

    }

    
    
}
