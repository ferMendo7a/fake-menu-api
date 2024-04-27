package py.com.fmendoza.fakemenuapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import py.com.fmendoza.fakemenuapi.domain.PriceTable;
import py.com.fmendoza.fakemenuapi.service.PriceTableService;

import java.util.List;

@RestController
@RequestMapping("/price-table")
public class PriceTableController {

    private final PriceTableService priceTableService;

    @Autowired
    public PriceTableController(PriceTableService priceTableService) {
        this.priceTableService = priceTableService;
    }

    @GetMapping
    public ResponseEntity<List<PriceTable>> getPriceTableList() {
        return ResponseEntity.ok(priceTableService.getAllPriceTable());
    }

    @PostMapping
    public ResponseEntity<PriceTable> savePriceTable(@RequestBody PriceTable priceTable) {
        return ResponseEntity.ok(priceTableService.savePriceTable(priceTable));
    }

}
