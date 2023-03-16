import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Part2 {
    public static void main(String[] args) {

        String[] charTable= {"0", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l","m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String input= new PuzzleInput().puzzleInput;
        String[] rucksacks = input.split("\n");
        int prioritySum = 0;
        for (int i=0; i<rucksacks.length - 2; i=i+3) {
            String firstRucksack = rucksacks[i];
            char[] fR = firstRucksack.toCharArray();
            Character[] firstRucksackArr = new String(fR).chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);
            Set<Character> firstRucksackSet = new HashSet<>(Arrays.asList(firstRucksackArr));
            String firstRucksackClean = firstRucksackSet.toString();
            for (int j=0; j<firstRucksackClean.length(); j++) {
                String letter = firstRucksackClean.substring(j, j+1);
                
                if (rucksacks[i+1].contains(letter) && rucksacks[i+2].contains(letter)) {
                    prioritySum += Arrays.asList(charTable).indexOf(letter);
                }
            }
        }

        System.out.println(prioritySum);

    }

}    