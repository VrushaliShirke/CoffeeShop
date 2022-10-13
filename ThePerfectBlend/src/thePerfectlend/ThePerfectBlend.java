package thePerfectlend;
import java.util.*;

class Invoice{
	String name;
	int quantity;
	int price;
	Invoice(String name,int quantity,int price){
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	public String toString() {
		return name+"           "+quantity+"             "+price+"             "+ (quantity*price);
	}
}
interface Menu{
	abstract void myMenu();
}
 class OurMenu implements Menu{
	public void myMenu(){
	System.out.println("***************************************** Menu Card ***************************************");
	System.out.println();
	System.out.println("  Hot Coffee"+"                     "+"Cold Coffee"+"               "+"Expresso"+"                 "+"Quick Bite");
	System.out.println("1.Hot Coffee-50 Rs"+"           "+"1.Iced Coffee-50 Rs"+"      "+"1.Cafe Americano-100 Rs"+"     "+"1.Carrot Cake-50 Rs");
	System.out.println("2.Caramel Macchiato-100 Rs"+"   "+"2.Clod Brew-50 Rs"+"        "+"2.Cloud Macchiato-150 Rs"+"    "+"2.Chocolate Cockies-150 Rs");
	
	}



class Welcome extends OurMenu{
	
	private void Welcome() {
		System.out.println("---* Welcome in The Perfect Blend *---");
		System.out.println();
	}
}

public class ThePerfectBlend {

	final static String name="The Perfect Blend";
	final static String openTiming= "8 AM to 8PM";
	final static String address="Swargate, Pune";
	
	public static void main(String[] args) {
		
		Invoice in[]=new Invoice[5];
		Scanner sc=new Scanner(System.in);	
		new OurMenu().myMenu();
		int count=0, totalAmount=0;
		for(int i=0;i<in.length;i++) {
			
			System.out.println("Enetr the coffee name:");
			sc.nextLine();
			String cname=sc.nextLine();
			
			System.out.println("Enter the qauntity");
			int cquantity= sc.nextInt();
			System.out.println("Eneter the price");
			int cprice= sc.nextInt();
			count++;
			in[i]= new Invoice(cname,cquantity,cprice);
			totalAmount= totalAmount+(cquantity*cprice);
			
		}
		
		System.out.println("                          YOUR BILL                         ");
		System.out.println("Date: / / ");
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Menu"+"            "+"Quantity"+"        "+"Price/Item"+"        "+"Total");
		System.out.println("--------------------------------------------------------------------------------------");
		for(Invoice s:in) {
			System.out.println(s);
			
		}
		System.out.println(" -------------------------------------------------------------------------------------");
		System.out.println("                                       Total Bill: "+totalAmount);
		
		System.out.println("-----------------------------------Thank You-----------------------------------------");
		System.out.println("                               Please Visit Again                             ");

	}
}
}
