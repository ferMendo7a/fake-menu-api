package py.com.fmendoza.fakemenuapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.com.fmendoza.fakemenuapi.domain.Menu;
import py.com.fmendoza.fakemenuapi.repository.MenuRepository;
import py.com.fmendoza.fakemenuapi.service.MenuService;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public List<Menu> getAllMenu() {
        return menuRepository.findAll();
    }

    @Override
    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }
}
