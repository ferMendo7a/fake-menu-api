package py.com.fmendoza.fakemenuapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.com.fmendoza.fakemenuapi.domain.Ingredient;
import py.com.fmendoza.fakemenuapi.repository.IngredientRepository;
import py.com.fmendoza.fakemenuapi.service.IngredientService;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<Ingredient> getAllIngredient() {
        return ingredientRepository.findAll();
    }

    @Override
    public Ingredient saveIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }
}
