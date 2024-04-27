package py.com.fmendoza.fakemenuapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.com.fmendoza.fakemenuapi.domain.MenuType;

public interface MenuTypeRepository extends JpaRepository<MenuType, Long> {
}
