package mk.ukim.finki.aud.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.aud.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    public static List<ShoppingCart> shoppingCarts= new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();
    @PostConstruct  //vednas stom se pristapuva klasata se povikuva ovoj metod
    public  void init(){
        categories.add(new Category("Movies", "Movies Category"));
        categories.add(new Category("Books", "Book Category"));

        users.add(new User("elena.kolevska", "ek", "Elena", "Kolevska"));
        users.add(new User("ljubica.jovanoska", "lj", "Ljubica", "Jovanoska"));

        Manufacturer manufacturer = new Manufacturer("Nike","NY NY");
        manufacturers.add(manufacturer);
        Category category = new Category("Sport","sport category");
        categories.add(category);
        products.add(new Product("Ball",300.00,7,category,manufacturer));
        products.add(new Product("Ball2",300.00,7,category,manufacturer));
        products.add(new Product("Ball3",300.00,7,category,manufacturer));
    }
}
