import java.util.ArrayList;
import java.util.Collections;

public class Part2 {
  public static void main(String[] args) {
    final String puzzleInput = new PuzzleInput().puzzleInput;
    String[] elfInventories = giveElfInventoryArray(puzzleInput);

    ArrayList<Integer> allCalorieCounts = new ArrayList<Integer>();

    for (String inventory : elfInventories) {
      allCalorieCounts.add(giveCalorieCount(inventory));
    }
    Collections.sort(allCalorieCounts, Collections.reverseOrder());


    int topThreeSummed = 0;
    for (int i = 0; i < 3; i++) {
      topThreeSummed += allCalorieCounts.get(i);
    }

    System.out.println(topThreeSummed);
    // printArr(allCalorieCounts);

  }

  public static void printArr(ArrayList<Integer> toPrint) {
    for (Integer entry : toPrint) {
      System.out.println(entry);
    }
  }


  public static String[] giveElfInventoryArray(String fullString) {
    // ArrayList<String> ElfInventoryList = new ArrayList<String>();
    String[] elfInventories =  fullString.split("\n\n");
    return elfInventories;
	}

  public static int giveCalorieCount(String inventory) {
    int calorieCounter = 0;
    String[] inventoryEntries = inventory.split("\n");
    for (String entry : inventoryEntries) {
      calorieCounter += Integer.parseInt(entry, 10); 
    }
    return calorieCounter;
  }
  
}