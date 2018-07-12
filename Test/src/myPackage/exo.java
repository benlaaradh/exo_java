package myPackage;

import java.util.Scanner;

public class exo {
	//exo5
	public static int Prod (int a, int b) {
		int prod=a*b;
		return prod;
	}
	//exo 8
	public static int Mod (int c, int d) {
		int modulo=c%d;
		return modulo;
	}
	//exo 10
	public static void Bouclez (int f, int g) {
		
		for (int i=1; i<f; i++) {
			int co= g*i;
			System.out.println(g + "*" + i + "=" + co );
		}
		
	}
	//exo password 
	
	// exo 13
	public static void switcho (int k, int u) {
		int m=0;
		m=k;
		k=u;
		u=m;		
		System.out.println(k + " et" + u);
	}

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//exo5
		int a=5;
		int b=25;
		int produit=Prod(a,b);
		System.out.println(produit);
		//exo8
		int c=125;
		int d=24;
		int moduloz=Mod(c,d);
		System.out.println(moduloz);

		//exo 9
		
		int f=11;
		int g=8;
		Bouclez (f,g);
		
		//password
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisissez votre mot de passe");

		String str = sc.nextLine();

		System.out.println("Vous avez saisi : " + str);
		
		// exo 13
		
		switcho(5, 8);
		
		
		
	}
	

}
