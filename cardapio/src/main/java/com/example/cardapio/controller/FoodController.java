package com.example.cardapio.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodResposeDTO;



@RestController
@RequestMapping("food")
public class FoodController {

        @Autowired
        private FoodRepository repository;

   
        @GetMapping
        public List<FoodResposeDTO> getAll(){

              List<FoodResposeDTO> foodlist = repository.findAll().stream().map(FoodResposeDTO::new).toList();

              return foodlist;

        }
}