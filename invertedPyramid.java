package com.haktanozgur.invertedPyramid;

import java.util.Scanner;

public class invertedPyramid {
	
	/*pyramid metodu içerisinde, iç içe for döngüleri barındırarak, ters piramiti ekrana yazdırıyor.
	 *İç içe döngüleri kullanma sebebim, value değerine göre her satırın value değeri kadar * yazdırıp
	 diğer satıra geçmesi.
	 *Bu şekilde döngü her satırda value - 2 kadar "*" değerini ekrana yazdırıyor.*/
	public static void pyramid(int value) {
		
		for(int i = value; i >= 1; --i) {
			for(int j = 1; j <= value - i; ++j) {
				System.out.print("  ");
			}
		        for(int k=i; k <= 2 * i - 1; ++k) {
		          System.out.print("* ");
		        }
		      
		        for(int k = 0; k < i - 1; ++k) {
		          System.out.print("* ");
		        }
                System.out.println();
			}	
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Basamak sayısı giriniz...");
		int number = scanner.nextInt();
		pyramid(number);
	}
	

}
