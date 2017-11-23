package com.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.example.exception.InvalidProductException;
import com.example.model.Product;

public class ShoppingService {
	Map<Integer,Product> cart = new HashMap<Integer,Product>();
	
	public void addItem(Product product){
		int pid = product.getId();
		if(cart.containsKey(pid)){
			Product existiProduct = cart.get(pid);
			existiProduct.setQty(existiProduct.getQty()+1);
		}
		else{
		cart.put(pid, product);
		
		}
		
	}
	
	public int countItems(){
		int count =0;
		Collection<Product> products = cart.values();
		for(Product product : products){
			count = count+product.getQty();
		}
		return count;
		
	}

	
	public Collection<Product>  cartDetails(){
	
		
		return cart.values();
		
	}
	public String placeOrders(){
		try{
			TimeUnit.SECONDS.sleep(6);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return "O" +System.nanoTime();
	}
	
	
	public void removeItem(int pid) throws InvalidProductException{
		Product prod=cart.get(pid);
		if(!cart.containsKey(pid)){
			throw new InvalidProductException("Porduct not present in the cart");
		}
		if(prod.getQty()==1){
			cart.remove(pid);
		}
		else{
		prod.setQty(prod.getQty()-1);
		}
		
	}
}
