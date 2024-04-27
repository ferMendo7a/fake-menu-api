package py.com.fmendoza.fakemenuapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import py.com.fmendoza.fakemenuapi.domain.Menu;
import py.com.fmendoza.fakemenuapi.service.MenuService;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    public ResponseEntity<List<Menu>> getMenuList() {
        return ResponseEntity.ok(menuService.getAllMenu());
    }

    @PostMapping
    public ResponseEntity<Menu> saveMenuType(@RequestBody Menu menu) {
        return ResponseEntity.ok(menuService.saveMenu(menu));
    }

}
