package mk.ukim.finki.aud.repository;

import mk.ukim.finki.aud.bootstrap.DataHolder;
import mk.ukim.finki.aud.model.ShoppingCart;
import mk.ukim.finki.aud.model.enumeration.ShoppingCartStatus;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class InMemoryShoppingCartRepository {
    public Optional<ShoppingCart> findById(Long id){
        return DataHolder.shoppingCarts.stream().filter(i->i.getId().equals(id)).findFirst();
    }
    public ShoppingCart save(ShoppingCart shoppingCart){
        DataHolder.shoppingCarts.removeIf(i->i.getUser().getUsername().equals(shoppingCart.getUser()));
        DataHolder.shoppingCarts.add(shoppingCart);
        return shoppingCart;
    }
    public Optional<ShoppingCart> findByUsernameAndStatus(String username, ShoppingCartStatus status){
        return DataHolder.shoppingCarts.stream()
                .filter(i->i.getUser().getUsername().equals(username)&&i.getStatus().equals(status))
                .findFirst();
    }


}
