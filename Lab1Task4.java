package com.lab1;

public class Lab1Task4
{
    public static void main(String[] args)
    {
        int counter = 1;
        int matrixSize = Integer.parseInt(args[0]);
        System.out.println("MatrixSize = "+ matrixSize);
        int [][] matrix = new int[matrixSize][matrixSize];
        for (int i=0; i< matrixSize; i++)
        {
            for (int j=matrixSize - 1; j>= (matrixSize-counter); j--)
            {
               matrix[i][j] = 1;
            }
            counter++;
        }

        for (int i=0; i< matrixSize; i++)
        {
            for (int j=0; j< matrixSize; j++)
            {
                System.out.print((matrix[i][j])+ " ");
            }
            System.out.println("");
        }
    }
}
