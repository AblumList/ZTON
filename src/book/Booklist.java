package book;


import java.util.ArrayList;
import java.util.List;

public class Booklist {
 public Book[] books;
 public int numBooks;

 public Booklist(){
  this.books=new Book[10];
  books[0]=new Book("西游记",10,"吴承恩",false,"小说");
  books[1]=new Book("红楼梦",9,"曹雪芹",false,"小说");
  this.numBooks=2;
 }




}
