package sfl.api.im.repository;

import java.util.List;
import java.util.Optional;

import sfl.api.im.entity.ItemMaster;

public interface IItemMaster {

	    int count();

	    int save(ItemMaster itm);

	    int update(ItemMaster itm);

	    int deleteBySKU(String SKU);

	    List<Object> findAll(int page, int itemsperpage,String tableFilter);

	    List<ItemMaster> findBySKU(String SKU);
	    
	    List<ItemMaster> findByGTIN(String GTIN);

}
