public class InputParser {
    public static PairAssignment[] parseInput(String input) {
        String[] rawPairAssignments = input.split("\n");
        PairAssignment[] pairAssignmentArr = new PairAssignment[rawPairAssignments.length];

        for (int i = 0; i < rawPairAssignments.length; i++) {
            String currentPairRaw = rawPairAssignments[i]; // ["2-6,4-8"]
            String[] pairRangesRaw = currentPairRaw.split(","); // [ "2-6", "4-8"]
            Range firstRange = giveParsedRange(pairRangesRaw[0]);
            Range secondRange = giveParsedRange(pairRangesRaw[1]);
            PairAssignment currentPairAssignment = new PairAssignment(firstRange, secondRange);
            pairAssignmentArr[i] = currentPairAssignment;
        }
        return pairAssignmentArr;
    }
    
    private static Range giveParsedRange(String rangeString) {
        String[] boundaries = rangeString.split("-");
        return new Range(Integer.parseInt(boundaries[0]),Integer.parseInt(boundaries[1]));
    }
}
