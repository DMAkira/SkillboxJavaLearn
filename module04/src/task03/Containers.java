package task03;

import java.util.Scanner;

public class Containers {

    public static final int MAX_BOX_IN_CONTAINER = 4;// максимальное число ящиков в контейнере
    public static final int MAX_CONTAINERS_IN_TRACK = 3;// максимальное число контейнеров в грузовике
// значения констант не 12 и 27, только потому что та отлаживать проще))) ну а какие значения для итога не важно
    public static void main(String[] args) {
        System.out.println("Введите количество ящиков:");
        Scanner scanner = new Scanner(System.in);
        int quantityOfBox = scanner.nextInt();// вводим количество ящиков

        int quantityOfContainers = (int) (Math.ceil((double) quantityOfBox / MAX_BOX_IN_CONTAINER));//вычисляем количество контенйеров
        int outQuantityOfBox = quantityOfBox % MAX_BOX_IN_CONTAINER;//вычисляем количество ящиков в незаполненом контейнере
        int quantityOfTracks = (int) (Math.ceil((double) quantityOfContainers / MAX_CONTAINERS_IN_TRACK));//вычисляем количество грузовиков
        int outQuantityOfContainers = quantityOfContainers % MAX_CONTAINERS_IN_TRACK;//вычисляем количество контейнеров в незаполненном грузовике

        // Это вывод сколько чего чтобы проще было отладить прогу если что
        System.out.println("Количество грузовиков всего " + quantityOfTracks);
        System.out.println("Количество контейнеров всего " + quantityOfContainers);
        System.out.println("Количество контейнеров в незаполненном грузовике  " + outQuantityOfContainers);
        System.out.println("Количество ящиков в незаполненом контейнере " + outQuantityOfBox);

        int containersCount = 1;//счетчик контейнеров для вывода
        int boxCount = 1;//счетчик ящиков для вывода
        int countC; // счетчик максимального номера контйнера, до какого выводить
        int countB;//счетчик максимального номера ящика, до какого выводить

        for( int track = 1; track <= quantityOfTracks; track++ ){//цикл с первого до последнего грузовика
            System.out.println("Грузовик № " + track);
            countC = track * MAX_CONTAINERS_IN_TRACK;// по умолчанию считаем что грузовки полон контейнерами

            if( quantityOfContainers < MAX_CONTAINERS_IN_TRACK ){// проверяем если количество не выведенных контейнеров меньше константы контейнеров, то цикл запускаем по остаток контейнеров
                countC = (((track - 1) * MAX_CONTAINERS_IN_TRACK) + outQuantityOfContainers);// по сути это условие выполнится один раз
            }
            for ( ;containersCount <= countC; containersCount++ ){// выводим контейнеры
                System.out.println("Контейнер № " + containersCount);
                countB = containersCount * MAX_BOX_IN_CONTAINER;// ниже все тоже самое что с контейнерами, но для ящиков

                if ( quantityOfBox < MAX_BOX_IN_CONTAINER){
                    countB = (((containersCount - 1) * MAX_BOX_IN_CONTAINER) + outQuantityOfBox);
                }
                for( ;boxCount <= countB; boxCount++){
                    System.out.println("Ящик № " + boxCount);
                }
                quantityOfBox-= MAX_BOX_IN_CONTAINER;
            }
            quantityOfContainers -= MAX_CONTAINERS_IN_TRACK;//как вывели контейнеры в грузовике, уменьшаем количество оставшихся для вывода на константу, в последнем случае надо уменьшать на другое значение, но тк операция последняя, то значение этой переменной дальше не важно.
        }
    }
}

/* Ниже мой первый код, тоже рабочий. Но благодаря тому что я считал до какого значения будет выполняться цикл for,
код сократился в 2 раза) думал я над этой задачей долго)))))тк в большом коде теряются ошибки. Может еще есть какой хитрый способ, математический там...?

for (int track = 1; track <= quantityOfTracks; track++) {
            System.out.println("Грузовик № " + track);
            if (quantityOfContainers >= MAX_CONTAINERS_IN_TRACK) {
                for (; containersCount <= track * MAX_CONTAINERS_IN_TRACK; containersCount++) {
                    System.out.println("Контейнер № " + containersCount);
                    if(quantityOfBox >= MAX_BOX_IN_CONTAINER){
                        for(;boxCount <= containersCount * MAX_BOX_IN_CONTAINER;boxCount++){
                            System.out.println("Ящик -№ " + boxCount);
                        }
                        quantityOfBox = quantityOfBox - MAX_BOX_IN_CONTAINER;
                    }else{
                        for(;boxCount <= (((containersCount - 1) * MAX_BOX_IN_CONTAINER) + outQuantityOfBox);boxCount++){
                            System.out.println("Ящик № --" + boxCount);
                        }
                        quantityOfBox = quantityOfBox - outQuantityOfBox;
                    }
                }
                    quantityOfContainers = quantityOfContainers - MAX_CONTAINERS_IN_TRACK;
            }else{
                for (; containersCount <= (((track - 1) * MAX_CONTAINERS_IN_TRACK) + outQuantityOfContainers); containersCount++) {
                    System.out.println("Контейнер № " + containersCount);
                    if(quantityOfBox >= MAX_BOX_IN_CONTAINER){
                        for(;boxCount <= containersCount * MAX_BOX_IN_CONTAINER;boxCount++){
                            System.out.println("Ящик № ---" + boxCount);
                        }
                        quantityOfBox = quantityOfBox - MAX_BOX_IN_CONTAINER;
                    }else{
                        for(;boxCount <= (((containersCount - 1) * MAX_BOX_IN_CONTAINER) + outQuantityOfBox);boxCount++){
                            System.out.println("Ящик № ----" + boxCount);
                        }
                        quantityOfBox = quantityOfBox - outQuantityOfBox;
                    }
                }
                quantityOfContainers -= outQuantityOfContainers;
            }
        }
    }


 */