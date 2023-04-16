package gov.iti.jets.services.mappers.language;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import gov.iti.jets.repositories.entities.Language;
import gov.iti.jets.services.dto.language.LanguageDto;

@Mapper
public interface LanguageMapper extends gov.iti.jets.services.mappers.Mapper<Language,LanguageDto> {

    LanguageMapper INSTANCE = Mappers.getMapper(LanguageMapper.class);

    // LanguageDto toDto(Language category);

    // Language toEntity(LanguageDto category);

    // List<LanguageDto> mapToDto(List<Language> categories);

    // List<Language> mapToEntity(List<LanguageDto> categories);

}
