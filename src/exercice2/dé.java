package exercice2;

public class dé {
	int nb_faces;
	public dé(int n) {
		nb_faces = n;
	}
	public int int_generator() {
		return (int)(Math.random() * 6) + 1;
	}
}
