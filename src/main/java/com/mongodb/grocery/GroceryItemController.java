package com.mongodb.grocery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

@RestController
@RequestMapping("/grocery-items")
public class GroceryItemController {

    @Autowired
    GroceryItemRepository groceryItemRepository;

    @GetMapping("/{id}")
    public GroceryItem getItem(@PathVariable("id") String id){
        return groceryItemRepository.findById(id).orElse(null);
    }

    @PostMapping()
    public GroceryItem saveItem(@RequestBody GroceryItem groceryItem){
        return groceryItemRepository.save(groceryItem);
    }

    @GetMapping("/dummy-item")
    public GroceryItem saveDummyItem() throws NoSuchAlgorithmException {

        GroceryItem groceryItem = GroceryItem.builder()
                .id(UUID.randomUUID().toString())
                .name(UUID.randomUUID().toString())
                .category(UUID.randomUUID().toString())
                .quantity(SecureRandom.getInstanceStrong().nextInt())
                .build();

        return groceryItemRepository.save(groceryItem);
    }

}
