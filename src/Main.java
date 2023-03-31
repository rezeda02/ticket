public class Main {

    public static void main(String[] args) {

        int numberTicket = 123456;

        while (!isLuckyTicket(numberTicket)) {
            numberTicket++;
        }

        System.out.println(" счастливый билет вот:" + numberTicket);
    }
    /**
     * Метод определяеет счастливый или нет
     * @return true,если билет счастливый
     */

    static boolean isLuckyTicket(int number) {
         String strTicket = String.valueOf(number);  // число в строку


        int[] mas = new int[6];
        mas[0] = Integer.parseInt(strTicket.substring(0, 1));
        mas[1] = Integer.parseInt(strTicket.substring(1, 2));
        mas[2] = Integer.parseInt(strTicket.substring(2, 3));
        mas[3] = Integer.parseInt(strTicket.substring(3, 4));
        mas[4] = Integer.parseInt(strTicket.substring(4, 5));
        mas[5] = Integer.parseInt(strTicket.substring(5));


        int sumEvenNumbers = 0; // Сумма четных чисел
        int sumDddNumbers = 0; // Сумма нечетных чисел


        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);


            // как определить четность или нечетность числа
            if (mas[i] % 2 == 0) sumEvenNumbers += mas[i];
            else sumDddNumbers += mas[i];

        }
        System.out.println("сумма четных:" + sumEvenNumbers);
        System.out.println("сумма нечетных:" + sumDddNumbers);


        if (sumEvenNumbers == sumDddNumbers) System.out.println("ваш билет счастливый");
        else System.out.println("ваш билет не счастливый");


        return false;
    }

  }



