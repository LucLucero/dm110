package br.inatel.dm110.interfaces;

import java.util.List;

import br.inatel.dm110.api.ProductTO;


public interface Store {

	public List<ProductTO> getAllProductCodes();
	
	public ProductTO getProduct(String productCode);
	
	public int getProductAmount(String productCode); 
	
	public int getMinimumAmount(String productCode);
	
	public String getLocal(String productCode);
	
	public int getAge(String productCode);
	
	public void storeNewProduct(ProductTO product); 
	
	
}
