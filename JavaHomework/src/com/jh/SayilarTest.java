package com.jh;

import java.util.Scanner;

public class SayilarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int secim;
			System.out.println("1-Pi sayısı sorusu için\n2- e sayısı sorusu için\n\n");
			System.out.print("Seçiminiz : ");	
			secim=input.nextInt();
			
			if(secim==1){//seçim 1 olması halinde aşağıdaki menü ekrana gelir
				int s;
				Pi pisayisi = new Pi();
				System.out.println("1-200000. adımdaki pi sayisi için\n2- 3,14159 ile başlayan sayıyı ve adım sayısını görmek için");
				System.out.println("Seçiminiz : ");
				s=input.nextInt();
				if (s==1) {//Kullanıcının 1i seçmesi halinde
					System.out.println("Pi sayımız : " + pisayisi.Pi());// pi sayısı methodu çağırılarak yazdırılır
				}
				else if (s==2) {//2 seçilmesi halinde
					System.out.println("Pi sayımız : " + pisayisi.Pi2());//pi2 methodu çağırılarak yazdırılır.
					
				} 
				else {
					System.err.println("Yanlış seçim");
					main(args);//menüye tekrar döner
				}
			}
			else if(secim==2){// seçimin 2 olması durumundaysa e sayısı için ekran gelir.
				eSayisi e = new eSayisi();
				int adim;
				System.out.println("e sayısının adım sayısını giriniz : ");
				adim= input.nextInt();
				System.out.println(e.e1(adim));
			}
			else{
				System.err.println("Yanlış seçim");
				main(args);
			}

	}

}
