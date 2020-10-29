package com.lab1;

public class Lab1Task3
{
    public static void main(String[] args)
    {
        int counter = args.length;
        int [] uniqueArray= new int [args.length];
        for (int i = 0; i < args.length; i++)
        {
            uniqueArray[i]=Integer.parseInt(args[i]);
            System.out.println(uniqueArray[i]);
        }

        for (int i = 0; i < args.length; i++)
        {
            for (int j = i + 1; j < args.length; j++)
            {
                if(uniqueArray[i]==uniqueArray[j])
                {
                    counter--;
                    break;
                }
            }
        }
        System.out.println("-----");
        System.out.println("Unique numbers = "+ counter);
    }
}
