package gov.iti.jets.repositories;

import java.util.List;

import gov.iti.jets.repositories.interfaces.Category;
import gov.iti.jets.services.dto.film.FlatFilmDto;

public class CategoryRepository extends RepositoryImpl<Category, Integer> implements Category {

    public CategoryRepository(){
        super(Category.class);
    }

    public List<FlatFilmDto> getActorFilms(int id) {
        // we can add filed as we like :)))
        var res = this.<FlatFilmDto>query(
                "SELECT new gov.iti.jets.services.dto.film.FlatFilmDto(f.film.id,f.film.title) FROM FilmCategory f where category.id = ?1",
                String.valueOf(id));
        return res;
    }

}
