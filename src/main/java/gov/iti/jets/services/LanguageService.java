package gov.iti.jets.services;




import gov.iti.jets.repositories.entities.Language;
import gov.iti.jets.services.dto.language.LanguageDto;
import gov.iti.jets.services.mappers.language.LanguageMapper;

public class LanguageService extends ServiceImpl<Language,LanguageDto,Integer> {

    public LanguageService(){
        super(Language.class, LanguageMapper.INSTANCE);
    }

    // private RepositoryImpl<Language, Integer> _impl = new RepositoryImpl<>(Language.class);

    // /*
    //  * add categoty service
    //  */
    // public LanguageDto add(LanguageDto LanguageDto) throws ValidationException, Exception {

    //     var validator = ValidatorHandler.getValidator();

    //     Set<ConstraintViolation<LanguageDto>> violations = validator.validate(LanguageDto);

    //     if (violations.size() > 0) {
    //         throw new ValidationException(ValidatorHandler.<LanguageDto>getErrorMessage(violations));
    //     }


    //     Language language = LanguageMapper.INSTANCE.toEntity(LanguageDto);
    //     language.setLastUpdate(Date.valueOf(LocalDate.now()));

    //     Language res = _impl.create(language);

    //     if (res == null) {
    //         throw new Exception("un saved");
    //     }

    //     return LanguageMapper.INSTANCE.toDto(res);
    // }

     

    // /**
    //  * this method fethch all categories from databae
    //  * 
    //  * @return all categories
    //  */

    // public List<LanguageDto> get() {
    //     List<Language> languages = _impl.findAll();
    //     System.out.println(languages);
    //     return LanguageMapper.INSTANCE.mapToDto(languages);
    // }

    // /**
    //  * this method fethch all category by id from databae
    //  * 
    //  * @return all categories
    //  */

    // public LanguageDto get(int id) {
    //     Language language = _impl.find(id);
    //     return LanguageMapper.INSTANCE.toDto(language);
    // }


    // public boolean delete(int id) throws NotFoundException{
    //     Language language = _impl.find(id);
    //     if(language == null){
    //         throw new NotFoundException("language with id " + id + " not found");
    //     }
    //      _impl.remove(language);
    //     return true;
    // }


    // /*
    //  * add categoty service
    //  */
    // public LanguageDto update(LanguageDto LanguageDto) throws ValidationException, Exception {

    //     var validator = ValidatorHandler.getValidator();

    //     Set<ConstraintViolation<LanguageDto>> violations = validator.validate(LanguageDto);

    //     if (violations.size() > 0) {
    //         throw new ValidationException(ValidatorHandler.<LanguageDto>getErrorMessage(violations));
    //     }


    //     Language language = LanguageMapper.INSTANCE.toEntity(LanguageDto);
    //     language.setLastUpdate(Date.valueOf(LocalDate.now()));


    //     Language res = _impl.update(language);

    //     if (res == null) {
    //         throw new Exception("there is an error ! try again later");
    //     }

    //     return LanguageMapper.INSTANCE.toDto(res);
    // }



}
