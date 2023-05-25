package br.inatel.dm110.api;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.inatel.dm110.interfaces.Store;


@Path("/store")
public interface StoreService {
	
	@GET
	@Path("/products")
	@Produces(MediaType.TEXT_HTML)
	List<String> getAllProductCodes();
	
	@GET
	@Path("/product/{productCode}")
	@Produces(MediaType.TEXT_HTML)
	<Product> Product getProduct(String productCode);
	
	@GET
	@Path("/product/amount/{productCode}")
	@Produces(MediaType.TEXT_HTML)
	int getAllProductStored(@PathParam("productCode") String productCode);
	
	@GET
	@Path("/product/minimum/{productCode}")
	@Produces(MediaType.TEXT_HTML)
	int getMinimumAmount(@PathParam("productCode") String productCode);
		
	@GET
	@Path("/product/local/{productCode}")
	@Produces(MediaType.TEXT_HTML)
	String getLocal(@PathParam("productCode") String productCode);
		
	@GET
	@Path("/product/age/{productCode}")
	@Produces(MediaType.TEXT_HTML)
	int getAge(@PathParam("productCode") String productCode);
	
	@POST
	@Path("/product/newProduct")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	<Product> Product createNewProduct(Product product);
		
	@GET
	@Path("/message/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	Response getMessage(@PathParam("id") Integer id);
		
	@POST
	@Path("/message")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	Response storeNewMessage(MessageTO message);
	
	@GET
	@Path("/messages")
	@Produces(MediaType.APPLICATION_JSON)
	Response getAllMessages();

	
	
	
	
}


