import java.util.Scanner;

public class SimpleStartupGame {
    public static void main(String[] args){
        SimpleStartup ss = new SimpleStartup();
        int numberOfGuess = 0;

        int start = (int)(Math.random() * 4);

        int[] location = {start, start+1, start+2};
        ss.setLocationCells(location);

        Scanner scan = new Scanner(System.in);
        
        String result = "";

        while(!(result.equals("Kill"))){
            System.out.print("enter a number: ");
            int userGuess = scan.nextInt();

            result = ss.checkYourself(userGuess);
            numberOfGuess++;
        }

        System.out.println("You took " + numberOfGuess + " guesses.");

        scan.close();
    }
}
