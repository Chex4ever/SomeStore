package pro.sky.exever.store;

import java.util.Collection;

public interface OrderService {
    void add(Collection<Integer> ids);
    int[] get();
}
