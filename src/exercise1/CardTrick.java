package exercise1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 
 * @author Ché Mulrain Jan 28, 2023
 * @author Paul Bonenfant Jan 25, 2022  
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((rand.nextInt(52))+1);
            // 
            card.setSuit(Card.SUITS[(rand.nextInt(4))]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        System.out.println("Enter card value and suit");
        System.out.println("11 for Jack 12 for Queen 13 for King");
        System.out.println("1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs");
       
        
            
            System.out.print("Card value: ");
            int value = Integer.valueOf(scanner.nextLine());
            System.out.print("Suit: ");
            int suit = Integer.valueOf(scanner.nextLine());
            String suitName = "";
            if (suit == 1){
                suitName = "Hearts";}
            else if (value == 2){
                suitName = "Diamonds";}
            else if (value == 3){
                suitName = "Spades";}
            else if (value == 4){
                suitName = "Clubs";   
            }          
            for (int i = 0; i < hand.length; i++){
                if (value == hand[i].getValue() && suitName.equals(hand[i].getSuit())){
                    CardTrick.printInfo();
                }
            }
        
// insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * @author Ché Mulrain Jan 28, 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Ché");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Gain a degree");
        System.out.println("-- Travel to different countries to work");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Reading");
        System.out.println("-- Video editing");
        System.out.println("-- Listening to podcasts");
        System.out.println("-- Working out");

        System.out.println();
        
    
    }

}
