package com.lab1;

public class Lab1Task5
{
    public static void main(String[] args)
    {
        int[][] matrix = {{0, 1, 1, 2, 5}, {3, 1, 1, 2, 4},{1, 1, 1, 0, 1}, {3, 1, 1, 2, 1}, {0, 0, 1, 2, 1}};
        int matrixSize = matrix.length;
        int[] maxElements = new int[matrixSize];
        for (int i = 0; i < matrixSize; i++)
        {
            maxElements[i] = -1;
        }

        for (int i = 0; i < matrixSize; i++)
        {
            for (int j = 0; j < matrixSize; j++)
            {
                if (maxElements[i] <= matrix[i][j])
                {
                    maxElements[i] = matrix[i][j];
                }
            }
        }

        int minLineIndex = 0;

        for (int i = 0; i < matrixSize; i++)
        {
            if (maxElements[i]<maxElements[minLineIndex])
            {
                minLineIndex=i;
            }
        }

        int[][] tempMatrix = new int [matrixSize - 1][matrixSize];


        if(minLineIndex==(matrixSize-1))
        {
            for (int i = 0; i < minLineIndex; i++)
            {
                for (int j = 0; j < matrixSize; j++)
                {
                    tempMatrix[i][j]=matrix[i][j];
                }
            }
        }
        else
        {
            for (int i = 0; i < minLineIndex; i++)
            {
                for (int j = 0; j < matrixSize; j++)
                {
                    tempMatrix[i][j]=matrix[i][j];
                }
            }
            for (int i = minLineIndex + 1; i < matrixSize; i++)
            {
                for (int j = 0; j < matrixSize; j++)
                {
                    tempMatrix[i-1][j]=matrix[i][j];
                }
            }
        }

        for (int i=0; i< matrixSize; i++)
        {
            for (int j=0; j< matrixSize; j++)
            {
                System.out.print((matrix[i][j])+ " ");
            }
            System.out.println("");
        }

        System.out.println("-----");
        System.out.println("Line with min value = " +(minLineIndex + 1));
        System.out.println("-----");

        for (int i = 0; i < matrixSize - 1; i++)
        {
            for (int j = 0; j < matrixSize; j++)
            {
                System.out.print((tempMatrix[i][j])+ " ");
            }
            System.out.println("");
        }
    }

}

