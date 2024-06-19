package pro.sky.exever.store;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(List<Integer> ids) {
        cart.add(ids);
    }

    @Override
    public List<Integer> get() {
        return cart.get();
    }
}
