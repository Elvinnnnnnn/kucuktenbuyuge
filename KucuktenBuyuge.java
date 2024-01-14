package kucuktenBuyuge;

import java.util.Scanner;

public class KucuktenBuyuge {
	
	static int a, b, c, d;

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. sayıyı giriniz : ");
		a = scanner.nextInt();
		
		System.out.print("2. sayıyı giriniz : ");
		b = scanner.nextInt();
		
		System.out.print("3. sayıyı giriniz : ");
		c = scanner.nextInt();
		
	
			if (a>b && a>c) {
				
				if (b>c) {
					
					System.out.println(a + " > " + b +" > " + c);
					}
				else {
					
					System.out.println(a + " > " + c +" > " + b);
				}
				
			}
			
	
			if (b>a && b>c) {
				
				if (a>c) {
					
					System.out.println(b + " > " + a +" > " + c);
				}
				else {
					
					System.out.println(b + " > " + c +" > " + a);
				}
				
			}
			
		
			if (c>a && c>b) {
				
				if (a>b) {
					
					System.out.println(c + " > " + a +" > " + b);
					
				}
				else {
					
					System.out.println(c + " > " + b +" > " + a);
				}
			
				
			}
		
			System.out.println("Sonuç :Elvo <3 Berfoooooo");
		
		
		}
			
			

		
		
		
}
		
	
	
	
