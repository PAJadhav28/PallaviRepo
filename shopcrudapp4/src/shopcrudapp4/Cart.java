package shopcrudapp4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable{

	List<Bill> list = new ArrayList<>();
	
	public void showBills() {
		
		for(int i=0 ; i<list.size() ; i++)
		{
			list.get(i).showBillItem();
		}
		
	}

	public void addItem(Bill bill) {
		
		list.add(bill);
		
	}

}
