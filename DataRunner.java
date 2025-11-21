 import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

   UserStory moose = new UserStory("players.txt", "playerTeams.txt", "playerYear.txt", "playerPpg.txt", "playerFgpct.txt", "playerAvgTurnover.txt");


    // System.out.println(moose.getHighestPpgPlayer());
    // System.out.println(moose.getLowestPpgPlayer());
    //     System.out.println(moose.getHighestFgPctPlayer());
    //     System.out.println(moose.getLowestFgPctPlayer());
    //     System.out.println(moose.getHighestTurnoverPlayer());
    //     System.out.println(moose.getLowestTurnoverPlayer());
    //     System.out.println(moose.getLowestTurnoverPlayer());
    //     System.out.println(moose.getBestOverallPlayer());
 moose.start();
    
  }
}