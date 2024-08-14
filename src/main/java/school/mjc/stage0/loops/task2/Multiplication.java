package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int currentNumber = 0;

        if (multiplyByAndToInclusive < 0) {
            currentNumber = multiplyByAndToInclusive;
            while (currentNumber <= 0) {
                System.out.println(currentNumber * multiplyByAndToInclusive);
                currentNumber++;
            }
        } else {
            while (currentNumber <= multiplyByAndToInclusive) {
                System.out.println(currentNumber * multiplyByAndToInclusive);
                currentNumber++;
            }
        }
    }
}
