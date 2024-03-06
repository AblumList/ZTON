package Operation;

import book.Booklist;

public class ShowOperation implements IOperation{
    public void work(Booklist booklist){
        System.out.print("打印所有图书");
        for (int i=0;i< booklist.numBooks;i++){
            System.out.println(booklist.books[i].toString());
        }
    };

}
