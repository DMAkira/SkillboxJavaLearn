package task5.phoneNumber;

import java.util.Scanner;


public class phoneNumber {

    public static void main(String[] args){
        System.out.println(inputText());

    }

    public static String inputText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона");
        String phineInput = scanner.nextLine();
        phineInput = phineInput.trim().replaceAll("[^0-9]", "");
        return phineInput.charAt(0) == '8' ? phineInput.replaceFirst("8", "7") : phineInput;
    }


}
