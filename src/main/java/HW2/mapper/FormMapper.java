package HW2.mapper;

import HW2.domain.dto.*;
import HW2.domain.entities.Field;
import HW2.domain.entities.Form;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FormMapper {


    FormMapper INSTANCE = Mappers.getMapper(FormMapper.class);

    FormResponseDTO toResponseDTO(Form form);

    Form toEntity(CreateFormRequestDTO formDTO);

    Form updateEntity(@MappingTarget Form form, UpdateFormRequestDTO formDTO);

    FieldResponseDTO toResponseDTO(Field field);

    Field toEntity(FieldRequestDTO fieldDTO);

}