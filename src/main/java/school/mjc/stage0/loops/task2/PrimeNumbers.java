package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int currentNumber = 2; // Start from 2 since 0 and 1 are not prime numbers

        while (currentNumber <= printToInclusive) {
            if (isPrime(currentNumber)) {
                System.out.println(currentNumber);
            }
            currentNumber++;
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int divisor = 2;
        while (divisor <= Math.sqrt(number)) { // Check divisors up to the square root of the number
            if (number % divisor == 0) {
                return false; // If divisible by any number other than 1 and itself, it's not prime
            }
            divisor++;
        }
        return true;
    }
}

