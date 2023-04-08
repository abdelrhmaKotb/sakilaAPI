package gov.iti.jets;

import gov.iti.jets.exceptions.ValidationException;
import gov.iti.jets.services.dto.categories.CategoryDto;

public class Main {
    public static void main(String[] args) {
        // RepositoryImpl<Category,Integer> repositoryImpl = new RepositoryImpl<>(Category.class);

        // System.out.println(CategoryMapper.INSTANCE.toEntity(CategoryMapper.INSTANCE.toDto(repositoryImpl.find(1))));
        // System.out.println(repositoryImpl.find(1));

        gov.iti.jets.api.soap.services.Category cat = new gov.iti.jets.api.soap.services.Category();

        try {
            cat.add(new CategoryDto(null, null, null));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}