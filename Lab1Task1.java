package com.lab1;

public class Lab1Task1
{

    public static void main(String[] args)
    {
        int [] shellArray= new int [args.length];
        for (int i = 0; i < args.length; i++)
        {
            shellArray[i]=Integer.parseInt(args[i]);
            System.out.println(shellArray[i]);
        }
        int i, j, step;
        int tmp;
        for (step = shellArray.length / 2; step > 0; step /= 2)
            for (i = step; i < shellArray.length; i++)
            {
                tmp = shellArray[i];
                for (j = i; j >= step; j -= step)
                {
                    if (tmp < shellArray[j - step])
                        shellArray[j] = shellArray[j - step];
                    else
                        break;
                }
                shellArray[j] = tmp;
            }

        System.out.println("-----");

        for (int m = 0; m< args.length; m++)
        {
            System.out.println(shellArray[m]);
        }

    }

}