package ru.itone;

public class HomeWorkJava {
    public static void main(String[] args) {
        String result = "Результат = ";

        // Операторы математические + - * / %
        int a = 20;
        int b = 5;
        int c = 200;
        double d = 1.5;
        System.out.println(result + (a+b+c)*d);

        // Операторы сравнения > < >= <= == != !
        System.out.println(result + (a>b && c<d));
        System.out.println(result + (a!=b || c>=d));

        // Логические операторы && ||, условние конструкции if else
        if (a>b && c==d){
            System.out.println("Условие выполнено");
        }
        else if(a>b && c<d) {
            System.out.println("Условие выполнено");
        }
        else {
            System.out.println("Условие не выполнено");
        }

        // Конструкция switch/case
        int number = 10;
        switch (number){
            case 2:
                System.out.println(result +"2");
                break;
            case 5:
                System.out.println(result + "5");
                break;
            case 10:
                System.out.println(result + "10");
                break;
            default:
                System.out.println("Число не равно 2, 5, 10");
        }
    }
}
