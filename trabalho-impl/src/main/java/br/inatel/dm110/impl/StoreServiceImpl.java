package br.inatel.dm110.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ws.rs.core.Response;

import br.inatel.dm110.api.MessageTO;
import br.inatel.dm110.api.StoreService;
import br.inatel.dm110.entities.Product;
import br.inatel.dm110.interfaces.StoreLocal;

public class StoreServiceImpl implements StoreService{

	private static Logger log = Logger.getLogger(StoreServiceImpl.class.getName());
	
	@EJB
	private StoreLocal storeBean;
	
	
	
	@Override
	public List<String> getAllProductCodes() {
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Product getProduct(String productCode) {
		log.info("Product is: ");	
		return null;
	}

	@Override
	public int getAllProductStored(String productCode) {
		
		return 0;
	}
	
	
	@SuppressWarnings("hiding")
	@Override
	public <Product> Product createNewProduct(Product product) {
		
		return null;
	}

	@Override
	public int getMinimumAmount(String productCode) {
		
		return 0;
	}

	@Override
	public String getLocal(String productCode) {
		
		return null;
	}

	@Override
	public int getAge(String productCode) {
		
		return 0;
	}


	@Override
	public Response getMessage(Integer id) {
		
		return null;
	}

	@Override
	public Response storeNewMessage(MessageTO message) {
		
		return null;
	}

	@Override
	public Response getAllMessages() {
		
		return null;
	}



	

}
