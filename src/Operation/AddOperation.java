package Operation;
import book.Booklist;


import book.Book;
import java.util.Scanner;

public class AddOperation implements IOperation{
    public  void work(Booklist list){
        System.out.println("添加图书");
        Scanner in=new Scanner(System.in);
        list.books[list.numBooks]=new Book();
        System.out.print("请输入书名");
        list.books[list.numBooks].setName(in.nextLine());
        System.out.print("请输入作者");
        list.books[list.numBooks].setAuthur(in.nextLine());
        System.out.print("请输入所属书类");
        list.books[list.numBooks].setType(in.nextLine());
        System.out.print("请输入价格");
        list.books[list.numBooks].setPrice(in.nextInt());
        list.numBooks++;


    }

}
