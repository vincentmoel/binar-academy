package Maret_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        workWithFile();
    }

    // 7 Maret 2022
    public static void standartClass()
    {
        String pertama = "Halo";
        String kedua = "Bandung";
        StringBuilder stringBuilder = new StringBuilder().append(pertama).append(kedua);
        StringBuffer stringBuffer = new StringBuffer().append(pertama).append(kedua);

        System.out.println(pertama.concat(kedua));
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuffer.toString());

        StringJoiner stringJoiner = new StringJoiner("-");
        List<String> listku = new ArrayList<>();
        listku.add(pertama);
        listku.add(kedua);

        for (String list : listku)
        {
            stringJoiner.add(list);
        }

        System.out.println(stringJoiner);

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EE dd-MM-YYYY");

        System.out.println(date);
        System.out.println(dateFormat.format(date));


        TimeZone timeZoneWaktu = TimeZone.getTimeZone("JST");
        dateFormat.setTimeZone(timeZoneWaktu);

        System.out.println(Math.sqrt(12.3));
    }

    public static void workWithFile()
    {
        File myFile = new File("D:\\Binar Academy\\ProjectBinar\\src\\Maret_07\\fileku.txt");

        try {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine())
            {
                System.out.println(scanner);
                String linenya = scanner.nextLine();
                System.out.println(linenya);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
