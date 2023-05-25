package br.inatel.dm110.interfaces;

import java.util.List;

import br.inatel.dm110.api.MessageTO;


public interface Store {

	public List<String> getAllProductCodes();
	
	public <Product> Product getProduct(String productCode);
	
	public int getAllProductStored(String productCode); //Integer amountStored
	
	public int getMinimumAmount(String productCode);
	
	public String getLocal(String productCode);
	
	public int getAge(String productCode);
	
	public MessageTO getMessage(Integer id);
	
	public int storeNewMessage(MessageTO message);
	
	public List<MessageTO> getAllMessages();
	
	
}
