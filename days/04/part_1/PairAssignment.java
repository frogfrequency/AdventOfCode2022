public class PairAssignment {
    public Range firstRange;
    public Range secondRange;

    PairAssignment(Range first, Range second) {
        this.firstRange = first;
        this.secondRange = second;
    }
    
    public void printAssignment() {
        System.out.print(firstRange.giveStart() + "-" + firstRange.giveEnd() + ", ");
        System.out.println(secondRange.giveStart() + "-" + secondRange.giveEnd());
    }
    public boolean hasSelfContainingRanges() {
        int fs = firstRange.giveStart(); // fs-fe, ss-se
        int fe = firstRange.giveEnd();
        int ss = secondRange.giveStart();
        int se = secondRange.giveEnd();

        return (fs <= ss && se <= fe) || (ss <= fs && fe <= se);
    }
}
