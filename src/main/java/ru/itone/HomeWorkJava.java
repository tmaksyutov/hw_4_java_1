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




    // must have (надо знать и помнить о нем всегда)
    //boolean flag = true;

    //byte aByte; // 8 бит (-128 / 127)  -(2^7) / (2^7)-1
    //short aShort; // 16 бит (-32768 / 32767) -(2^15) / (2^15)-1

    // must have (надо знать и помнить о нем всегда)
    //int aInt = 0; // 32 бит

    //long aLong; // 64 бит
    //float aFloat; // 32 бит

    // must have (надо знать и помнить о нем всегда)
    //double aDouble = 1.5;  // 64 бит
    //char aChar = '0';

// Операторы математические + - * / %
// Операторы условные > < >= <= == != !
// Операторы логические && ||
