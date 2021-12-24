package lesson5;

public class Person {
    private String FIO;
    private String job;
    private String email;
    private String tel;
    private int cash;
    private int age;

    public Person (String FIO, String job, String email, String tel, int cash, int age) {
        this.FIO = FIO;
        this.job = job;
        this.email = email;
        this.tel = tel;
        this.cash = cash;
        this.age = age;
    }
     void printPersonData (){
        System.out.println("Person Data: " + FIO);
         System.out.println(job);
         System.out.println(email);
         System.out.println(tel);
         System.out.println(cash);
         System.out.println(age);
     }
     public int getAge () {
        return age;
    }
}
