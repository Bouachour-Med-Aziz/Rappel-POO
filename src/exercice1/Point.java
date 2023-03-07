package exercice1;

public class Point {
	private int cordx;
	private int cordy;
	String couleur;
	String nom;
	
	public Point() {}
	
	public Point(int a,int b) {
		cordx = a;
		cordy = b;
	}
	
	public Point(int a,int b,String c,String n) {
		cordx = a;
		cordy = b;
		couleur = c;
		nom = n;
	}
	
	public int getcordx() {
		return cordx ;
	}
	
	public int getcordy() {
		return cordy;
	}
	
	public void setcordx(int x) {
		cordx = x;
	}
	
	public void setcordy(int y) {
		cordy = y;
	}
	
	public void deplacer_point(int a,int b) {		
		cordx += a;
		cordy += b;
	}
	
	
	public void changer_couleur(String c) {
		couleur = c;
	}
}
