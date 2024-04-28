package py.com.fmendoza.fakemenuapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.com.fmendoza.fakemenuapi.domain.MenuType;
import py.com.fmendoza.fakemenuapi.repository.MenuTypeRepository;
import py.com.fmendoza.fakemenuapi.service.MenuTypeService;

import java.util.List;

@Service
public class MenuTypeServiceImpl implements MenuTypeService {

    private final MenuTypeRepository menuTypeRepository;

    @Autowired
    public MenuTypeServiceImpl(MenuTypeRepository menuTypeRepository) {
        this.menuTypeRepository = menuTypeRepository;
    }

    @Override
    public List<MenuType> getAllMenuType() {
        return menuTypeRepository.findAll();
    }

    @Override
    public MenuType saveMenuType(MenuType menuType) {
        return menuTypeRepository.save(menuType);
    }

}
