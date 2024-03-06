package user;

import Operation.IOperation;
import book.Booklist;

public abstract class user {
    protected String name;
    IOperation[] iOperations;
     int conust;
    public user(String name){
        this.name=name;

    }
    public abstract int menu();
    public void dowork(int Choice, Booklist booklist){
      this.iOperations[Choice].work(booklist);



    }

}
