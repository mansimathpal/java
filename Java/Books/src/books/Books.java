package books;

public class Books {
    int page_num;
    String authorname, name;
    float price;
    
    public Books()
    {
        page_num = 50;
        authorname = "Andrew Jones";
        name = "The Living Ideas";
        price = 15.78f;
    }
    
    public void displayInfo()
    {
        System.out.println("The name of the book is" + name);
        System.out.println("The price of the book is" + price);
        System.out.println("The author name is" + authorname);
        System.out.println("The total number of pages is" + page_num);
    }
}

class PaperBooks extends Books
{
    int shippinngcharges = 10;
    
    public void printInfo()
    {
        displayInfo();
        System.out.println("The total shipping charges are" + shippinngcharges);
    }

    public static void main(String[] args) {
        PaperBooks pb = new PaperBooks();
        pb.printInfo();
    }
}    
