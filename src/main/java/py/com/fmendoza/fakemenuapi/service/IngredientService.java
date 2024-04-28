package py.com.fmendoza.fakemenuapi.service;

import py.com.fmendoza.fakemenuapi.domain.Ingredient;

import java.util.List;

public interface IngredientService {
    List<Ingredient> getAllIngredient();
    Ingredient saveIngredient(Ingredient ingredient);
}
