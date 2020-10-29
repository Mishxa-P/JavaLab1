package com.lab1;
public class Lab1Task2
{
    public static void main(String[] args)
    {
        int[] shuffleArray = {1, 5, 4, 2, 3};
        int temp;
        int length = shuffleArray.length;


        for (int i = 0; i < length; i++)
        {
            System.out.println(shuffleArray[i]);
        }

        for (int i = length - 1; i > 0; i--)
        {
            int change = (int)(Math.random() * ((i)));
            temp = shuffleArray [change];
            shuffleArray[change]=shuffleArray[i];
            shuffleArray[i] = temp;
        }

        System.out.println("-----");

        for (int i = 0; i < length; i++)
        {
            System.out.println(shuffleArray[i]);
        }
    }
}
