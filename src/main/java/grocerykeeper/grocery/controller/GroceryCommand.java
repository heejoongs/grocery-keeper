package grocerykeeper.grocery.controller;

import grocerykeeper.grocery.domain.service.GroceryAddService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroceryCommand {
    private GroceryAddService addService;

    public GroceryCommand(GroceryAddService addService) {
        this.addService = addService;
    }

    @PostMapping("/groceries")
    public void create(
        @RequestBody
        GroceryParam groceryParam
    ) {
        addService.add(
            groceryParam.getName(),
            groceryParam.getManufacturer()
        );

    }
}
