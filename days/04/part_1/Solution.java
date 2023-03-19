
public class Solution {
    public static void main(String[] args) {
        String input = new PuzzleInput().puzzleInput;
        PairAssignment[] assignments = InputParser.parseInput(input);
        int counter = 0;

        for (PairAssignment assignment : assignments) {
            if (assignment.hasSelfContainingRanges()) {
                counter++;
            }
        }
        System.out.println(counter);
    }
    
}