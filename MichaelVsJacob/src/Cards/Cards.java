package Cards;

public class Cards {

	
	public static void main (String args[]){
		
		String[] hearts = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String[] clubs = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String[] spades = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String[] diamonds = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		double a = (Math.random() * 4);
		if (a<=1){
			int b = (int) (Math.random() * 13);
			 String card=hearts[b];
			 System.out.println("Hearts "+ card);
		}
		else if (a<=2){
			int b = (int) ( Math.random() * 13);
			 String card=hearts[b];
			 System.out.println("Clubs "+ card);
		}
		else if (a<=3){
			int b = (int) ( Math.random() * 13);
			 String card=hearts[b];
			 System.out.println("Spades "+ card);
		}
		else if (a<=4){
			int b = (int) ( Math.random() * 13);
			 String card=hearts[b];
			 System.out.println("Diamonds "+ card);
		}
		
		a = (Math.random() * 4);
		if (a<=1){
			int b = (int) (Math.random() * 13);
			 String card2=hearts[b];
			 System.out.println("Hearts "+ card2);
		}
		else if (a<=2){
			int b = (int) ( Math.random() * 13);
			 String card2=hearts[b];
			 System.out.println("Clubs "+ card2);
		}
		else if (a<=3){
			int b = (int) ( Math.random() * 13);
			 String card2=hearts[b];
			 System.out.println("Spades "+ card2);
		}
		else if (a<=4){
			int b = (int) ( Math.random() * 13);
			 String card2=hearts[b];
			 System.out.println("Diamonds "+ card2);
		}
		a = (Math.random() * 4);
		if (a<=1){
			int b = (int) (Math.random() * 13);
			 String card2=hearts[b];
			 System.out.println("Hearts "+ card2);
		}
		else if (a<=2){
			int b = (int) ( Math.random() * 13);
			 String card2=hearts[b];
			 System.out.println("Clubs "+ card2);
		}
		else if (a<=3){
			int b = (int) ( Math.random() * 13);
			 String card2=hearts[b];
			 System.out.println("Spades "+ card2);
		}
		else if (a<=4){
			int b = (int) ( Math.random() * 13);
			 String card2=hearts[b];
			 System.out.println("Diamonds "+ card2);
		}
		
		
	}
}
