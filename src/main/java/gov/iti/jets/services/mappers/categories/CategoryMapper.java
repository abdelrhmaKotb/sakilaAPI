package gov.iti.jets.services.mappers.categories;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.repositories.entities.Category;
import gov.iti.jets.services.dto.categories.CategoryDto;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDto toDto(Category category);

    Category toEntity(CategoryDto category);
}
