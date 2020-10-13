package com.company;

public class Main {

    public static void main(String[] args) {
        int[] randomArray = new int[20];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100);
        }
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public static int evenCounter(int[] inputArray) {
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {

            if ((inputArray[i] & 2) == 0)
                count++;
        }
        return count;
    }
}
