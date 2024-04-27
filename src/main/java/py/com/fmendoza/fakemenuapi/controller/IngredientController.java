package py.com.fmendoza.fakemenuapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import py.com.fmendoza.fakemenuapi.domain.Ingredient;
import py.com.fmendoza.fakemenuapi.service.IngredientService;

import java.util.List;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private final IngredientService ingredientService;

    @Autowired
    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping
    public ResponseEntity<List<Ingredient>> getIngredientList() {
        return ResponseEntity.ok(ingredientService.getAllIngredient());
    }

    @PostMapping
    public ResponseEntity<Ingredient> saveIngredient(@RequestBody Ingredient ingredient) {
        return ResponseEntity.ok(ingredientService.saveIngredient(ingredient));
    }

}
