package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0;

        while (printToInclusive >= 1) {
            System.out.println(printToInclusive);
            printToInclusive -=1;
        }
    }
}
