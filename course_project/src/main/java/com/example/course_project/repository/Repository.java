package com.example.course_project.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.course_project.FoodData;

public interface Repository extends MongoRepository<FoodData, Long>{
    
    @Query("{ 'name' : ?0 }")
    FoodData findByName(String name);

    @Query("{ 'category' : ?0 }")
    List<FoodData> findByCategory(String category);

    @Query("{ 'price' : ?0 }")
    List<FoodData> findByPrice(int price);  // Find the foods below this prize

    @Query("{ 'rating' : ?0 }")
    List<FoodData> findByRating(int rating);  // Find the foods above this rating
}
