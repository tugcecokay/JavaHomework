package com.jh;

import java.util.Scanner;

public class MyDate {

	private String date;
	private int year;
	private int month;
	private int day;
	Scanner input = new Scanner(System.in);

	public String getDate() { 	// örnek olarak 01.01.2013 girilen tarihi 01Ocak2013 şekline dönüştürür.				
		String day = Integer.toString(getDay());//	Gün değerini stringe çeviren method
		String year = Integer.toString(getYear());//Yıl değerini stringe çeviren method
		switch (getMonth()) { // Aylar için girdiğimiz int değerinin string karşılığı için switch-case yapısı
		case 1:
			String m = "Ocak";

			return (day + " " + m + " " + year);

		case 2:
			String m1 = "Şubat";
			return (day + " " + m1 + " " + year);

		case 3:
			String m2 = "Mart";
			return (day + " " + m2 + " " + year);

		case 4:
			String m3 = "Nisan";
			return (day + " " + m3 + " " + year);

		case 5:
			String m4 = "Mayıs";
			return (day + " " + m4 + " " + year);

		case 6:
			String m5 = "Haziran";
			return (day + " " + m5 + " " + year);

		case 7:
			String m6 = "Temmuz";
			return (day + " " + m6 + " " + year);

		case 8:
			String m7 = "Ağustos";
			return (day + " " + m7 + " " + year);

		case 9:
			String m8 = "Eylül";
			return (day + " " + m8 + " " + year);

		case 10:
			String m9 = "Ekim";
			return (day + " " + m9 + " " + year);

		case 11:
			String m10 = "Kasım";
			return (day + " " + m10 + " " + year);

		case 12:
			String m11 = "Aralık";
			return (day + " " + m11 + " " + year);

		default:

		}

		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {// Yıl için 0'dan küçük değerlerin girilmesini engelleyen set methodu 

		if (year < 0) {
			System.err.println("Hatalı tuşlama!");
			year = input.nextInt();
		}
		this.year = year;
	}

	public int getMonth() {

		return month;
	}

	public void setMonth(int month) {// Aylarda 1-12 dışında değer girildiğinde uyarı verir ve değerin tekrar alınmasını sağlar
		this.month = month;
		if (month < 1 || month > 13) {
			System.err.println("Hatalı tuşlama! 1-12 arasında sayı giriniz");
			month = input.nextInt();
		} else {
			this.month = month;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {// Aynı şekilde gün sayısını 1-31 arasında alınmasını sağlar.

		if (day < 1 || day > 31) {
			System.err.println("Hatalı tuşlama! 1-31 arasında sayı giriniz");
			day = input.nextInt();
		} else {
			this.day = day;
		}
	}

	public static boolean isBigger(MyDate x, MyDate y) {// Karşılaştırma methodu

		if (x.getYear() > y.getYear()) {
			return true;
		} else if (x.getYear() == y.getYear() && x.getMonth() > y.getMonth()) {
			return true;
		} else if (x.getYear() == y.getYear() && x.getMonth() == y.getMonth()
				&& x.getDay() > y.getDay()) {
			return true;
		}

		else
			return false;
	}

}
