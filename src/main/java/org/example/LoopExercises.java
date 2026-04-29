package org.example;

public class LoopExercises {
    public int sum(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // (use a for loop)
        int total = 0;
        for (int i=1; i<= n; i++) {
            total += i;
        }
        return total;
    }

    public int sumUntilEven(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // but stops adding when the sum is even
        // (use a while loop with a sum variable and a counter variable)
        int sum = 0;
        int count = 1;

        while(count <= n){
            System.out.println("Sum is: " + sum);
            sum += count;
            System.out.println("after adding sum is: " + sum);
            count ++;
            if (sum % 2 == 0){
                break;
            }

        }
        return sum;


    }

    //I used this to manually test as I was writing but then ran the tests in the test folder with success.
    public static void main(String[] args) {

        LoopExercises le = new LoopExercises();

        // test lessThanFive
        System.out.println(le.sum(5));   // 15
        System.out.println(le.sum(15));   // 120

        // test Even
        System.out.println(le.sumUntilEven(5));   //
        System.out.println(le.sumUntilEven(11));   //

    }
}
