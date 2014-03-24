package com.jh;

public class eSayisi {

	public double Faktoriyel(double x) {// e sayısı içinde kullanacağımız faktoriyel methodu

		double faktoriyel = 1;
		if (x == 0 || x == 1) {// 0! ve 1! 1'e eşit olduğundan değeri 1 döndürür.
			return 1;
		} else {//Aksi halde aşağıdaki döngüye girer faktöriyeli hesaplar
			for (double i = 2; i <= x; i++) {
				faktoriyel = faktoriyel * i;
			}
		}
		return faktoriyel;//faktoriyeli döndürür.
	}

	public double e1(double x) {// e sayısı için method
		double e = 1;

		for (double i = 1; i <= 10; i++) {// 

			e = e + (Math.pow(x, i) / Faktoriyel(i));

		}
		return e;

	}

	
}
