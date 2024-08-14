package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int primeNumber = 0;

        while (primeNumber <= printToInclusive) {
        for (int i=0; i<20; i++)
        {
            boolean result = true;
            if(i<2)
            {
                result = false;
            }
            else for(int j=2; j<=i/2; j++)
            {
                if(i%j==0)
                {
                    result = false;
                    break;
                }
            }

            System.out.println("Liczba " + i + " " + (result == true ? "jest" : "nie jest") + " liczbą pierwszą");
        }
    }

        }
    }

