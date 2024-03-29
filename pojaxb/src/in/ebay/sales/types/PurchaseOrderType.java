//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.09 at 09:20:05 AM IST 
//

package in.ebay.sales.types;

import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import in.ebay.sales.types.OrderItemsType;
import in.ebay.sales.types.PurchaseOrderType;
import in.ebay.sales.types.ShippingAddressType;

/**
 * <p>
 * Java class for purchaseOrderType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderItems" type="{http://ebay.in/sales/types}orderItemsType"/>
 *         &lt;choice>
 *           &lt;element name="shippingAddress" type="{http://ebay.in/sales/types}shippingAddressType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(AccessType.FIELD)
@XmlType(name = "purchaseOrderType", propOrder = { "orderItems",
		"shippingAddress" })
@XmlRootElement(name="purchaseOrder", namespace="http://ebay.in/sales/types")
public class PurchaseOrderType {

	@XmlElement(namespace = "http://ebay.in/sales/types")
	protected OrderItemsType orderItems;
	@XmlElement(namespace = "http://ebay.in/sales/types")
	protected ShippingAddressType shippingAddress;

	/**
	 * Gets the value of the orderItems property.
	 * 
	 * @return possible object is {@link OrderItemsType }
	 * 
	 */
	public OrderItemsType getOrderItems() {
		return orderItems;
	}

	/**
	 * Sets the value of the orderItems property.
	 * 
	 * @param value
	 *            allowed object is {@link OrderItemsType }
	 * 
	 */
	public void setOrderItems(OrderItemsType value) {
		this.orderItems = value;
	}

	/**
	 * Gets the value of the shippingAddress property.
	 * 
	 * @return possible object is {@link ShippingAddressType }
	 * 
	 */
	public ShippingAddressType getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * Sets the value of the shippingAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link ShippingAddressType }
	 * 
	 */
	public void setShippingAddress(ShippingAddressType value) {
		this.shippingAddress = value;
	}

}
