package gov.iti.jets.services;

import java.util.List;

import gov.iti.jets.exceptions.NotFoundException;
import gov.iti.jets.exceptions.ValidationException;

/*
 * D dto
 * P pk
 * E entity
 */
public interface Service<E, D, P> {

    D add(D d) throws ValidationException, Exception;

    D get(P key);

    List<D> get();

    boolean delete(P key) throws NotFoundException;

    D update(D d) throws ValidationException, Exception;

}
