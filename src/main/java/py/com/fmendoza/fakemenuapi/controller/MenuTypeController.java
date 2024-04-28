package py.com.fmendoza.fakemenuapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import py.com.fmendoza.fakemenuapi.domain.MenuType;
import py.com.fmendoza.fakemenuapi.service.MenuTypeService;

import java.util.List;

@RestController
@RequestMapping("/menu-type")
public class MenuTypeController {

    private final MenuTypeService menuTypeService;

    @Autowired
    public MenuTypeController(MenuTypeService menuTypeService) {
        this.menuTypeService = menuTypeService;
    }

    @GetMapping
    public ResponseEntity<List<MenuType>> getMenuTypeList() {
        return ResponseEntity.ok(menuTypeService.getAllMenuType());
    }

    @PostMapping
    public ResponseEntity<MenuType> saveMenuType(@RequestBody MenuType menuType) {
        return ResponseEntity.ok(menuTypeService.saveMenuType(menuType));
    }

}
