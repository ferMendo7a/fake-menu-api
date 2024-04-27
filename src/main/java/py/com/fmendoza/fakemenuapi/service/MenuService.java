package py.com.fmendoza.fakemenuapi.service;

import py.com.fmendoza.fakemenuapi.domain.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getAllMenu();
    Menu saveMenu(Menu menu);
}
