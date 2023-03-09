import java.util.Arrays;

public class Part1 {
    public static void main(String[] args) {
        PuzzleInput input = new PuzzleInput();
        int finalScore = 0;
        for (int i = 0; i < input.puzzleInput.length; i++) {
            finalScore += (giveScore(input.puzzleInput[i]));
        }
        System.out.println(finalScore);

    }
    public static int giveScore(String[] input) {
        int handBonus = 0;
        

        switch (input[1]) {
            case "X":
                handBonus = 1;
                break;
            case "Y":
                handBonus = 2;
                break;
            case "Z":
                handBonus = 3;
                break;
        }
        return handBonus + giveWinnerBonus(input);

    }
    static int giveWinnerBonus(String[] input) {
        String[] abcNotation = {"A", "B", "C"};
        String[] xyzNotation = {"X", "Y", "Z"};
        int opponentHand = Arrays.asList(abcNotation).indexOf(input[0]);
        int myHand = Arrays.asList(xyzNotation).indexOf(input[1]);

        if (myHand == opponentHand) {
            return 3;
        } else if (myHand == (opponentHand + 1) % 3) {
            return 6;
        } else if ((myHand + 1) % 3 == opponentHand) {
            return 0;
        }
        return -10000000;
    }
}

// 14443 is wrong