package py.com.fmendoza.fakemenuapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.com.fmendoza.fakemenuapi.domain.Menu;
import py.com.fmendoza.fakemenuapi.domain.PriceTable;
import py.com.fmendoza.fakemenuapi.repository.MenuRepository;
import py.com.fmendoza.fakemenuapi.repository.PriceTableRepository;
import py.com.fmendoza.fakemenuapi.service.MenuService;
import py.com.fmendoza.fakemenuapi.service.PriceTableService;

import java.util.List;

@Service
public class PriceTableServiceImpl implements PriceTableService {

    private final PriceTableRepository priceTableRepository;

    @Autowired
    public PriceTableServiceImpl(PriceTableRepository priceTableRepository) {
        this.priceTableRepository = priceTableRepository;
    }

    @Override
    public List<PriceTable> getAllPriceTable() {
        return priceTableRepository.findAll();
    }

    @Override
    public PriceTable savePriceTable(PriceTable priceTable) {
        return priceTableRepository.save(priceTable);
    }
}
