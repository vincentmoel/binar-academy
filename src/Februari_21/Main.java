package Februari_21;

public class Main {
    public static void main(String[] args) {

    }


    public static void aboutArray()
    {
        int[] angka = {1,3,56,4,9};
        int[] angka2 = {4,9,1,56,3};


        for (int i = 0; i < angka.length; i++)
        {
            for (int j = 0; j < angka2.length; j++)
            {
                if(angka[i] == angka2[j])
                {
                    System.out.println(angka[i]);
                }
            }
        }

    }
}
