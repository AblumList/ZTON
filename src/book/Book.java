package book;

public class Book
{
    String name;
    int price;
    String Authur;
    String Type;
    int Pages;
    boolean isBorrowed;
    public Book(){

    };
    public Book(String name,int price,String Authur,boolean State,String Type)
    {
        this.name=name;
        this.price=price;
        this.Authur=Authur;
        this.Type=Type;
    }
    public void setPrice(int price){
        this.price=price;

    }
    public int getPrice(){
        return price;

    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setType(String type){
        this.Type=type;
    }

    public String getType(){
        return Type;
    }
    public void setAuthur(String authur){
        this.Authur=authur;
    }
    public String getAuthur(){
        return Authur;
    }

    public void setPages(int pages){
        this.Pages=pages;
    }
    public int getPages(){
        return Pages;
    }
    public void setBorrowed(boolean borrowed){
        this.isBorrowed=borrowed;
    }
    public boolean getisBorrowed(){
         return isBorrowed;
    }

    @Override
    public String toString() {
        return "book.Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Authur='" + Authur + '\'' +
                ", Type='" + Type + '\'' +
                ", Pages=" + Pages +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
