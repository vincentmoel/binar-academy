package Februari_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner inputan = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void uniqueArray()
    {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(8);
        list1.add(4);
        list1.add(7);

        for(int i =1; i <= 15; i++){
            if(i % 2 != 0){
                list.add(i);

            }
        }
        ArrayList<Integer> unik = new ArrayList<Integer>(list);
        unik.removeAll(list1);
        System.out.println("list awal "+ list);
        System.out.println("list 2 "+ list1);
        System.out.println("hasil "+ unik);

    }

    public static void sortingArray()
    {
        List<Integer> deret = new ArrayList<>();
        deret.add(100);
        deret.add(20);
        deret.add(15);
        deret.add(30);
        deret.add(5);
        deret.add(75);
        deret.add(40);

        List<Integer> newArray = new ArrayList<>();

        while(deret.size() > 0)
        {
            int smallest = 999;
            int smallestIndex = 0;
            for(int i = 0; i < deret.size(); i++)
            {
                if (deret.get(i) < smallest ) {
                    smallest = deret.get(i);
                    smallestIndex = i;
                }
            }

            newArray.add(smallest);
            deret.remove(smallestIndex);
        }

        System.out.println(newArray);

    }

    public static void sortingArray2() // punya Dan Eliezer
    {
        int [] sort = {100,20,15,30,5,75,40};
        for(int i = 0;i < sort.length;i++){

            for(int y=0;y<sort.length-1;y++){
                if (sort[y] > sort[y+1]){
                    int temp = sort[y];
                    sort[y] = sort[y+1];
                    sort[y+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sort));
    }

    public static void kelipatanAngka()
    {
        System.out.print("Mau Berapa Angka : ");
        int lengthDeret = Integer.parseInt(inputan.nextLine());

        for(int i = 1 ; i<=lengthDeret ; i++)
        {
            if( i%3 == 0 && i%5 == 0)
            {
                System.out.print("FizzBuzz ");
            }
            else if (i%3 == 0 )
            {
                System.out.print("Fizz ");
            }
            else if (i%5 == 0 )
            {
                System.out.print("Buzz ");
            }
            else
            {
                System.out.print(i + " ");
            }
        }
    }

}
