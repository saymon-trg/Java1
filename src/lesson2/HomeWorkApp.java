package lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {

 /* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
 в противном случае – false.*/

        System.out.println(check(25, 33));
        System.out.println("*******************");

 /* 2. Написать метод, которому в качестве параметра передается целое число,
 метод должен напечатать в консоль, положительное ли число передали или отрицательное.
 Замечание: ноль считаем положительным числом.*/

        pozitive(-21);
        System.out.println("*******************");

 /* 3. Написать метод, которому в качестве параметра передается целое число.
 Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/

        System.out.println(pozitiveBoolean (25));
        System.out.println("*******************");

/*  4. Написать метод, которому в качестве аргументов передается строка и число,
  метод должен отпечатать в консоль указанную строку, указанное количество раз.*/

        text("Текст Строки",6);
        System.out.println("*******************");

/*  5. Написать метод, который определяет, является ли год високосным,
  и возвращает boolean (високосный - true, не високосный - false).
  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/

        System.out.println (year(2045));
        System.out.println("*******************");

            }
        public static boolean check (int a, int b) {
           return a + b > 10 && a + b <= 20;
        }
        public static void  pozitive (int a) {
            if (a >= 0) {
            System.out.println("Положительное число");
        }else {
            System.out.println("Отрицательное число");
            }
        }
        public static boolean  pozitiveBoolean (int a) {
           return a < 0;
        }
        public static void text(String textstring, int a) {
            for (int i=0; i<6 ;i++)
        System.out.println(textstring);
        }
        public static boolean year (int a) {
            return ((a %400 ==0) || (a % 4 == 0 && a % 100 > 0));
        }

}
