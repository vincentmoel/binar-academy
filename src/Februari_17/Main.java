package Februari_17;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    static String classVar = "Class Variable ini";
    String instVar = "Instance Variable ini";

    public static void main(String[] args)
    {

//        Scanner inputan = new Scanner(System.in);
//
//        System.out.print("Nama : ");
//        String name = inputan.nextLine();
//
//        System.out.print("Course : ");
//        String course = inputan.nextLine();
//
//        System.out.print("Background : ");
//        String background = inputan.nextLine();
//
//        System.out.print("Age : ");
//        String age = inputan.nextLine();
//
//        System.out.print("Hobby : ");
//        String hobby = inputan.nextLine();
//
//        System.out.print("University : ");
//        String university = inputan.nextLine();
//
//        System.out.print("Score : ");
//        String score = grade(Integer.parseInt(inputan.nextLine()));
//
//
//
//        my_identity(name, course, background, age, hobby, university, score);
    }

    public static String grade(int score)
    {
        if(score < 60)
        {
            return "D";
        }
        else if (score >= 60 && score <= 74)
        {
            return "C";
        }
        else if (score == 75)
        {
            return "B";
        }
        else if (score >= 76 && score <= 100)
        {
            return "A";
        }
        else
        {
            return "Invalid Input";
        }
    }

    public static void my_identity(String name,String course,String background,String age, String hobby, String university, String grade)
    {
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
        System.out.println("Background  : " + background);
        System.out.println("Age         : " + age);
        System.out.println("Hobby       : " + hobby);
        System.out.println("University  : " + university);
        System.out.println("Grade       : " + grade);

    }









}
