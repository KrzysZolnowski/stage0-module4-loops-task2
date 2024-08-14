package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int force = 0;
        while (force <=power) {
            System.out.println(2 ^ force);
            force += 1;
        }
    }
}
