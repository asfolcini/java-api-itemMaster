package sfl.api.im.controller;



import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sfl.api.im.repository.JdbcItemMasterRepository;



@RestController
@RequestMapping("/v1/im")
public class APIItemMasterController {
	
	private static final Logger log =LoggerFactory.getLogger(APIItemMasterController.class);

	@Autowired
	JdbcItemMasterRepository imRepo;
	
	@GetMapping    
	public Object getAll(@RequestParam Map<String,String> params) {	
		String page = params.get("page");
		String itemsPerPage = params.get("itemsPerPage");
		String tableFilter = params.get("tableFilterValue");
		if (itemsPerPage==null)
			itemsPerPage = "5";
		if (page==null)
			page = "1";
		return imRepo.findAll(Integer.valueOf(page), Integer.valueOf(itemsPerPage),tableFilter);
	}


	@GetMapping("/sku/{sku}")
	public Object getItemBySKU(@PathVariable("sku") String sku) {
		return imRepo.findBySKU(sku);
	}
	
	@GetMapping("/gtin/{gtin}")
	public Object getItemByGTIN(@PathVariable("gtin") String gtin) {
		return imRepo.findByGTIN(gtin);
	}
}
