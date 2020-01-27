package task5.phoneNumber;

import java.util.Scanner;


public class phoneNumber {

    public static void main(String[] args){
        System.out.println(inputText());


    }

    public static String inputText(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона");
        String fioInput = scanner.nextLine();

        fioInput = fioInput.trim().replaceAll("[()\\-\\s+]",""); // 1 - Убираем пробелы с краев и оставляем по одному пробелу посередине

        return fioInput;
    }

}
