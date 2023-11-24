/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author hp
 */
public class Dish {

    private String name;

    private double price;

    private int calories;

    private String type;

    public Dish() {
        
    }

    public Dish(String name, double price, int calories, String type) {

        this.name = name;

        this.price = price;

        this.calories = calories;

        this.type = type;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public double getPrice() {

        return price;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    public int getCalories() {

        return calories;

    }

    public void setCalories(int calories) {

        this.calories = calories;

    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    @Override

    public boolean equals(Object obj) {

        Dish object = (Dish) obj;

        return (object.getName().equals(name));

    }

    @Override

    public String toString() {

        return "dish{" + "name : " + name + ", price : " + price + ", calories : " + calories + ", type : " + type + '}';

    }

}
