public class ProductDetails{
	public static void main(String args[]){

		String name= "LAPTOP";
		int  price= 1000;
		int discount =((price*10)/100);
		String brandname="ASUS";
		int gst =10;
		int donation=10;
		int deliveryfees=10;
		int platformfees=10;
		int total=price - discount + gst + donation + deliveryfees + platformfees;
		System.out.println("The total payable amount is :"+ total);
        int totalwithoutgst=price - discount - gst  + donation + deliveryfees + platformfees;
        System.out.println("The total payable amount is :"+ totalwithoutgst);
        System.out.println("The actual payable amount is : " + price);
	}
}