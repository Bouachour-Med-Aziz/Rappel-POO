package exercice4;

public class CompteBancaire {
	int numCompte;
	int solde;
	
	public CompteBancaire(int n) {
		numCompte = n;
		solde = 0;
	}
	
	public void credit(int n) {
		assert n > 0;
		solde += n;
	}
	
	public void debit(int n) {
		assert n > 0;
		if (solde - n < 0) {
			System.out.println("Solde insuffisant!");
		}
		else{
			solde -= n;
		}
	}
	
	
}


