package com.jh;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class MyDateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean cont;
		MyDate dt1 = new MyDate();
		MyDate dt2 = new MyDate();
		Scanner input = new Scanner(System.in);
		try {// try-catch yapısı sayı değerlerinin dışında bir ifade girildiğinde uyarı verir.
			System.out.print("Gün1:");//
			dt1.setDay(input.nextInt());//ilk girilen tarihin gününü alır.
			System.out.print("Ay1:");
			dt1.setMonth(input.nextInt());//ilk girilen tarihin ayını alır.
			System.out.print("Yıl1:");
			dt1.setYear(input.nextInt());//ilk girilen tarihin yılını alır.
			System.out.println(dt1.getDate());// 1.tarihi yazdırır.
			System.out.print("Gün2:");
			dt2.setDay(input.nextInt());//ikinci girilen tarihin gününü alır.
			System.out.print("Ay2:");
			dt2.setMonth(input.nextInt());//ikinci girilen tarihin ayını alır.
			System.out.print("Yıl2:");
			dt2.setYear(input.nextInt());//ikinci girilen tarihin yılını alır.
			System.out.println(dt2.getDate());// 2.tarihi yazdırır.
		} catch (Exception e) {
			System.out.println("Yanlış bir tuşa bastınız");
			MyDateTest.main(args);//yanlış tuşa basıldığında tekrar döner.
		}

		cont = MyDate.isBigger(dt1, dt2);//Karşılaştırma methodu
		if (cont == true) {
			System.out.println("Birinci tarih ikinci tarihten büyüktür");
		} 
		 else {
			System.out.println("Birinici tarih ikinci tarihten küçüktür");
		}

	}

}