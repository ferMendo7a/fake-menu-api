package py.com.fmendoza.fakemenuapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.com.fmendoza.fakemenuapi.domain.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
