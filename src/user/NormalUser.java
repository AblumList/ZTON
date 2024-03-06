package user;

import Operation.*;

import java.util.Scanner;

public class NormalUser extends user{
public NormalUser(String name){
    super(name);
    this.iOperations=new  IOperation[]{
            new ExitSystem(),
            new SerchOperation(),
            new BorrowOpration(),
            new ReturnOperation(),


    };
    this.conust=4;

}
public int menu(){
    System.out.println("————————————————————————");
    System.out.println("1.查找图书");
    System.out.println("2.借阅图书");
    System.out.println("3.归还图书");
    System.out.println("0.退出系统");
    Scanner in=new Scanner(System.in);
    return in.nextInt();
}


}
