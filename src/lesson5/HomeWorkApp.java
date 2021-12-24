package lesson5;
/**
 * На JAVA НЕ!!!! ПИШУТ на русском языке *
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

public class HomeWorkApp {


    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person ("Sting", "Singer","sting@gmail.com","8800-123123", 1000000, 51);
        persArray[1] = new Person ("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[2] = new Person ("Putin", "President", "iamBoss@mail.ru", "81111111111", 100000000, 60);
        persArray[3] = new Person ("Petrov petr", "Driver", "pePetr@mailbox.com", "892312312", 30000, 30);
        persArray[4] = new Person ("John Doe", "homeless", "home@mailbox.com", "911", 3, 45);

        for(int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].printPersonData();
                System.out.println();
            }
        }
    }
}
