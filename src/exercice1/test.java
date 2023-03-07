package exercice1;
public class test {

	public static void main(String[] args) {
		Point p = new Point(1,7);
		System.out.println(p.getcordx());
		System.out.println(p.getcordy());
		p.deplacer_point(4, 4);
		System.out.println(p.getcordx());
		System.out.println(p.getcordy());  
	}

}
