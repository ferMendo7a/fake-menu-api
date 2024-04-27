package py.com.fmendoza.fakemenuapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Menu {
    @Id
    @SequenceGenerator(name = "menu_seq", sequenceName = "menu_menu_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menu_seq")
    private Long menuId;
    private String title;
    private String description;
    @OneToOne
    @JoinColumn(name = "menu_type_id")
    private MenuType menuType;
    @ManyToMany
    @JoinTable(
        name = "menu_ingredient",
        joinColumns = @JoinColumn(
            name = "menu_id", referencedColumnName = "menuId"
        ),
        inverseJoinColumns = @JoinColumn(
            name = "ingredient_id", referencedColumnName = "ingredientId"
        )
    )
    private List<Ingredient> ingredients;
}
