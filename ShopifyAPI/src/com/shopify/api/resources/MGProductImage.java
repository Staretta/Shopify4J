/**
* DO NOT MODIFY THIS CODE
* 
* Place all of your changes in ProductImage.java
* 
* It has been machine generated from fixtures and your changes will be
* lost if anything new needs to be added to the API. 
**/
// Last Generated: 2011-08-26T09:50:06-04:00
package com.shopify.api.resources;

import org.codehaus.jackson.annotate.JsonProperty;

/**
* This code has been machine generated by processing the single entry
* fixtures found from the Shopify API Documentation
*/
  
public class MGProductImage extends ShopifyResource {

	@JsonProperty("position")
	private int _position;
	public int getPosition(){ return _position;}
	public void setPosition(int _position){this._position = _position;}

	@JsonProperty("product_id")
	private int _product_id;
	public int getProductId(){ return _product_id;}
	public void setProductId(int _product_id){this._product_id = _product_id;}

	@JsonProperty("src")
	private String _src;
	public String getSrc(){ return _src;}
	public void setSrc(String _src){this._src = _src;}

}