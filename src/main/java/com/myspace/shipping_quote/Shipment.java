package com.myspace.shipping_quote;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Shipment implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer distance;
	private java.lang.String from;
	private java.lang.Integer id;
	private java.lang.String to;
	private java.lang.Boolean usesCustoms;
	private java.lang.String address;

	private java.lang.String address;

	public Shipment() {
	}

	public java.lang.Integer getDistance() {
		return this.distance;
	}

	public void setDistance(java.lang.Integer distance) {
		this.distance = distance;
	}

	public java.lang.String getFrom() {
		return this.from;
	}

	public void setFrom(java.lang.String from) {
		this.from = from;
	}
	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getTo() {
		return this.to;
	}

	public void setTo(java.lang.String to) {
		this.to = to;
	}

	public java.lang.Boolean getUsesCustoms() {
		return this.usesCustoms;
	}

	public void setUsesCustoms(java.lang.Boolean usesCustoms) {
		this.usesCustoms = usesCustoms;
	}

	@Override
	public String toString() {
		return "{" + " id='" + getId() + "'" + ", from='" + getFrom() + "'"
				+ ", to='" + getTo() + "'" + ", distance='" + getDistance()
				+ "'" + ", usesCustoms='" + getUsesCustoms() + "'" + "}";
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public Shipment(java.lang.Integer distance, java.lang.String from,
			java.lang.Integer id, java.lang.String to,
			java.lang.Boolean usesCustoms, java.lang.String address) {
		this.distance = distance;
		this.from = from;
		this.id = id;
		this.to = to;
		this.usesCustoms = usesCustoms;
		this.address = address;
	}

}