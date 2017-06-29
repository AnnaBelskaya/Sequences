package com.goit;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        String sequence = s.nextLine();
        int[] array = lineToIntArray(sequence);
        if (bSubstractA(array)!=0){
            System.out.println(sequence + "," + bSubstractA(array));
        } else {
            if (bDivideA(array)!=0){
                System.out.println(sequence + "," + bDivideA(array));
            } else {
                System.out.println(sequence + "," + power(array));
            }
        }
    }

    public static int[] lineToIntArray (String line){
        String[] input = line.split(",");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++){
            numbers[i] = Integer.parseInt(input[i]);
        }
        return numbers;
    }

    public static int bSubstractA (int[] array){
        int number, difference = array[1] - array[0];
        for (int i = 0; i < array.length-1; i++){
            if (array[i+1] - array[i] != difference){
                return 0;
            }
        }
        number = array[array.length-1] + difference;
        return number;
    }

    public static int bDivideA (int[] array){
        int number, difference = array[1] / array[0];
        for (int i = 0; i < array.length-1; i++){
            if (array[i+1] / array[i] != difference){
                return 0;
            }
        }
        number = array[array.length-1] * difference;
        return number;
    }

    public static int power (int[] array){
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) != i + 1) {
                for (int j = 0; j < array.length; j++) {
                    if (Math.pow((i+1),3) != array[i]) {
                        return 0;
                    }
                }
                return (int) Math.pow((array.length+1),3);
            }
        }
        return (int) Math.pow((array.length+1),2);
    }

}
