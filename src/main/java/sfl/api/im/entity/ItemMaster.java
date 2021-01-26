package sfl.api.im.entity;

public class ItemMaster {

	int year;
	int season; 
	String GTIN;
	String SKU;
	String seasonality;
	String seasonalityDesc;	
	String genericArticle;	
	String gender;
	String genderDesc;
	String style;
	String fabric;
	String color;
	String variant;
	String variantType;
	String label;
	String size;
	String SKUDesc;
	String category;
	String categoryDesc;
	String product;
	String productDesc;
	String mdseCat; 	
	String merGrp;	
	String merGrpDesc;	
	String brand;	
	String brandDesc;
	
	
	public ItemMaster(int year, int season, String gTIN, String sKU, String seasonality, String seasonalityDesc,
			String genericArticle, String gender, String genderDesc, String style, String fabric, String color,
			String variant, String variantType, String label, String size, String sKUDesc, String category,
			String categoryDesc, String product, String productDesc, String mdseCat, String merGrp, String merGrpDesc,
			String brand, String brandDesc) {
		super();
		this.year = year;
		this.season = season;
		GTIN = gTIN;
		SKU = sKU;
		this.seasonality = seasonality;
		this.seasonalityDesc = seasonalityDesc;
		this.genericArticle = genericArticle;
		this.gender = gender;
		this.genderDesc = genderDesc;
		this.style = style;
		this.fabric = fabric;
		this.color = color;
		this.variant = variant;
		this.variantType = variantType;
		this.label = label;
		this.size = size;
		SKUDesc = sKUDesc;
		this.category = category;
		this.categoryDesc = categoryDesc;
		this.product = product;
		this.productDesc = productDesc;
		this.mdseCat = mdseCat;
		this.merGrp = merGrp;
		this.merGrpDesc = merGrpDesc;
		this.brand = brand;
		this.brandDesc = brandDesc;
	}



	
	
	public String getSeasonality() {
		return seasonality;
	}





	public void setSeasonality(String seasonality) {
		this.seasonality = seasonality;
	}





	public String getSeasonalityDesc() {
		return seasonalityDesc;
	}





	public void setSeasonalityDesc(String seasonalityDesc) {
		this.seasonalityDesc = seasonalityDesc;
	}





	public int getYear() {
		return year;
	}





	public void setYear(int year) {
		this.year = year;
	}





	public int getSeason() {
		return season;
	}





	public void setSeason(int season) {
		this.season = season;
	}





	public String getGenericArticle() {
		return genericArticle;
	}





	public void setGenericArticle(String genericArticle) {
		this.genericArticle = genericArticle;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getGenderDesc() {
		return genderDesc;
	}





	public void setGenderDesc(String genderDesc) {
		this.genderDesc = genderDesc;
	}





	public String getStyle() {
		return style;
	}





	public void setStyle(String style) {
		this.style = style;
	}





	public String getFabric() {
		return fabric;
	}





	public void setFabric(String fabric) {
		this.fabric = fabric;
	}





	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public String getVariant() {
		return variant;
	}





	public void setVariant(String variant) {
		this.variant = variant;
	}





	public String getVariantType() {
		return variantType;
	}





	public void setVariantType(String variantType) {
		this.variantType = variantType;
	}





	public String getLabel() {
		return label;
	}





	public void setLabel(String label) {
		this.label = label;
	}





	public String getSize() {
		return size;
	}





	public void setSize(String size) {
		this.size = size;
	}





	public String getSKU() {
		return SKU;
	}





	public void setSKU(String sKU) {
		SKU = sKU;
	}





	public String getSKUDesc() {
		return SKUDesc;
	}





	public void setSKUDesc(String sKUDesc) {
		SKUDesc = sKUDesc;
	}





	public String getGTIN() {
		return GTIN;
	}





	public void setGTIN(String gTIN) {
		GTIN = gTIN;
	}





	public String getCategory() {
		return category;
	}





	public void setCategory(String category) {
		this.category = category;
	}





	public String getCategoryDesc() {
		return categoryDesc;
	}





	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}





	public String getProduct() {
		return product;
	}





	public void setProduct(String product) {
		this.product = product;
	}





	public String getProductDesc() {
		return productDesc;
	}





	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}





	public String getMdseCat() {
		return mdseCat;
	}





	public void setMdseCat(String mdseCat) {
		this.mdseCat = mdseCat;
	}





	public String getMerGrp() {
		return merGrp;
	}





	public void setMerGrp(String merGrp) {
		this.merGrp = merGrp;
	}





	public String getMerGrpDesc() {
		return merGrpDesc;
	}





	public void setMerGrpDesc(String merGrpDesc) {
		this.merGrpDesc = merGrpDesc;
	}





	public String getBrand() {
		return brand;
	}





	public void setBrand(String brand) {
		this.brand = brand;
	}





	public String getBrandDesc() {
		return brandDesc;
	}





	public void setBrandDesc(String brandDesc) {
		this.brandDesc = brandDesc;
	}





	@Override
	public String toString() {
		return "ItemMaster [seasonality=" + seasonality + ", seasonalityDesc=" + seasonalityDesc + ", year=" + year
				+ ", season=" + season + ", genericArticle=" + genericArticle + ", gender=" + gender + ", genderDesc="
				+ genderDesc + ", style=" + style + ", fabric=" + fabric + ", color=" + color + ", variant=" + variant
				+ ", variantType=" + variantType + ", label=" + label + ", size=" + size + ", SKU=" + SKU
				+ ", SKUDesc=" + SKUDesc + ", GTIN=" + GTIN + ", category=" + category + ", categoryDesc="
				+ categoryDesc + ", product=" + product + ", productDesc=" + productDesc + ", mdseCat=" + mdseCat
				+ ", merGrp=" + merGrp + ", merGrpDesc=" + merGrpDesc + ", brand=" + brand + ", brandDesc=" + brandDesc
				+ "]";
	}
	
}
