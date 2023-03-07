package exercice4;

public class Test {

	public static void main(String[] args) {
		
		CompteBancaire c1 = new CompteBancaire(1);
		c1.credit(100);
		CompteBancaire c2 = new CompteBancaire(1);
		c2.credit(200);	
		
		Personne p1 = new Personne("Ali");
		p1.ajouterCompte(c1);		
		Personne p2 = new Personne("Mohamed");
		p2.ajouterCompte(c2);
		
		p1.deposer(c1, 300);
		p1.retirer(c2, 100);
		
		p1.virement(c1,c2,50);
	}

}
