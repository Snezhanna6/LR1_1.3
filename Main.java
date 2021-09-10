package Main;

import java.util.Scanner;

public class Main {

    //Объект класса Users
    static Users users = new Users();

    public static void main(String[] args) {

        //Вызов метода для заполнения пользователями объект класса User
        MakeDB();
        //Вызов функции "Входа"
        signIn();
    }

    /**
     * Функция для ввода логина и пароля
     */
    public static void signIn(){

        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя пользователя: ");
        String name = in.nextLine();

        System.out.print("Введите имя пароль: ");
        String password = in.nextLine();

        //Поиск пользователя
        if (users.searchUser(name,password) != -1){
            System.out.print("Вы вошли! Ваш id: " + users.searchUser(name,password));
            return;
        }
        else {
            System.out.println("Данные не верные! Повторите попытку.");
            signIn();
        }
    }

    /**
     * Добавление пользователей в список
     */
    public static void MakeDB(){
        users.addUser("Пользователь1","Пароль1");
        users.addUser("Пользователь2","Пароль2");
        users.addUser("Пользователь3","Пароль3");
        users.addUser("Пользователь4","Пароль4");
        users.addUser("Пользователь5","Пароль5");
    }

}
