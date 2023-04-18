package gov.iti.jets.services;

import java.util.List;
import gov.iti.jets.repositories.CategoryRepository;
import gov.iti.jets.repositories.entities.Category;
import gov.iti.jets.services.dto.categories.CategoryDto;
import gov.iti.jets.services.dto.film.FlatFilmDto;
import gov.iti.jets.services.mappers.categories.CategoryMapper;

public class CategoryService extends ServiceImpl<Category, CategoryDto, Integer> {

    public CategoryService() {
        super(Category.class, CategoryMapper.INSTANCE);
    }

    public List<FlatFilmDto> getActorFilms(int id) {
        CategoryRepository repo = new CategoryRepository();
        return repo.getActorFilms(id);
    }

}
