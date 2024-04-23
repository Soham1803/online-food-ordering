package com.example.course_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course_project.repository.Repository;

@RestController

@RequestMapping("")
public class Controller {

    @Autowired
    private Repository repository;

    @PostMapping("/addfooditems")
    public ResponseEntity<?> addFoodItems(@RequestBody FoodData foodData) {

        FoodData savedFoodData = this.repository.save(foodData); 
        return ResponseEntity.ok(savedFoodData);
    }

    @GetMapping("/getfooditems")
    public ResponseEntity<?> getFoodItems() {

        return ResponseEntity.ok(this.repository.findAll());
    }

    @GetMapping("/getfooditemsbycategory")
    public ResponseEntity<?> getFoodItemsByCategory(@RequestBody String category) {

        return ResponseEntity.ok(this.repository.findByCategory(category));
    }

    @GetMapping("/getfooditemsbyprice")
    public ResponseEntity<?> getFoodItemsByPrice(@RequestBody int price) {

        return ResponseEntity.ok(this.repository.findByPrice(price));
    }

    @GetMapping("/getfooditemsbyrating")
    public ResponseEntity<?> getFoodItemsByRating(@RequestBody int rating) {

        return ResponseEntity.ok(this.repository.findByRating(rating));
    }

    
}
