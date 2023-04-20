package gov.iti.jets.api.rest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.LanguageService;
import gov.iti.jets.services.dto.language.LanguageDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/*
 * language service 
 * endpoint /ws/Language
 */

@Path("languages")
public class Language {
    private LanguageService _languageService = new LanguageService();

    /**
     * this method to get list of languages from database
     * 
     * @return
     * @throws Exception
     */

    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<LanguageDto> getAllLanguages() throws Exception {

        return _languageService.get();
    }

    /**
     * @param int id
     * @return LanguageDto
     * @throws Exception
     */

    @GET
    @Path("{languageId}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public LanguageDto getLanguage(@PathParam(value = "languageId") int id) throws Exception {
        return _languageService.get(id);
    }

    /**
     * this method to add langauge in database
     * 
     * @param language
     * @return language
     * @throws ValidationException
     */

    @POST
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes(MediaType.APPLICATION_JSON)
    public LanguageDto createLanguage(LanguageDto languageDto)
            throws ValidationException, Exception {
        languageDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return _languageService.add(languageDto);
    }

    /**
     * @param int id
     * @return boolean
     * @throws Exception
     */

    @DELETE
    @Path("{languageId}")
    public boolean deleteLanguage(@PathParam(value = "languageId") int id) throws Exception {
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

    @PUT
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes(MediaType.APPLICATION_JSON)
    public LanguageDto updateLanguage(LanguageDto languageDto) throws Exception {
        languageDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return _languageService.update(languageDto);
    }

}
