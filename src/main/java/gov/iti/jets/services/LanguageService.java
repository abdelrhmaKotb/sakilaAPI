package gov.iti.jets.services;




import gov.iti.jets.repositories.entities.Language;
import gov.iti.jets.services.dto.language.LanguageDto;
import gov.iti.jets.services.mappers.language.LanguageMapper;

public class LanguageService extends ServiceImpl<Language,LanguageDto,Integer> {

    public LanguageService(){
        super(Language.class, LanguageMapper.INSTANCE);
    }

}
