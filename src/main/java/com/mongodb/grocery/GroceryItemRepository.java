package com.mongodb.grocery;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroceryItemRepository extends MongoRepository<GroceryItem, String> {
}
