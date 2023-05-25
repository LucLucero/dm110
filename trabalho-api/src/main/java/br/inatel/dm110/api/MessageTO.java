package br.inatel.dm110.api;

import java.io.Serializable;

public class MessageTO implements Serializable {

	private static final long serialVersionUID = -5106558229027863908L;

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	
}
