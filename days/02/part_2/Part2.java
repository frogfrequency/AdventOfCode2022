import java.util.Arrays;

public class Part2 {
    public static void main(String[] args) {
        PuzzleInput input = new PuzzleInput();
        int finalScore = 0;
        for (int i = 0; i < input.puzzleInput.length; i++) {
            finalScore += (giveScore(input.puzzleInput[i]));
        }
        System.out.println(finalScore);

    }
    public static int giveScore(String[] input) {
        int winnerBonus = 0;
        

        switch (input[1]) {
            case "X":
                winnerBonus = 0;
                break;
            case "Y":
                winnerBonus = 3;
                break;
            case "Z":
                winnerBonus = 6;
                break;
        }
        return winnerBonus + giveHandBonus(input);

    }
    static int giveHandBonus(String[] input) {
        String[] abcNotation = {"A", "B", "C"};
        int opponentHand = Arrays.asList(abcNotation).indexOf(input[0]);

            switch (input[1]) {
                case "X":
                    return (opponentHand + 2) % 3 + 1;
                case "Y":
                    return opponentHand + 1;
                case "Z":
                    return (opponentHand + 1) % 3 + 1;
                default:
                    return -10000000;
            }
        
    }
}

// 14443 is wrong