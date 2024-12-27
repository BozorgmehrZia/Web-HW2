package HW2.domain.dto;

public record UpdateFormRequestDTO(
        String name,
        boolean published,
        String submitUrl
) {
}