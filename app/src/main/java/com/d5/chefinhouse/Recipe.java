package com.d5.chefinhouse;

public class Recipe {
    private int id;
    private String name;
    private String image;
    private String description;
    private String ingredients;
    private String  Directions;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return Directions;
    }

    public void setDirections(String directions) {
        Directions = directions;
    }

    public Recipe(int id, String name, String image, String description, String ingredients, String directions) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.ingredients = ingredients;
        Directions = directions;
    }

}
