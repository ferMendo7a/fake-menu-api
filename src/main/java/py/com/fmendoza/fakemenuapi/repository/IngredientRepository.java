package py.com.fmendoza.fakemenuapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.com.fmendoza.fakemenuapi.domain.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
