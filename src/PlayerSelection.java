import javax.swing.*;
import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the players Name");
        String Players_Name = input.nextLine();

        System.out.print("Enter the players Age");
        int Players_Age = input.nextInt();

        System.out.print("Enter the players Height in meters");
        double Players_Height = input.nextDouble();

        System.out.print("Enter the players Weight");
        double Players_Weight = input.nextDouble();

        System.out.print("Enter the players jersey number");
        int Players_Jersey_Number = input.nextInt();

        double pound = 0.45359237;
        int meter = 100;
        double Height_in_meters = Players_Height * meter;
        double Weight_in_meters = Players_Weight * pound;


        System.out.print("How many seasons have passed");
        int seasons = input.nextInt();
        int count = 0;

        //Age update per season
        while (count < seasons) {
            Players_Age++;
            count++;
        }

        //Position Assignment
        String position;
        switch (Players_Jersey_Number) {
            case 1:position = "Goalkeeper";
                break;
            case 2,5: position = "Defender";
                break;
            case 6,8: position = "Midfielder";
                break;
            case 7,11: position = "Winger";
                break;
            case 9: position = "Striker";
                break;
            case 10: position = "Playmaker";
                break;
            default:
                position = "Unknown";
        }
        //Attacker Assignment
        String Attacker_stat =(Players_Jersey_Number==7||Players_Jersey_Number==9||Players_Jersey_Number==10||Players_Jersey_Number==11)? "Yes":"No";


        //Player Lineup
        String Category;

        if (Players_Age < 20 && Players_Age >= 18 ) {
            Category ="Rising Star";
        }
        else if (Players_Age > 20 && Players_Age <= 30 ) {
            Category ="Prime Player";
        }
        else{
            Category ="Veteran";
        }
        String Lineup_Stat;
        if(Category.equals("Prime Player")) {
            if (Players_Weight < 80) {
                Lineup_Stat = "Starting line up";

            } else {
                Lineup_Stat = "Bench";
            }
        } else {
            Lineup_Stat = "Bench";
        }


        
        //Player Eligibility
        String Eligibility_stat;
        if (Players_Age >= 18 && Players_Age <= 35 && Players_Weight < 90) {
            Eligibility_stat="Eligible";
        } else
            Eligibility_stat="Not Eligible";

        //Final Decision
        String Final =(Players_Age>=18 && Players_Age<= 35 && Players_Weight <90)? "Play":"Rest";


        // ---------------- Player Report ----------------
        System.out.println("\n--- Player Report ---");
        System.out.println("Player: " + Players_Name);
        System.out.println("Age: " + Players_Age + " (" + Category + ")");
        System.out.println("Height: " + (int)Height_in_meters + " cm");
        System.out.println("Weight: " + (int)Weight_in_meters + " kg");
        System.out.println("Jersey: " + Players_Jersey_Number);
        System.out.println("Position: " + position);
        System.out.println("Attacker Jersey: " + Attacker_stat);
        System.out.println("Eligibility: " + Eligibility_stat);
        System.out.println("Lineup Decision: " + Lineup_Stat);
        System.out.println("Final Decision: " + Final);







    }
}