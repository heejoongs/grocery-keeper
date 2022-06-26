package grocerykeeper.grocery.repository;

import grocerykeeper.grocery.domain.entity.Grocery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryRepository
extends
    JpaRepository<Grocery, Long>
{
}
