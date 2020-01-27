package task5.stringExpirements;

import java.util.ArrayList;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);
        ArrayList<Integer> numbers = new ArrayList<>();
        // Разделяем по числам и записываем значение в коллекцию, если значене не пустое
        for (String part : text.split("[^0-9]+")) {
            if(part.equals("") != true) {
                numbers.add(Integer.parseInt(part));
            }
        }
        System.out.println(numbers);//для теста выводим все значения коллекциия

        int summ = 0;
        // суммируем значения массива
        for (int elem:numbers) {
            summ += elem;
        }
        System.out.println("Общая сумма заработка " + summ);
    }
}