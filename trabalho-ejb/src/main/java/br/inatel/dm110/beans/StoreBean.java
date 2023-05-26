package br.inatel.dm110.beans;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.inatel.dm110.api.ProductTO;
import br.inatel.dm110.entities.Product;
import br.inatel.dm110.interfaces.StoreLocal;



@Stateless
@Local(StoreLocal.class)
public class StoreBean implements StoreLocal {
	
	private static Logger log = Logger.getLogger(StoreBean.class.getName());
	
	
	@PersistenceContext(unitName = "trabalho_dm110_pu")
	private EntityManager em;
	
	
	@Override
	public void storeNewProduct(ProductTO product) {
		log.info("Salving product: " + product.getProductCode());
		Product entity = new Product(product.getProductCode(), product.getAmountStored(), product.getMinimumAmount(), product.getLocal(), product.getAge());
		em.persist(entity);
	}
				
	
	@Override
	public List<ProductTO> getAllProductCodes() {
		log.info("StoreBean has been called");
		log.info("Searching for all products: ");
		TypedQuery<Product> query = em.createQuery("from Product p", Product.class);
		
		return toCollectionAPIModel(query.getResultList());		
		
	}
	
	private List<ProductTO> toCollectionAPIModel(List<Product> productList) {
		return productList.stream().map(StoreBean::toProductTO).collect(Collectors.toList());
		
	}


	@Override
	public ProductTO getProduct(String productCode) {		
	    log.info("Searching for product with productCode: " + productCode);
	    TypedQuery<Product> query = em.createQuery("SELECT p FROM Product p WHERE p.productCode = :productCode", Product.class);
	    query.setParameter("productCode", productCode);
	    List<Product> productList = query.getResultList();
	    
	    if (productList.isEmpty()) {
	        return null; 
	    }
	    
	    Product product = productList.get(0); 
	    
	    return toProductTO(product);
	}


	@Override
	public int getProductAmount(String productCode) {
	    log.info("Searching for Product Amount in Storage, Code Searched: " + productCode);
	    TypedQuery<Integer> query = em.createQuery("SELECT p.amountStored FROM Product p WHERE p.productCode = :productCode", Integer.class);
	    query.setParameter("productCode", productCode);
	    List<Integer> amountList = query.getResultList();
	    if (amountList.isEmpty()) {
	        return 0;
	    }
	    
	    return amountList.get(0);
	}

	@Override
	public int getMinimumAmount(String productCode) {
		log.info("Searching for Minimum Amount in Storage, Code Searched: " + productCode);
	    TypedQuery<Integer> query = em.createQuery("SELECT p.minimumAmount FROM Product p WHERE p.productCode = :productCode", Integer.class);
	    query.setParameter("productCode", productCode);
	    List<Integer> minList = query.getResultList();
	    if (minList.isEmpty()) {
	        return 0;
	    }
	    
	    return minList.get(0);
	}
		

	@Override
	public String getLocal(String productCode) {
		log.info("Searching for Local in Storage, Code Searched: " + productCode);
	    TypedQuery<String> query = em.createQuery("SELECT p.local FROM Product p WHERE p.productCode = :productCode", String.class);
	    query.setParameter("productCode", productCode);
	    List<String> LocalList = query.getResultList();
	    if (LocalList.isEmpty()) {
	        return "We couldn´t find your item";
	    }
	    
	    return LocalList.get(0);
	}

	@Override
	public int getAge(String productCode) {
		log.info("Searching for How long this product has been stashed, Code Searched: " + productCode);
	    TypedQuery<Integer> query = em.createQuery("SELECT p.age FROM Product p WHERE p.productCode = :productCode", Integer.class);
	    query.setParameter("productCode", productCode);
	    List<Integer> ageList = query.getResultList();
	    if (ageList.isEmpty()) {
	    	log.info("We couldn´t determine how long this item has been stashed");
	        return 0;
	    }
	    
	    return ageList.get(0);
	}
			
	public static ProductTO toProductTO(Product product) {
		ProductTO to = new ProductTO();
		to.setProductCode(product.getProductCode());
		to.setAmountStored(product.getAmountStored());
		to.setMinimumAmount(product.getMinimumAmount());
		to.setLocal(product.getLocal());
		to.setAge(product.getAge());		
		return to;
	}
	
	

		

}
