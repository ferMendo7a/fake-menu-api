package py.com.fmendoza.fakemenuapi.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Ingredient {
    @Id
    @SequenceGenerator(name = "ingredient_seq", sequenceName = "ingredient_ingredient_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingredient_seq")
    private Long ingredientId;
    private String name;
}
