package task04.fioline;

import java.util.Scanner;

public class Fioline {

    public static final String ALPHABET_RU = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ ";

    public static void main(String[] args){

        fioFormat();

    }

    public static void fioFormat(){

        String family;
        String name;
        String secondName;

        String fioInput = inputText();

        fioInput = fioInput.trim(); // 1 - Убираем пробелы с краев


            while (isRussian(fioInput) != true || numOfWords(fioInput) != true){
                fioInput = inputText();
            }

            // записываем в отдельные переменные.
            family = fioInput.substring(0,fioInput.indexOf(' '));
            name = fioInput.substring(fioInput.indexOf(' ') + 1,fioInput.lastIndexOf(' '));
            secondName = fioInput.substring(fioInput.lastIndexOf(' ') + 1);
            // меняем первый символ на заглавный, остальные на прописыне
            family = family.substring(0,1).toUpperCase() + family.substring(1).toLowerCase();
            name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
            secondName = secondName.substring(0,1).toUpperCase() + secondName.substring(1).toLowerCase();


        System.out.println("Фамилия: " + family);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + secondName);

    }
// 4 - метод запашивает строку и подготоавливает ее для проверок, удаляя пробелы с боков и лишние по центру строки, оставляя 1
    public static String inputText(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Фамилию Имя Отчество в формате Ф И О, русскими буквами");
        String fioInput = scanner.nextLine();

        fioInput = fioInput.trim(); // 1 - Убираем пробелы с краев и оставляем по одному пробелу посередине

        return fioInput;
    }
// 3 - Метод который считает количество слов, и все равно сколько между ними пробелов
    public static boolean numOfWords(String fioString){
        int wordsCount = 0;

        for ( int i = 1; i <= fioString.length(); i++) {
            if((fioString.charAt(i) != ' ' && fioString.charAt(i + 1) == ' ') || (fioString.charAt(i) == ' ' && fioString.charAt(i + 1) != ' ') ){
                wordsCount++;
            }

        }
        if(wordsCount == 3){
            return true;
        }
        else{
            System.out.println("Введено больше(меньше) трёх слов или поставлен лишний(е) пробел(ы)..." + wordsCount);
            return false;
        }
    }
// 2 - Метод который проверяет содержит ли строка только русские буквы и пробелы, сравнвает с алфавитом-константой
    public static boolean isRussian(String fioString) {

        int countOfTrue = 0;
        int index = -1;
        for (char cWord : fioString.toCharArray()) {
            if(ALPHABET_RU.indexOf(cWord) > index){
                countOfTrue++;
            }else {break;}
        }
        if(countOfTrue == fioString.length()){
            return true;
        }
        else {
            System.out.println("В вводимом тексте допустимы толлько русские буквы и пробелы...");
            return false;
        }
    }






}


