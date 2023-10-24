package soru;

import java.util.Scanner;

public class HeartRateTest {

	public static void main(String[] args) {
		String firstName,lastName;
		int bornDate;
		
		Scanner inputString=new Scanner(System.in);
		Scanner inputInteger=new Scanner(System.in);
		
		HeartRate h1=new HeartRate();
		
		
		System.out.println("lutfen adinizi ve soyadinizi girin: ");
		firstName=inputString.nextLine();
		lastName=inputString.nextLine();
		
		System.out.println("lutfen hangi yilda dogdugunuzu girin: ");
		bornDate=inputInteger.nextInt();
		
		h1.setFirstName(firstName);
		h1.setLastName(lastName);
		h1.setBornDate(bornDate);
		
		System.out.println();
		
		h1.show();
		
		
	}

}
