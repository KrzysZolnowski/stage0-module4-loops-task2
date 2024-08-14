package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
            return;
        }

        int currentPower = 0;
        int result = 1; // Start with 2^0 = 1

        while (currentPower <= power) {
            System.out.println(result); // Print the current power of 2
            currentPower++;
            result *= 2; // Calculate the next power of 2
        }
    }
}
