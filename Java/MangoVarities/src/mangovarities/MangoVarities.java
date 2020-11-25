package mangovarities;

enum Mango{Carrie(10), Fairchild(9), Haden(12);
    private int price;
    Mango(int p)
    {
        price = p;
    }
    int getPrice()
    {
      return price;  
    }
    }

     class MangoVarities {
       public static void main(String[] args) {
        Mango p = Mango.Carrie;
        System.out.println(p.getPrice());
    }
}
