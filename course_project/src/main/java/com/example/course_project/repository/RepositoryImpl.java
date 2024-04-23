package com.example.course_project.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.example.course_project.FoodData;

@Document(collection = "foodData")
public class RepositoryImpl {

    @Autowired
    MongoTemplate mongoTemplate;

    public FoodData findByName(String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name));
        return mongoTemplate.findOne(query, FoodData.class);
    }

 
    public List<FoodData> findByCategory(String category) {
        return null;
    }

    public List<FoodData> findByPrice(int price) {
        return null;
    }


    public List<FoodData> findByRating(int rating) {
        return null;
    }
    
}
