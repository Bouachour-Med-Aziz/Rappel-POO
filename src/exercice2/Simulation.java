package exercice2;

public class Simulation {

	public static void main(String[] args) {
		dé d = new dé(6);
		int player1_score = 0;
		int player2_score = 0;
		for (int i=0; i<10; i++) {
			player1_score += d.int_generator();
			player2_score += d.int_generator();
			if (player1_score >= 21 ) {
				System.out.println("Player 1 WINS");
				break;
			}
			if (player2_score >= 21 ) {
				System.out.println("Player 2 WINS");
				break;
			}
		}
//		if (player1_score > player2_score) {
//			System.out.println("Player 1 WINS");
//		}
//		else if (player1_score < player2_score)  {
//			System.out.println("Player 2 WINS");
//		}
//		else {
//			System.out.println("DRAW");
//		}
	}

}
