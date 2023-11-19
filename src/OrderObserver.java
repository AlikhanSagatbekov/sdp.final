import java.util.ArrayList;
import java.util.List;

public interface OrderObserver {
    void update(Order order);
}

class Customer implements OrderObserver {
        private String name;

        public Customer(String name) {
            this.name = name;
        }

        @Override
        public void update(Order order) {
            System.out.println("Уважаемый " + name + ", статус вашего заказа изменен на: " + order.getStatus());
        }
    }


