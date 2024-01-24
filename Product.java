import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

class Product {
    String productName;
    String productType;
    double price;

    public Product(String productName, String productType, double price) {
        this.productName = productName;
        this.productType = productType;
        this.price = price;
    }
}

class UserSearch {
    String userName;
    String searchText;
    String productType;
    Date searchDate;

    public UserSearch(String userName, String searchText, String productType, Date searchDate) {
        this.userName = userName;
        this.searchText = searchText;
        this.productType = productType;
        this.searchDate = searchDate;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product>products = generateProducts();
        List<UserSearch>searches = generateUserSearches();

       
        displayRecentProducts("User1", searches, products);
        displayMostSearchedProductType("User1", searches, products);
    }

    private static List<Product> generateProducts() {
        List<Product>products = new ArrayList<>();
        Random random = new Random();

        String[] productTypes = {"Phones", "Laptops", "Cosmetics", "Home Decor", "TVs", "Appliances", "Clothing", "Books", "Fitness", "Gaming"};

        for (int i = 0; i < 50; i++) {
            String productName = "Product" + (i + 1);
            String productType = productTypes[random.nextInt(productTypes.length)];
            double price = random.nextDouble() * 1000;
            products.add(new Product(productName, productType, price));
        }

        return products;
    }

    private static List<UserSearch> generateUserSearches() {
        List<UserSearch> searches = new ArrayList<>();
        Random random = new Random();
        Date currentDate = new Date();
        Date startOfMonth = new Date(currentDate.getYear(), currentDate.getMonth(), 1);

        String[] userNames = {"User1", "User2", "User3", "User4", "User5"};
        String[] productTypes = {"Phones", "Laptops", "Cosmetics", "Home Decor", "TVs", "Appliances", "Clothing", "Books", "Fitness", "Gaming"};

        for (String userName : userNames) {
            for (int i = 0; i < 20; i++) {
                String searchText = "Search for " + products.get(random.nextInt(products.size())).productName;
                String productType = productTypes[random.nextInt(productTypes.length)];
                Date searchDate = new Date(startOfMonth.getTime() + (long) (Math.random() * (currentDate.getTime() - startOfMonth.getTime())));
                searches.add(new UserSearch(userName, searchText, productType, searchDate));
            }
        }

        return searches;
    }

    public void displayRecentProducts(String userName, List<UserSearch> searches, List<Product> products) {
        userNames=userName;
        this.List<UserSearch> searches=List<UserSearch> searches;
       productTypes=List<Product> products;
        
        System.out.println("USernamne is "+userName);
        System.out.println("LIST of usersearch is "+List<UserSearch> searches);
         System.out.println("LIST of product is "+List<Product> products);
    }
    private static void displayMostSearchedProductType(String userName, List<UserSearch> searches, List<Product> products) {
        this.userName=userName;
        this.List<UserSearch> searches=List<UserSearch> searches;
        this.List<Product> products=List<Product> products;
        
        System.out.println("USernamne is "+userName);
        System.out.println("LIST of usersearch is "+List<UserSearch> searches);
         System.out.println("LIST of product is "+List<Product> products);
    }
}
      
      
      
      
      
      
      
      
      
      
      
      
      
