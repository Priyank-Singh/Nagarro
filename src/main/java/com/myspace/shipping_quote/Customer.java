package com.myspace.shipping_quote;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Customer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.Integer id;
	public Customer() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	public Customer(java.lang.String name, java.lang.Integer id) {
		this.name = name;
		this.id = id;
	}

}