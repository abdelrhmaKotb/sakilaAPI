package gov.iti.jets.api.soap.services;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.CategoryService;
import gov.iti.jets.services.dto.categories.CategoryDto;
import jakarta.jws.WebService;

/*
 * category service 
 * endpoint /ws/Category
 */

@WebService
public class Category {

    /**
     * this method to add category in database
     * 
     * @param categoryDto
     * @return CategoryDto
     * @throws ValidationException
     */

    public CategoryDto add(CategoryDto categoryDto) throws ValidationException, Exception {

        CategoryService categoryService = new CategoryService();

        categoryService.add(categoryDto);

        return categoryDto;
    }

}
