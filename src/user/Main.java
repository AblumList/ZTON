package user;

import book.Book;
import book.Booklist;

import java.util.Scanner;

public class Main {
    public static user login(){
        System.out.println("请输入姓名");
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        System.out.println("请选择身份：1->管理员；0->普通用户");
        Scanner inn=new Scanner(System.in);
        int chioce=inn.nextInt();
        if(chioce>0){
           return new AdiminUser(name);

        }else {
            return new NormalUser(name);
        }

    }

    public static void main(String[] args) {
        Booklist bookList = new Booklist();
        user user=login();

        while (true){
            int chioce;
            do {

                chioce=user.menu();
            }while (chioce<0||chioce>user.conust);
                user.dowork(chioce,bookList
                );





        }
    }


}