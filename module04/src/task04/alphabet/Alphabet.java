package task04.alphabet;

public class Alphabet
{
    public static void main(String[] args){
        String alphabetEn = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetRu = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

        singleCharCode(alphabetEn);
        singleCharCode(alphabetRu);

    }

    public static void singleCharCode(String alphabet){

        for (char c:alphabet.toCharArray()) {
            System.out.println("Буква: " + c + " код: " + (int)c);
        }
    }
}
