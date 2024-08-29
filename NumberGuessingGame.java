import java.util.*;
public class NumberGuessingGame {
    public static int Max_Attempts=10;
    public static int Min_Range=1;
    public static int Max_Range=50;
    public static int Max_Round=3;
    public static void main(String[] args) {
        Random RandomNumber=new Random();
        Scanner sc = new Scanner(System.in);
        int totalscr=0;

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("TOTAL NUMBER OF ROUNDS: 3\n");
        System.out.print("ATTEMPTS TO GUESS A NUMBER: 10\n");
        for(int i=1;i<=Max_Round;i++){
            int number = RandomNumber.nextInt(Max_Range)+Min_Range;
            int attempts=0;

            System.out.println("Round"+ i + ": Guess the number between "+ Min_Range  + " to " + Max_Range);
            while(attempts<Max_Attempts){
                System.out.println("Enter Your Guess Number");
                int guess_number=sc.nextInt();
                attempts=attempts+1;

                if(guess_number==number){
                    int score=Max_Attempts-attempts;
                    totalscr= totalscr+score;
                    System.out.println("Congratulations!!! You are right, Attempts "+attempts +" score: " +score);
                    break;

                }
                else if(guess_number<number){
                    System.out.println("The number is greater than "+ guess_number + ". Try again!!");
                }
                else if(guess_number> number){
                    System.out.println("The number is smaller than "+ guess_number + " Try again!!");
                }
            }
            if(attempts == Max_Attempts){
                System.out.println("Round ="+ i);
                System.out.println("Attempts = 0");
                System.out.println("The random number is "+ number);
            }
        }
        System.out.println("Game over.Total Score " + totalscr);
    }

    
}