package br.inatel.dm110.beans;

import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.dm110.api.MessageTO;
import br.inatel.dm110.entities.Product;
import br.inatel.dm110.interfaces.StoreLocal;



@Stateless
@Local(StoreLocal.class)
public class StoreBean implements StoreLocal {
	
	private static Logger log = Logger.getLogger(StoreBean.class.getName());

	@Override
	public List<String> getAllProductCodes() {
		log.info("StoreBean has been called");
		log.info("StoreBean ES ESTOU AQUI DENTROOOOOOOO " );
		//query no banco de dados 
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Product getProduct(String productCode) {
		log.info("querying for: " + productCode);
		Product product = null;
		return product; // change to query result product
	}

	@Override
	public int getAllProductStored(String productCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinimumAmount(String productCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getLocal(String productCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAge(String productCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MessageTO getMessage(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int storeNewMessage(MessageTO message) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MessageTO> getAllMessages() {
		// TODO Auto-generated method stub
		return null;
	}

}
