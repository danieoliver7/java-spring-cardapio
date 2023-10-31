package com.example.cardapio.food;

public record FoodResposeDTO(Long id, String title, String image, Integer price) {

    public FoodResposeDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
    
}
