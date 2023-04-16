package gov.iti.jets.api.soap.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.CategoryService;
import gov.iti.jets.services.dto.categories.CategoryDto;
import gov.iti.jets.services.dto.film.FlatFilmDto;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/*
 * category service 
 * endpoint /ws/Category
 */

@WebService
public class Category {
    private CategoryService categoryService = new CategoryService();

    /**
     * this method to get list of categories from database
     * 
     * @return
     * @throws Exception
     */
    public List<CategoryDto> getAllCategories() throws Exception {

        return categoryService.get();
    }

    /**
     * @param int id
     * @return CategoryDto
     * @throws Exception
     */
    public CategoryDto getCategory(@WebParam(name = "categoeyId") int id) throws Exception {
        return categoryService.get(id);
    }

    /**
     * this method to add category in database
     * 
     * @param categoryDto
     * @return CategoryDto
     * @throws ValidationException
     */

    public CategoryDto createCategories(@WebParam(name = "categoey") CategoryDto categoryDto)
            throws ValidationException, Exception {
                categoryDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return categoryService.add(categoryDto);

    }

    /**
     * @param int id
     * @return CategoryDto
     * @throws Exception
     */
    public boolean deleteCategory(@WebParam(name = "categoeyId") int id) throws Exception {
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
    public CategoryDto updateCategory(@WebParam(name = "categoey") CategoryDto categoryDto) throws Exception {
        categoryDto.setLastUpdate(Date.valueOf(LocalDate.now()));
        return categoryService.update(categoryDto);
    }


    @WebResult(name = "film")
    public List<FlatFilmDto> getFilmsUnderCategory(@WebParam(name = "categoeyId") int id) throws Exception{
        return categoryService.getActorFilms(id);
    }

}
