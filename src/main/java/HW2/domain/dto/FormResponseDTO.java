package HW2.domain.dto;

public record FormResponseDTO(
        Long id,
        String name,
        boolean published,
        String submitUrl
) {
}