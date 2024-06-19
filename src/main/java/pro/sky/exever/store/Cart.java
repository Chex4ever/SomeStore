package pro.sky.exever.store;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> cart = new ArrayList<>();

    public void add(List<Integer> ids){
        cart.addAll(ids);
    }

    public List<Integer> get(){
        return Collections.unmodifiableList(cart);
    }
}
