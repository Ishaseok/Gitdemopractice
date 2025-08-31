package org.example;

public class Arrays_Arraylists {

    public static void main(String[] args){

        // Syntax

       // data_type[] variable_name = new data_type[size];

        // Example

        int[] numbers = new int[5];
        int[] rollno={6,8,7,1};

        int[] rolno; //declaration of data type of array
        rollno=new int[4]; //initiation and creation of object

        // Assigning values to array elements

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing array elements

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Looping through the array

        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Using enhanced for loop

        System.out.println("Using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

    }
    // Function of Array and Arraylists

}
