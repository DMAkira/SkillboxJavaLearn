package task5.phoneNumber;

import java.util.Scanner;


public class phoneNumber {

    public static void main(String[] args){


    }

    public static String inputText(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона");
        String fioInput = scanner.nextLine();

        fioInput = fioInput.trim().replaceAll(" {2,}"," "); // 1 - Убираем пробелы с краев и оставляем по одному пробелу посередине

        return fioInput;
    }

}
