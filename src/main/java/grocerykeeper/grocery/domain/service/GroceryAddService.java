package grocerykeeper.grocery.domain.service;

import grocerykeeper.grocery.domain.entity.Grocery;
import grocerykeeper.grocery.repository.GroceryRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GroceryAddService {
    private GroceryRepository groceryRepository;

    public GroceryAddService(GroceryRepository groceryRepository) {
        this.groceryRepository = groceryRepository;
    }

    @Transactional
    public void add(
        String name,
        String manufacturer
    ) {
        Grocery newGrocery = new Grocery(name, manufacturer);
        groceryRepository.save(newGrocery);
    }
}
