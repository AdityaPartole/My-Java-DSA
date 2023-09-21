// In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)

import java.util.*;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double Average = (A + B + C)/3;
        System.out.println(Average);

        sc.close();


    }
}

// import java.util.*;
// // Average of 3 numbers
// public class Solution {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int A = sc.nextInt();
// int B = sc.nextInt();
// int C = sc.nextInt();
// int average = (A + B + C) / 3;
// System.out.println("average is : " + average);
// }
// }



