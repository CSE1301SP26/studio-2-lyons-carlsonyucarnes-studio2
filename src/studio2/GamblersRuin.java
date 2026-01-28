import java.util.Scanner; 
public class GamblersRuin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much money are we starting with?");
        double StartAmount = (in.nextDouble());
        System.out.println("How much is the win limit?");
        int WinLimit = (in.nextInt());
        System.out.println("What is the win chance?");
        double winChance = (in.nextDouble());
        System.out.println("How many days do you want to play?");
        String PlayDays = (in.nextLine());
    for(int i=0; i <= PlayDays; i++) {

        int totalPlays = 0;
        int numLosses = 0;
        while (StartAmount < WinLimit && StartAmount != 0){
            if(Math.random()< winChance){
                 //win
                StartAmount = StartAmount + 1;
                System.out.println(StartAmount + " WIN");
                totalPlays = totalPlays + 1;
        }
            else{
                //lose
                StartAmount = StartAmount - 1;
                System.out.println(StartAmount + " LOSE");
                totalPlays = totalPlays + 1;
                numLosses = numLosses + 1;

        }
    }
    System.out.println("Losses: " + numLosses +" Plays: " + totalPlays);
    if(StartAmount == 0){
        System.out.println("The day is ruined.");
    }
    else{
        System.out.println("The day is successful.");
    }
    }
    }
}