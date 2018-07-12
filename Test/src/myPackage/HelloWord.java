package myPackage;

public class HelloWord {
	// methode somme
	public static int addition (int a, int b) {
		int sum = a+b;
		return sum;
	}
	//methode affichage 
	public static String w = "wold";
	public static void affichage (String s) {
		System.out.println("Welcom " + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//methode affichage
		String w1 = "Hello ";
		affichage(w1 + w);
		// methode somme 
		int var1=10;
		int var2 =20;
		int somme;
		somme = addition (var1, var2);
		System.out.println(somme);
		
	}

}
