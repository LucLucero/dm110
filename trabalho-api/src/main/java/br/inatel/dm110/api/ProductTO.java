package br.inatel.dm110.api;

import java.io.Serializable;

public class ProductTO implements Serializable {

	private static final long serialVersionUID = -5106558229027863908L;

	
	private String productCode;
	private int amountStored;
	private int minimumAmount;
	private String local;
	private int age;
	
		
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getAmountStored() {
		return amountStored;
	}

	public void setAmountStored(int amountStored) {
		this.amountStored = amountStored;
	}

	public int getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(int minimumAmount) {
		this.minimumAmount = minimumAmount;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
}
