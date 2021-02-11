import java.util.*;
public class Main{
    public static void main (String[] args) {
     try (Scanner sc=new Scanner(System.in)) {
        ArrayList<Products> a = new ArrayList<Products>();
        int price = 0, discountPercentage = 0;
        int discount = 0;
        int no = sc.nextInt();
        String productName = null;
        
        
        for (int i = 0; i < no; i++) {
            String input = sc.next();
            StringTokenizer st = new StringTokenizer(input, ",");
            while (st.hasMoreTokens()) {
                productName = st.nextToken();
                price = Integer.parseInt(st.nextToken());
                discountPercentage = Integer.parseInt(st.nextToken());
            }
            discount = (price * discountPercentage) / 100;
            Products p = new Products(productName, price, discountPercentage, discount);
            a.add(p);   
        }
        
        int min = a.get(0).discount;
        for (int i = 0; i < no; i++) {
            Products forObject = a.get(i);
            int comparePrice = forObject.discount;
            if (min > comparePrice) {
                min = comparePrice;
            }
        }
        
        for (int i = 0; i < no; i++) {
            Products forObject = a.get(i);
            int comparePrice = forObject.discount;
            if (min == comparePrice) {
                System.out.println("" + forObject.productName);
            }
        }
     }
    }
}

class Products {
    String productName;
    int price;
    int discount;
    int discountPercentage;
    
    
    public Products() {
        
    }
    
    public Products(String productName, int price, int discountPercentage, int discount) {
        this.productName = productName;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.discount = discount;
    }
}


