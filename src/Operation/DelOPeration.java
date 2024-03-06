package Operation;

import book.Booklist;

import java.util.Scanner;

public class DelOPeration implements IOperation{
    public void work(Booklist booklist){
        int numBooks= booklist.numBooks;
       System.out.println( "删除图书");
        Scanner in=new Scanner(System.in);
        System.out.print("请输入书名：");
        String name=in.nextLine();

        for (int i=0;i< numBooks;i++){

            if (name.equals(booklist.books[i].getName())) {
                int j=0;
                for (j=i;j<numBooks-1;j++){
                    booklist.books[j]=booklist.books[j+1];

                }
                booklist.books[j]=null;
                booklist.numBooks--;
                return;
            }

        }
    }
}
