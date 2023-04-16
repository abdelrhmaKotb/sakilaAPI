package gov.iti.jets.services.mappers.categories;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Category;
import gov.iti.jets.services.dto.categories.CategoryFilmCategoriesDto;

@Mapper
public interface CategoryFilmCategoriesMapper extends gov.iti.jets.services.mappers.Mapper<Category,CategoryFilmCategoriesDto> {
    CategoryFilmCategoriesMapper INSTANCE = Mappers.getMapper(CategoryFilmCategoriesMapper.class);

}
