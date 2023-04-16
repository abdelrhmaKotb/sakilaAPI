package gov.iti.jets.api.rest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.ActorService;
import gov.iti.jets.services.CategoryService;
import gov.iti.jets.services.FlatActorService;
import gov.iti.jets.services.dto.actor.FlatActorDto;
import gov.iti.jets.services.dto.categories.CategoryDto;
import gov.iti.jets.services.dto.film.FlatFilmDto;
import jakarta.jws.WebResult;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("categories")
public class Category {
    private CategoryService categoryService = new CategoryService();

    /**
     * this method to get list of categories from database
     * 
     * @return
     * @throws Exception
     */
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<CategoryDto> getAllCategories() throws Exception {

        return categoryService.get();
    }

    /**
     * @param int id
     * @return CategoryDto
     * @throws Exception
     */
    @GET
    @Path("{categoeyId}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public CategoryDto getCategory(@PathParam(value = "categoeyId") int id) throws Exception {
        return categoryService.get(id);
    }

    /**
     * this method to add category in database
     * 
     * @param categoryDto
     * @return CategoryDto
     * @throws ValidationException
     */

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public CategoryDto createCategories(CategoryDto categoryDto)
            throws ValidationException, Exception {
        categoryDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return categoryService.add(categoryDto);

    }

     /**
     * @param int id
     * @return CategoryDto
     * @throws Exception
     */
    @DELETE
    @Path("{categoeyId}")
    public boolean deleteCategory(@PathParam(value = "categoeyId") int id) throws Exception {
        categoryService.delete(id);
        return true;
    }

    /**
     * update category
     * 
     * @param categoryDto
     * @return
     * @throws Exception
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public CategoryDto updateCategory(CategoryDto categoryDto) throws Exception {
        categoryDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return categoryService.update(categoryDto);
    }


    @GET
    @Path("{categoeyId}/films")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public List<FlatFilmDto> getFilmsUnderCategory(@PathParam(value = "categoeyId") int id) throws Exception{
        return categoryService.getActorFilms(id);
    }

}
