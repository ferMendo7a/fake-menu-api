package py.com.fmendoza.fakemenuapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class MenuType {
    @Id
    @SequenceGenerator(name = "menu_type_seq", sequenceName = "menu_type_menu_type_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menu_type_seq")
    private Long menuTypeId;
    private String name;
}
