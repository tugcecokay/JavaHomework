package com.jh;

public class Pi {
	
	public double Pi(){// bu method adım sayısı 200000 olan pi sayısının değerini bulur.
		double pi=0;
		int sayac=0;
		
		for(double y1=1; y1<=200000; y1+=4 ){
			pi= pi+((4/y1)-(4/(y1+2)));

		}
		++sayac;
		System.out.println("Sayac : "+sayac);
		return pi;

	}
	public double Pi2(){// method 3,14159 şeklinde pi sayısını bulur
		double pi=0;
		int sayac=0;
		
		for(double y1=1; y1<=900000; y1+=4 ){
			pi= pi+((4/y1)-(4/(y1+2)));

		}
		System.out.println("Adım sayımız  : 900000");
		return pi;

	}

}
