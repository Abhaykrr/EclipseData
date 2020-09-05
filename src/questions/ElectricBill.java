package questions;

import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		
		System.out.println("enter unit consumed");
		Scanner x=new Scanner(System.in);
		double payable;
		int unit =x.nextInt();
		double charge =0 ;
		if(unit<=199) 
			charge=1.2;
		 if(unit>199&&unit<400)
			charge=1.5;
		 if(unit>=400&&unit<600)
				charge=1.8;
		 if(unit>=600)
				charge=2;
		 payable=unit*charge;
		 
		 if(payable<=100)
		 {
			 payable=100;
		 }
		 else if (payable>400)
		 {
			 payable=payable+(15*payable)/100;
		 }
		 
		 System.out.println("payable amount is ruppes"+ payable);
	}
}
