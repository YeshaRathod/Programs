package example_2;

public class StoreTest {
       public static void main(String[] args) {
    	   Product pd1 = new Product();
    	   pd1.name	= "Dress";
    	   pd1.price= 1000;
    	   pd1.quantity = 10;
    	     pd1.sell(3);
    	     
    	     Product pd2 = new Product();
      	   pd2.name	= "jeans";
      	   pd2.price= 500;
      	   pd2.quantity = 20;
      	     pd2.sell(5);
      	     
      	     System.out.println("Total sold Out products are : " + Product.getTotalSold());
      	     
      	    }
}

class Product
{
	String name;
	double price;
	int quantity;
	static int totalsold;
	
	void sell(int SoldQuantity)
	{
		if(SoldQuantity <= quantity) {
		    
		    totalsold = totalsold + SoldQuantity ;
		    System.out.println(SoldQuantity + "untis sold out of " + quantity);
		}
	    else {
	    	 System.out.println("Total Quantity : " + quantity);
	         }
     }
		static int getTotalSold()
		{
			return totalsold;
		}
	}

