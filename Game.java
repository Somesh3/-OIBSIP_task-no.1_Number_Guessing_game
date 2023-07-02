import java.util.Random;
import java.util.Scanner;

public class Game{ 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String play = "Yes";
        int round = 0,TotalScore=0,TotalTries =0;
        System.out.println();
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME");
        System.out.println();
        System.out.println("A number is chosen between 1 to 100.Guss the number in 5 triees.");

        while(play.equals("Yes"))
        {
            ++round;
            int guess,i,k=5,tries=0,score=5;
            Random rand = new Random();
            int number=rand.nextInt(100);
            for(i=0;i<k;i++)
            {
                System.out.println();
                System.out.print("Guess the number : ");
                guess=sc.nextInt();
                

                if(number==guess)
                {
                    tries++;
                    System.out.println("Congratulation: You guessed the number.");
                    System.out.println();
                    result(tries,score);
                    TotalTries += tries;
                    TotalScore += score;
                    System.out.println("THANK YOU TO PLAY THIS GAME");
                    System.out.println();
                    System.out.print("Would you like to play again? yes or no : ");
                    play = sc.next().toLowerCase();
                    break;
                }
                else if(number > guess&& i!=k-1)
                {
                    System.out.println("The number is greater than " + guess);
                    tries++;
                    score--;
                }
                else {
                    System.out.println("The number is less than "+ guess);
                    tries++;
                    score--;
                    }
                    
                }
                
                if(i==k)
                {
                    System.out.println("You have exhausted 5 tries.");
                    System.out.println("The number was "+number);
                    TotalTries += tries;
                    TotalScore += score;
                    result(tries,score);
                    System.out.println("THANK YOU TO PLAY THIS GAME");
                    System.out.println();
                    System.out.print("Would do you like to play again? yes or no : ");
                    play = sc.next().toLowerCase();

                }
            }
            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println("                  SCORECARD        ");
            System.out.println("------------------------------------------------");
            System.out.println("|     Rounds    |  Total_Tries   | Total_Score |");
            System.out.println("------------------------------------------------");
            System.out.println("|         "+round+"     |    "+TotalTries+"           |     "+TotalScore+"      |");
            System.out.println("-------------------------------------------------");
            
            
        }
        static void result(int tries,int score)
        {
            System.out.println();
            System.out.println("-------------------");
            System.out.println("| Tries  | Score  |");
            System.out.println("-------------------");
            System.out.println("|   "+tries+"     |   "+score+"  |");
            System.out.println("-------------------");
         
        }
    
    }

