package Maret_01;

import java.util.Scanner;

public class Main {
    static Scanner inputan = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void sortArrayKecilKeBesar() // Recursive
    {

    }

    public static void searchIndexArray()
    {
        int[] arr = {2,3,4,10,40};

        System.out.print("Masukkan Angka yang Dicari : ");
        int search = Integer.parseInt(inputan.nextLine());

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == search)
            {
                System.out.println("Berada di Index-" + i);
            }


        }
    }

    public static void cetakBintang()
    {
        int input = 5;

        for(int i = 0; i < input;i++)
        {
            System.out.print("*");
        }

        System.out.println();

        for(int i = 1; i < input;i++)
        {
            for(int j = 1; j <= input;j++)
            {
                if (j==1 || j == input)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        for(int i = 0; i < input;i++)
        {
            System.out.print("*");
        }
    }

    public static void cetakPiramida1()
    {



    }
}
