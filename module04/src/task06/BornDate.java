package task06;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BornDate {
    public static void main(String[] args){
        inputDate();

    }

    public static void inputDate(){

        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        System.out.println("Вывод " + format.format(date));


        System.out.println("Введите год рождения в формате гггг");
        Scanner scanner = new Scanner(System.in);
        int yearInput = scanner.nextInt();

        System.out.println("Введите месяц рождения в формате мм");
        int montInput = scanner.nextInt();

        System.out.println("Введите день рождения в формате дд");
        int dayInput = scanner.nextInt();

        Calendar birthday = Calendar.getInstance();
        birthday.set(yearInput,montInput -  1,dayInput);


        System.out.println(birthday.getTime());
        System.out.println(format.format(birthday.getTime()));

        date = birthday.getTime();
        System.out.println("Вывод " + format.format(date));

    }
}
