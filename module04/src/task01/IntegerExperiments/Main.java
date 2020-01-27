package task01.IntegerExperiments;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;// объект класса Integer не был инициализирован, а при замене на примитив он по умолчанийю равено 0
        System.out.println(container.count);

        sumDigits(125);

    }

    public static Integer sumDigits(Integer number)
    {
        int sum = 0;
        int sum2 = 0;

        String sumString = number.toString();
        //способ 1
        for (int strLen = 0; strLen < sumString.length(); strLen++){
                sum = sum + Integer.parseInt(String.valueOf(sumString.charAt(strLen)));// в цикле с количеством итераций равному количеству символов в нашей строке берем символ из строки и переводм его в Int
        }
        //способ 2, слегка короче
        for (char c:sumString.toCharArray())
        {
         sum2 += Character.getNumericValue(c);
        }

        System.out.println(sumString);
        System.out.println(sum);
        System.out.println(sum2);
        return sum;
    }
}
