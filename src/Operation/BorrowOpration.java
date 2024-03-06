package Operation;

import book.Booklist;

import java.util.Scanner;

public class BorrowOpration implements IOperation {
public void work(Booklist booklist){
    System.out.println("借出图书");
    Scanner in=new Scanner(System.in);
    System.out.println("请输入书名：");
    String name=in.nextLine();

    for (int i=0;i< booklist.numBooks;i++){

        if (name.equals(booklist.books[i].getName())){
            if (booklist.books[i].getisBorrowed()==false){
                System.out.print("借阅成功");
                booklist.books[i].setBorrowed(true);
                return;
            }
            else {
                System.out.print("该书已被借出");
                return;
            }
        }

    }
    System.out.print("未收录该书");

}
}
