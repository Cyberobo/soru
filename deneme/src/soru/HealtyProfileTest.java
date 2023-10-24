package soru;

import java.util.Scanner;

public class HealtyProfileTest {

	public static void main(String[] args) {
		String firstName,lastName,sex;
		int bornDate,kilo;
		float boy;
		Scanner inputString=new Scanner(System.in);
		Scanner inputInteger=new Scanner(System.in);
		Scanner inputFloat=new Scanner(System.in);
		
		HealtyProfile healtyProfile=new HealtyProfile();
		
		System.out.println("lutfen adinizi ve soyadinizi girin: ");
		firstName=inputString.nextLine();
		lastName=inputString.nextLine();
		
		System.out.println("lutfen cinsiyetinizi girin: ");
		sex=inputInteger.nextLine();
		
		System.out.println("lutfen hangi yilda dogdugunuzu girin: ");
		bornDate=inputInteger.nextInt();
		
		System.out.println("lutfen boyunuzu ve kilonuzu girin: ");
		boy=inputFloat.nextFloat();
		kilo=inputInteger.nextInt();
		
		System.out.println();
		
		healtyProfile.setFirstName(firstName);
		healtyProfile.setLastName(lastName);
		healtyProfile.setSex(sex);
		healtyProfile.setBornDate(bornDate);
		healtyProfile.setBoy(boy);
		healtyProfile.setKilo(kilo);
		
		healtyProfile.show();
		
		System.out.println();
	}

}
