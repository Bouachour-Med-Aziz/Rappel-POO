package exercice3;

public class Test {

	public static void main(String[] args) {
		Angle a = new Angle(5);
		a.addition(30);
		System.out.println("add = "+a.mesure);
		a.soustraction(4);
		System.out.println("sous = "+a.mesure);
		a.multiplication(4);
		System.out.println("mult = "+a.mesure);
		double rad = a.conversion_rad();
		System.out.println("rad = "+rad);
		double c = a.cos();
		System.out.println("cos = "+c);
		double s = a.sin();
		System.out.println("sin = "+s);
		double t = a.tan();
		System.out.println("tan = "+t);
	}

}
