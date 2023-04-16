package gov.iti.jets.services;

import java.util.ArrayList;
import java.util.List;

import gov.iti.jets.repositories.entities.Category;
import gov.iti.jets.repositories.entities.Film;
import gov.iti.jets.services.dto.categories.CategoryDto;
import gov.iti.jets.services.dto.categories.CategoryFilmCategoriesDto;
import gov.iti.jets.services.dto.film.FlatFilmDto;
import gov.iti.jets.services.mappers.categories.CategoryFilmCategoriesMapper;
import gov.iti.jets.services.mappers.categories.CategoryMapper;
import gov.iti.jets.services.mappers.film.FlatFilmMapper;

public class CategoryService extends ServiceImpl<Category, CategoryDto, Integer> {

    public CategoryService() {
        super(Category.class, CategoryMapper.INSTANCE);
    }

    public List<FlatFilmDto> getActorFilms(int id) {
        ServiceImpl<Category, CategoryFilmCategoriesDto, Integer> serviceImpl = new ServiceImpl<>(Category.class,
                CategoryFilmCategoriesMapper.INSTANCE);

        // we can add filed as we like :)))
        var res = serviceImpl.get_impl().<FlatFilmDto>query(
                "SELECT new gov.iti.jets.services.dto.film.FlatFilmDto(f.film.id,f.film.title) FROM FilmCategory f where category.id = ?1",
                String.valueOf(id));
        return res;
    }

}
