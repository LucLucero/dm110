package br.inatel.dm110.api;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/store")
public interface StoreService {
	
	@GET
	@Path("/products")
	@Produces(MediaType.APPLICATION_JSON)
	List<ProductTO> getAllProductCodes();
	
	@GET
	@Path("/product/{productCode}")	
	@Produces(MediaType.APPLICATION_JSON)
	public ProductTO getProduct(@PathParam("productCode")String productCode);
	
	@GET
	@Path("/product/amount/{productCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public int getProductAmount(@PathParam("productCode") String productCode);
	
	@GET
	@Path("/product/minimum/{productCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public int getMinimumAmount(@PathParam("productCode") String productCode);
		
	@GET
	@Path("/product/local/{productCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getLocal(@PathParam("productCode") String productCode);
		
	@GET
	@Path("/product/age/{productCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public int getAge(@PathParam("productCode") String productCode);
	
	@POST
	@Path("/product")	
	@Consumes(MediaType.APPLICATION_JSON)
	public void storeNewProduct(ProductTO product);
	
}


