package py.com.fmendoza.fakemenuapi.service;

import py.com.fmendoza.fakemenuapi.domain.PriceTable;

import java.util.List;

public interface PriceTableService {
    List<PriceTable> getAllPriceTable();
    PriceTable savePriceTable(PriceTable priceTable);
}
