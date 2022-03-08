package Maret_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Chapter2 {
    static Scanner inputan = new Scanner(System.in);

    public static void main(String[] args)
    {
        cobaEncapsulation();
    }




    // 2 Maret 2022
    public static void cobaEncapsulation()
    {
        Chapter2_Encapsulation tesEnc = new Chapter2_Encapsulation("Vincent");

        System.out.println(tesEnc.getName());

    }

}
