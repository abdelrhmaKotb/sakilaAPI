package gov.iti.jets.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;
import javax.validation.ConstraintViolation;
import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.repositories.RepositoryImpl;
import gov.iti.jets.repositories.entities.Category;
import gov.iti.jets.services.dto.categories.CategoryDto;
import gov.iti.jets.services.mappers.categories.CategoryMapper;
import gov.iti.jets.services.validation.ValidatorHandler;

public class CategoryService {
    /*
     * add categoty service
     */
    public CategoryDto add(CategoryDto categoryDto) throws ValidationException,Exception {

        var validator = ValidatorHandler.getValidator();

        Set<ConstraintViolation<CategoryDto>> violations = validator.validate(categoryDto);      

        if (violations.size() > 0) {
            throw new ValidationException(ValidatorHandler.<CategoryDto>getErrorMessage(violations));
        }

        RepositoryImpl<Category, Integer> impl = new RepositoryImpl<>(Category.class);

        Category category = CategoryMapper.INSTANCE.toEntity(categoryDto);
        category.setLastUpdate(Date.valueOf(LocalDate.now()));

        Category res = impl.create(category);

        if(res == null){
            throw new Exception("un saved");
        }

        return CategoryMapper.INSTANCE.toDto(res);
    }
}
