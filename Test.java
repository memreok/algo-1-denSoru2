package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//dizi uzunluğu alma
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç tane değer gireceğinizi belirtin: ");
		int dizinin_uzunlugu=scanner.nextInt();
		int[] sayilar=new int[dizinin_uzunlugu];
		//dizi eleamnlarını alma 
		for(int i=0;i<dizinin_uzunlugu;i++) {
			System.out.print("Dizinin "+i+". indeks değerini giriniz: ");
			sayilar[i]=scanner.nextInt();
		}
		//sayılar dizininin içinde gezme
		for (int i : sayilar) {
			tek_mi_cift_mi(i);
		}
	}
	public static void tek_mi_cift_mi(int sayi) { //tek mi çiftliği bulma
		if (sayi%2==0) {
			System.out.println("Sayı: "+sayi+" çifttir!");
		}else {
			System.out.println("Sayı: "+sayi+" tektir!");
		}
	}
}