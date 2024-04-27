package py.com.fmendoza.fakemenuapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.com.fmendoza.fakemenuapi.domain.PriceTable;

public interface PriceTableRepository extends JpaRepository<PriceTable, Long> {
}
