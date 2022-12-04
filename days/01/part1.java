
public class part1 {
  public static void main(String[] args) {
    final String puzzleInput = new PuzzleInput().puzzleInput;
    String[] elfInventories = giveElfInventoryArray(puzzleInput);

    int highestCalorieInventory = 0;

    for (String inventory : elfInventories) {
      int currentInvCalorieCount = giveCalorieCount(inventory);
      if (highestCalorieInventory < currentInvCalorieCount) {
        highestCalorieInventory = currentInvCalorieCount;
      }
    }
    System.out.println("Inventory with highest caloriecount: " + Integer.toString(highestCalorieInventory));
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