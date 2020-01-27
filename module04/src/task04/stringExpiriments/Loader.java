package task04.stringExpiriments;



public class Loader {

    public static final String NUMBERS = "0123456789";

    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text.substring(0,text.indexOf(',')));
        System.out.println(text.substring(text.indexOf(','),text.lastIndexOf(',')));
        System.out.println(text.substring(text.lastIndexOf(','),text.length()));

        int result = intCash(text.substring(0,text.indexOf(','))) + intCash(text.substring(text.indexOf(','),text.lastIndexOf(',')))
                + intCash(text.substring(text.lastIndexOf(','),text.length()));

        System.out.println("Сумма по итогу " + result);


        }

        // Функция которая возвращает целочисленное значение суммы из взятой подстроки
        public static int intCash(String text){

            int result = 0;
            for (char c : NUMBERS.toCharArray()) {
                if ((text.indexOf(c) > -1) && (text.charAt(text.indexOf(c)-1) == ' ')) {
                    int count = 0;
                    while(text.charAt(text.indexOf(c) + count) != ' '){
                        count++;
                    }
                    result += Integer.parseInt(text.substring(text.indexOf(c),text.indexOf(c) + count ));
                }
            }

            return result;
        }

}