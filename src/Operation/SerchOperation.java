package Operation;

import book.Booklist;

import java.util.Scanner;

public class SerchOperation implements IOperation{

  public void work(Booklist booklist){
    System.out.println("查找图书");
    System.out.println("请输入书名：");
    Scanner in=new Scanner(System.in);
    String name=in.nextLine();
    for (int i=0;i<booklist.numBooks;i++){
      if(name.equals(booklist.books[i].getName())){
        System.out.print(i);
        return;
      }
    }
    System.out.print("未收录该书");
  };




}
