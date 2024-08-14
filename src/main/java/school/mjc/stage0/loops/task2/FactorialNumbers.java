package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int currentNumber = 0; // Start from 0
        long factorial = 1;    // Factorial of 0 is 1

        while (currentNumber <= printToInclusive) {
            System.out.println(factorial); // Print the current factorial value

            currentNumber++; // Increment the current number

            if (currentNumber <= printToInclusive) {
                factorial *= currentNumber; // Update factorial for the next number
            }
        }
    }
}
