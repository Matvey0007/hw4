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