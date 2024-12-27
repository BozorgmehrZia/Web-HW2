package HW2.domain.dto;

import HW2.domain.enumeration.FieldType;

public record FieldRequestDTO(
        String name,
        String label,
        FieldType type,
        String defaultValue
) {
}