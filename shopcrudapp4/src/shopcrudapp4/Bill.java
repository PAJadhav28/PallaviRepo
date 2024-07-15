package shopcrudapp4;

import java.io.Serializable;

public class Bill implements Serializable {

	 private int code;
	 private String name;
	 private double price;
	 private int count;
	 private double totalpricefornitems;
	 
	public Bill(Item item, int count) {
		
		this.code = item.getiCode();
		this.name = item.getName();
		this.price = item.getPrice();
		this.count = count;
		
		totalpricefornitems = count * price;
	}

	public void showBillItem() {
		
		System.out.println("Code: "+code+" \t Name: "+name+" \t Price: "+price+" \t count: "+count+" \t totalprice: "+totalpricefornitems);
	}

}
