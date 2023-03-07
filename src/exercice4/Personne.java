package exercice4;

import java.util.Arrays;

public class Personne {
		String nom;
		CompteBancaire[] comptes = new CompteBancaire[20];
		public int n = 0;
		
		public Personne(String a) {
			nom = a;
		}
		
		public void ajouterCompte(CompteBancaire c) {
			comptes[n] = c;
			n++;

		}
		
		public void deposer(CompteBancaire c,int n) {
			assert Arrays.asList(comptes).contains(c);
			c.credit(n);
		}		
		
		public void retirer(CompteBancaire c,int n) {
			assert Arrays.asList(comptes).contains(c);
			if (c.solde - n < 0) {
				System.out.println("Solde insuffisant!");
			}
			else{
				c.debit(n);
			}
		}
		
		public void virement(CompteBancaire c1,CompteBancaire c2,int n) {
			assert Arrays.asList(comptes).contains(c1);
			assert Arrays.asList(comptes).contains(c2);
			c1.debit(n);
			c2.credit(n);
		}
}
