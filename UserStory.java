import java.util.Scanner;

public class UserStory {
//Declares all of the variables
  private String[] players;
  private String[] playerTeams;
  private int[] playerYear;
  private double[] playerPpg;
  private double[] playerFgpct;
  private double[] playerAvgTurnover;

//Puts the .txt files into the variables as an array
  public UserStory(String playersFile, String playerTeamsFile, String playerYearFile, String playerPpgFile, String playerFgpctFile, String playerAvgTurnoverFile) {
    this.players = FileReader.toStringArray(playersFile);
    this.playerTeams = FileReader.toStringArray(playerTeamsFile);
    this.playerYear = FileReader.toIntArray(playerYearFile);
    this.playerPpg = FileReader.toDoubleArray(playerPpgFile);
    this.playerFgpct = FileReader.toDoubleArray(playerFgpctFile);
    this.playerAvgTurnover = FileReader.toDoubleArray(playerAvgTurnoverFile);

  }

 
//For testing 
  public String toString() {
    String result = "Example People:\n";
    for (int i = 0; i < players.length; i++) {
      result += "Name: " + players[i] + " - Team: " + playerTeams[i] + " - Year: " + playerYear[i] + " - Ppg: " + playerPpg[i] + " - FG%: " + playerFgpct[i] + " - Avg TO: " + playerAvgTurnover[i];
      result += "\n"; 
    }
    return result;
  }

//Methods
public String getHighestPpgPlayer() {
//Gets the highest ppg player in the array
    int index = 0;
    for (int i = 0; i < playerPpg.length; i++) {
        if (playerPpg[i] > playerPpg[index]) {
            index = i;
        }
    }
    return players[index] +  " - " + playerTeams[index] + " (" + playerYear[index] + ")" + " - PPG: " + playerPpg[index];
}

public String getLowestPpgPlayer() {
//Gets the lowest ppg player in the array    
    int index = 0;
    for (int i = 0; i < playerPpg.length; i++) {
        if (playerPpg[i] < playerPpg[index]) {
            index = i;
        }
    }
    return players[index] + " - " + playerTeams[index] + " (" + playerYear[index] + ")" + " - PPG: " + playerPpg[index];
}

public String getHighestFgPctPlayer() {
//Gets the highest FG% player in the array
    int index = 0;
    for (int i = 0; i < playerFgpct.length; i++) {
        if (playerFgpct[i] > playerFgpct[index]) {
            index = i;
        }
    }
    return players[index] + " - " + playerTeams[index] + " (" + playerYear[index] + ")" + " - FG%: " + (playerFgpct[index]) * 100;
}

public String getLowestFgPctPlayer() {
//Gets the lowest FG% player in the array
    int index = 0;
    for (int i = 0; i < playerFgpct.length; i++) {
        if (playerFgpct[i] < playerFgpct[index]) {
            index = i;
        }
    }
    return players[index] + " - " + playerTeams[index] + " (" + playerYear[index] + ")" + " - FG%: " + (playerFgpct[index]) * 100;
}

public String getHighestTurnoverPlayer() {
//Gets the highest Average TO player in the array
    int index = 0;
    for (int i = 0; i < playerAvgTurnover.length; i++) {
        if (playerAvgTurnover[i] > playerAvgTurnover[index]) {
            index = i;
        }
    }
    return players[index] + " - " + playerTeams[index] + " (" + playerYear[index] + ")" + " - TO: " + playerAvgTurnover[index];
}

public String getLowestTurnoverPlayer() {
//Gets the lowest Average TO player in the array
    int index = 0;
    for (int i = 0; i < playerAvgTurnover.length; i++) {
        if (playerAvgTurnover[i] < playerAvgTurnover[index]) {
            index = i;
        }
    }
    return players[index] + " - " + playerTeams[index] + " (" + playerYear[index] + ")"
            + " - TO: " + playerAvgTurnover[index];
}

public String getBestOverallPlayer() {
//Gets the best overall player in the array
    double bestScore = -1;
    int bestIndex = 0;

    for (int i = 0; i < players.length; i++) {
        double score = (playerPpg[i] * 2)
                     + (playerFgpct[i] * 1.5)
                     - (playerAvgTurnover[i] * 1);

        score = Math.round(score * 10) / 10.0; 

        if (score > bestScore) {
            bestScore = score;
            bestIndex = i;
        }
    }

    return players[bestIndex] + " - " + playerTeams[bestIndex] + " (" + playerYear[bestIndex] + ")" + " - Score: " + bestScore + ", PPG: " + playerPpg[bestIndex] + ", FG%: " + playerFgpct[bestIndex] + ", TO: " + playerAvgTurnover[bestIndex];
}


  public void start() {
    Scanner input = new Scanner(System.in);
    boolean isRunning = true;

    while (isRunning) {
      System.out.println("Greetings, choose an option");
      System.out.println("1. Highest PPG ");
      System.out.println("2. Lowest PPG");
      System.out.println("3. Highest FG%");
      System.out.println("4. Lowest FG%");
      System.out.println("5. Highest Average Turnovers");
      System.out.println("6. Lowest Average Turnovers");
      System.out.println("7. Greatest Player Overall");
      System.out.print("> "); // to make it look like a terminal prompt
      int choice = input.nextInt();
      System.out.println(); // blank line for spacing
      if (choice == 1) {
        // do something here related to the first choice aka option 2
        option1();
        isRunning = promptToContinue();
      } else if (choice == 2) {
        // do something here related to the second choice aka option 2
        option2();
        isRunning = promptToContinue();
      } else if (choice == 3) {
        option3();
        isRunning = promptToContinue();
      } else if (choice == 4) {
        option4();
        isRunning = promptToContinue();
      } else if (choice == 5) {
        option5();
        isRunning = promptToContinue();
      } else if (choice == 6) {
        option6();
        isRunning = promptToContinue();
      } else if (choice == 7) {
        option7();
        isRunning = promptToContinue();
      }   
      else {
        System.out.println("That's not a valid option. Try again.");
      }
    }
    
    System.out.println("Goodbye!");
    input.close();
  }

  /**
   * Propmts the user and returns true if they want to continue prompting, false otherwise
   */
  public boolean promptToContinue() {
    Scanner input = new Scanner(System.in);
    boolean isValid = false;
    boolean isRunning = true;
    
    while (!isValid) {
      System.out.println("Would you like to continue? (Y / N)");
      System.out.print("> "); // to make it look like a terminal prompt
      String choice = input.nextLine();
      System.out.println(); // blank line for spacing
      if (choice.equals("Y")) {
        isRunning = true; // they want to continue, we will return true
        isValid = true;
      } else if (choice.equals("N")) {
        isRunning = false; // they want to stop, we will return false
        isValid = true;
      } else {
        System.out.println("That's not a valid option. Try again.");
      }
    }

    input.close();
    return isRunning;
  }
  
  /**
   * What ever you want for the first option
   */
  public void option1() {
    System.out.println(getHighestPpgPlayer());
    System.out.println(); // blank line for spacing
  }
  
  /**
   * What ever you want for the second option
   */
  public void option2() {
    System.out.println(getLowestPpgPlayer());
    System.out.println(); // blank line for spacing
  }

  public void option3() {
    System.out.println(getHighestFgPctPlayer());
    System.out.println(); // blank line for spacing
}
  public void option4() {
    System.out.println(getLowestFgPctPlayer());
    System.out.println(); // blank line for spacing
}
  public void option5() {
    System.out.println(getHighestTurnoverPlayer());
    System.out.println(); // blank line for spacing
}
  public void option6() {
    System.out.println(getLowestTurnoverPlayer());
    System.out.println(); // blank line for spacing
}
  public void option7() {
    System.out.println(getBestOverallPlayer());
    System.out.println(); // blank line for spacing
}

  


}

    

