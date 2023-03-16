import java.util.Arrays;

public class Part1 {
    public static void main(String[] args) {

        String[] charTable= {"0", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l","m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String input= new PuzzleInput().puzzleInput;
        String[] rucksacks = input.split("\n");
        int prioritySum = 0;
        for (String rucksack : rucksacks) {
            prioritySum += Arrays.asList(charTable).indexOf(giveCommonItemType(rucksack));
        }

        System.out.println(prioritySum);

    }

    

    public static String giveCommonItemType(String rucksack) {
        String firstHalf = rucksack.substring(0, (rucksack.length()+1)/2);

        String secondHalf = rucksack.substring((rucksack.length()+1)/2);

        for (int i=0; i < firstHalf.length(); i++) {
            if (secondHalf.contains(firstHalf.substring(i, i+1))) {
                return firstHalf.substring(i, i+1);
            }
        }
        return "XXXXXXXXXXXXXXX";
    }
}