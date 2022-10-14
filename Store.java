package storage;

import java.util.ArrayList;

public class Store {
	private ArrayList<Products> productList = new ArrayList<Products>();
	
	public void addProduct(Products product) {
		this.productList.add(product);
	}
	
	public void putProductsIn() {
		for (Products p: this.productList) {
			System.out.println(p.toString());		
		}
	}
	
	public Products searchCode (int code) {
		for (Products p: this.productList) {
			
			if (p.getCode() == code) {
				return p;
				
			}
			
		}
		return null;
	}
}
