package br.inatel.dm110.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import br.inatel.dm110.api.ProductTO;
import br.inatel.dm110.api.StoreService;
import br.inatel.dm110.interfaces.StoreLocal;

@RequestScoped
public class StoreServiceImpl implements StoreService{

	private static Logger log = Logger.getLogger(StoreServiceImpl.class.getName());
	
	@EJB
	private StoreLocal storeBean;
	
	
	@Override
	public void storeNewProduct(ProductTO product) {
		storeBean.storeNewProduct(product);	
	}
	
	
	@Override
	public List<ProductTO> getAllProductCodes() {
		return storeBean.getAllProductCodes();
	}
	
	
	@Override
	public ProductTO getProduct(String productCode) {
			
		return storeBean.getProduct(productCode);
	}

	@Override
	public int getProductAmount(String productCode) {
		
		return storeBean.getProductAmount(productCode);
	}
		

	@Override
	public int getMinimumAmount(String productCode) {
		
		return storeBean.getMinimumAmount(productCode);
	}

	@Override
	public String getLocal(String productCode) {
		
		return storeBean.getLocal(productCode);
	}

	@Override
	public int getAge(String productCode) {
		
		return storeBean.getAge(productCode);
	}
	
	
	

}
