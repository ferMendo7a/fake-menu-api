package py.com.fmendoza.fakemenuapi.service;

import py.com.fmendoza.fakemenuapi.domain.MenuType;

import java.util.List;

public interface MenuTypeService {
    List<MenuType> getAllMenuType();
    MenuType saveMenuType(MenuType menuType);
}
