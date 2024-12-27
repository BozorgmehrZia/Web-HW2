package HW2.domain.entities;

import HW2.domain.enumeration.FieldType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String label;

    @Enumerated(EnumType.STRING)
    private FieldType type;

    private String defaultValue;
}
