package sfl.api.im.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sfl.api.im.entity.ItemMaster;

@Repository
public class JdbcItemMasterRepository implements IItemMaster {
    // Spring Boot will create and configure DataSource and JdbcTemplate
    // To use it, just @Autowired
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return jdbcTemplate
                .queryForObject("select count(*) from Items", Integer.class);
    }

	@Override
	public int save(ItemMaster itm) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ItemMaster itm) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBySKU(String SKU) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Object> findAll(int page,int itemsPerPage,String tableFilter) {
		return jdbcTemplate.query(
				"select Year,Season,GTIN,SKU,seasonality,seasonality_desc,generic_article,gender,gender_Desc,style,fabric,color,variant,variant_type,label,size,SKU_Desc,category,"
				+ "category_Desc,product, product_Desc,mdse_Cat,mer_Grp,mer_grp_Desc,brand,brand_desc from Items "
				+ "WHERE CONCAT(SKU_Desc,brand_desc,category_Desc) like '%"+tableFilter+"%'"
				+ "LIMIT "+(page-1)*itemsPerPage+","+itemsPerPage,
                (rs, rowNum) ->
                        new ItemMaster(
                             rs.getInt("Year"),
           			         rs.getInt("Season"),
           			         rs.getString("GTIN"),
           			         rs.getString("SKU"),
           			         rs.getString("seasonality"),
           			         rs.getString("seasonality_desc"),
           			         rs.getString("generic_article"), 
           			         rs.getString("gender"),
           			         rs.getString("gender_Desc"), 
           			         rs.getString("style"),
           			         rs.getString("fabric"), 
           			         rs.getString("color"),
           			         rs.getString("variant"),
           			         rs.getString("variant_Type"), 
           			         rs.getString("label"),
           			         rs.getString("size"),
           			         rs.getString("SKU_Desc"), 
           			         rs.getString("category"),
		           			 rs.getString("category_Desc"), 
		           			 rs.getString("product"),
		           			 rs.getString("product_Desc"),
		           			 rs.getString("mdse_Cat"), 
		           			 rs.getString("mer_Grp"),
		           			 rs.getString("mer_Grp_Desc"),
		           			 rs.getString("brand"),
		           			 rs.getString("brand_Desc")
                        		)
        );
		
	}

	@Override
	public List<ItemMaster> findBySKU(String SKU) {
		return jdbcTemplate.query(
				"select Year,Season,GTIN,SKU,seasonality,seasonality_desc,generic_article,gender,gender_Desc,style,fabric,color,variant,variant_type,label,size,SKU_Desc,category,"
				+ "category_Desc,product, product_Desc,mdse_Cat,mer_Grp,mer_grp_Desc,brand,brand_desc from Items "
				+ "WHERE SKU='"+SKU+"'",
                (rs, RowNum) ->
                        new ItemMaster(
                             rs.getInt("Year"),
           			         rs.getInt("Season"),
           			         rs.getString("GTIN"),
           			         rs.getString("SKU"),
           			         rs.getString("seasonality"),
           			         rs.getString("seasonality_desc"),
           			         rs.getString("generic_article"), 
           			         rs.getString("gender"),
           			         rs.getString("gender_Desc"), 
           			         rs.getString("style"),
           			         rs.getString("fabric"), 
           			         rs.getString("color"),
           			         rs.getString("variant"),
           			         rs.getString("variant_Type"), 
           			         rs.getString("label"),
           			         rs.getString("size"),
           			         rs.getString("SKU_Desc"), 
           			         rs.getString("category"),
		           			 rs.getString("category_Desc"), 
		           			 rs.getString("product"),
		           			 rs.getString("product_Desc"),
		           			 rs.getString("mdse_Cat"), 
		           			 rs.getString("mer_Grp"),
		           			 rs.getString("mer_Grp_Desc"),
		           			 rs.getString("brand"),
		           			 rs.getString("brand_Desc")
                        		)
        );
	}

	@Override
	public Optional<ItemMaster> findByGTIN(String GTIN) {
		// TODO Auto-generated method stub
		return null;
	}
}
