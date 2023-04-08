package gov.iti.jets.services.mappers.categories;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Category;
import gov.iti.jets.services.dto.categories.CategoryFilmCategoriesDto;

@Mapper
public interface CategoryFilmCategoriesMapper {
    CategoryFilmCategoriesMapper INSTANCE = Mappers.getMapper(CategoryFilmCategoriesMapper.class);

    CategoryFilmCategoriesDto toDto(Category category);

    Category toEntity(CategoryFilmCategoriesDto category);
}
