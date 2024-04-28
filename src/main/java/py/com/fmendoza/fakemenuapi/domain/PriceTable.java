package py.com.fmendoza.fakemenuapi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class PriceTable {
    @Id
    @SequenceGenerator(name = "price_seq", sequenceName = "price_table_price_table_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "price_seq")
    private Long priceTableId;
    @OneToOne
    @JoinColumn(name = "menu_id", referencedColumnName = "menuId")
    private Menu menu;
    private BigDecimal price;
    private String currency;
    private LocalDate validityDate;
}
