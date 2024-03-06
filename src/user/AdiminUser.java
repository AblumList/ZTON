package user;

import Operation.*;

import java.util.Scanner;

public class AdiminUser extends user  {

    public AdiminUser(String name){
        super(name);
         this.iOperations = new IOperation[] {
                 new ExitSystem(),
                 new SerchOperation(),
                 new AddOperation(),
                 new DelOPeration(),
            new ShowOperation(),
           };
         this.conust=5;
    };
    public int menu( ){
        System.out.println("——————————————————————————————");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        Scanner in=new Scanner(System.in);
        return in.nextInt();

    }
}
