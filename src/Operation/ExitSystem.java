package Operation;

import book.Booklist;

public class ExitSystem implements IOperation{
    public void work(Booklist booklist){
        System.out.println("退出系统");
        System.exit(0);

    }



}
