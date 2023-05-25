package br.inatel.dm110.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//product code,
//amount stored,
//minimum amount
//location/place,
//age.


@Entity
@Table(name = "Products")
public class Product implements Serializable {

	private static final long serialVersionUID = 3006606601581984848L;

	@Id
	private String productCode;
	private int amountStored;
	private int minimumAmount;
	private String local;
	private int age;
	
	public Product() {
		
	}
	
	public Product(String productCode, int amountStored, int minimumAmount,String local, int age) {
		super();
		this.productCode = productCode;
		this.amountStored = amountStored;
		this.minimumAmount = minimumAmount;
		this.age = age;		
		
	}

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
