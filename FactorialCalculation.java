package com.yang.warrior.com.yang.warrior.recursion;

/**
 * Created by richardyang on 4/16/17.
 */
public class FactorialCalculation {

    /**
     * A recursion must have three conditions in order to work correctly as following:
     * 1. A condition to eventually satisfy to end the recursion
     * 2. A calculation or processing of each iteration
     * 3. A call to its recursive method/function
     *
     * @param factorialNumber
     * @return
     */
    public int recursiveFactorial(int factorialNumber) {

        int result = factorialNumber;

        if (factorialNumber > 1) {
            result = result * recursiveFactorial(--factorialNumber);
        }

        return result;
    }

    /**
     * Simplest method of Recursion
     * @param factorialNumber
     * @return
     */

    public int factorial(int factorialNumber) {

        return factorialNumber == 1 ? 1 : factorialNumber * factorial(factorialNumber - 1);

    }

    public int recursiveUpFactorial(int factorialNumber) {

        int result = 1;
        int initialCounter = 1;

        int finalcounter = factorialNumber;

        while (initialCounter <= finalcounter) {
            result = result * recursiveUpFactorial(--factorialNumber); // works
          //  result = result * initialCounter; // also works

            initialCounter++;
        }

        return result;

    }


    public int loopFactorial(int factorialNumber) {
        int result = 1;

        for (int i = 1; i <=  factorialNumber; i++)
            result = result * i;

        return result;
    }


    public int whileLoopFactorial(int factorialNumber) {
        int result = factorialNumber;

        while (factorialNumber > 1)
            result = result * (--factorialNumber);

        return result;
    }

    public int doWhileLoopFactorial(int factorialNumber) {

        int result = factorialNumber;
        do
            result = result * (--factorialNumber);
         while (factorialNumber >1);

        return result;
    }


}
