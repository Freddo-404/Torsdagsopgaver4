import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
        
 	}


    private static void makeAGuess(){
    	Scanner scan = new Scanner(System.in);
    	if(scan.hasNextDouble()){
    		String input = scan.nextLine();
    	
    		double gn = Double.parseDouble(input);

    		if (gn == rnd_number){
    			System.out.println("You have guess my number you wizard"); 
               
    	}
    			else if(gn > rnd_number){
    				System.out.println("Go lower you monkey");
                    makeAGuess();
    			}
    			else if (gn<rnd_number){
    				System.out.println("Go higher you monkey");
                    makeAGuess();
    			}
                else{
                    System.out.println("That is not a number you dumb fuck");
                    makeAGuess();
                }
    		}
    	}
      

}
   		