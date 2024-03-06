package Operation;

import book.Booklist;

import java.util.Scanner;

public class ReturnOperation implements  IOperation{
public void work(Booklist booklist){
    System.out.print("归还图书");
    Scanner in=new Scanner(System.in);
    System.out.println("请输入书名：");
    String name=in.nextLine();

    for (int i=0;i< booklist.numBooks;i++){

        if (name.equals(booklist.books[i].getName())){
            if (booklist.books[i].getisBorrowed()==true){
                System.out.print("归还成功");
                return;
            }
            else {
                System.out.print("该书未被借出");
                return;
            }
        }

    }
    System.out.print("未收录该书");



};




}
