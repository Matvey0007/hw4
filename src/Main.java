
public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int age = 17;
        if (age >= 18){
            System.out.println("Ты совершеннолетний");}
        else {
            System.out.println("Ты не совершеннолетний");}
    }


    public static void task2() {
        int temp = -5;
        if (temp >= 8) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице тепло,можно не одевать шапку ");
        }
    }
    public static void task3() {
        int speed = 60;
        if (speed<90){
            System.out.println( " придется заплатить штраф");}
        else {
            System.out.println(" можно ездить спокойно ");}


    }
    public static void task4(){
        int age = 30;
        if (age < 6 && age > 2){
            System.out.println("Если возраст человека равен " + age +" лет, то ему нужно ходить в детский сад");}
        if (age > 7 && age  < 18){
            System.out.println("Если возраст человека равен " + age +" лет, то ему нужно ходить в школу");}
        if (age > 18 && age > 24){
            System.out.println("Если возраст человека равен " + age +" лет, то ему нужно ходить на работу");}


    }
    public static void task5(){
        int age = 16;
        if (age < 5){
            System.out.println("Если возраст ребенка равен " + age + " , то ему нельзя кататься на атракционе");}
        if (age > 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + " , то ему можно  кататься на атракционе в сопровождении взрослого");}
        else {
            System.out.println("Если возраст ребенка равен " + age + " , то он может кататься на атракционе без сопровождения взрослого");}

    }
    public static void task6(){
        int mest = 123;
        if ( mest <= 60){
            System.out.println("В вагоне есть сидячие места");}
        if (mest > 60 && mest < 102){
            System.out.println("В вагоне есть только стоячие места");}
        else {
            System.out.println("Вагон уже полностью забит");}

    }
    public static void task7(){
        int one = 1;
        int two = 2;
        int three = 6;
        if (one > two && one > three){
            System.out.println("Смаое большое число " + one);}
        else if (two > one && two > three){
            System.out.println("Самое большое число "+ two);}
        else  if (three > one && three > two){
            System.out.println("Самое большое число "+ three);}

    }
}



public class Main {
    public static void main(String[] args) {
        task1();
        task2();


    }
    public static void task1(){
        System.out.println("Задача 1");
        char clientOs = 1;
        if (clientOs == 0){
            System.out.println("Установите версию приложения для IOS по ссылке");}
        else {
            System.out.println("установите версию приложения для Android по ссылке");}

    }
    public static void task2(){
        System.out.println("Задача 2");

        int clientDeviseYear = 2011;
        if (clientDeviseYear < 2015){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");}
        else {
            System.out.println("установите облегченную версию приложения для Android по ссылке");
        }

    }
    





}