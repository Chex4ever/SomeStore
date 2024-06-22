package pro.sky.exever.store;

import java.util.List;

public interface OrderService {
    void add(List<Integer> ids);
    List<Integer> get();
}
