package gov.iti.jets.api.soap.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.LanguageService;
import gov.iti.jets.services.dto.language.LanguageDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

/*
 * language service 
 * endpoint /ws/Language
 */

@WebService
public class Language {
    private LanguageService _languageService = new LanguageService();

    /**
     * this method to get list of languages from database
     * 
     * @return
     * @throws Exception
     */
    public List<LanguageDto> getAllLanguages() throws Exception {

        return _languageService.get();
    }

    /**
     * @param int id
     * @return LanguageDto
     * @throws Exception
     */
    public LanguageDto getLanguage(@WebParam(name = "languageId") int id) throws Exception {
        return _languageService.get(id);
    }

    /**
     * this method to add langauge in database
     * 
     * @param language
     * @return language
     * @throws ValidationException
     */

    public LanguageDto createLanguage(@WebParam(name = "language") LanguageDto languageDto)
            throws ValidationException, Exception {
                languageDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return _languageService.add(languageDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */
    public boolean deleteLanguage(@WebParam(name = "languageId") int id) throws Exception {
        _languageService.delete(id);
        return true;
    }

    /**
     * update language
     * 
     * @param LanguageDto
     * @return
     * @throws Exception
     */
    public LanguageDto updateLanguage(@WebParam(name = "language") LanguageDto languageDto) throws Exception {
        languageDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return _languageService.update(languageDto);
    }

}
