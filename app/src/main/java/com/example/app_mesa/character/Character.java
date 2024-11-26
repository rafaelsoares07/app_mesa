package com.example.app_mesa.character;

public class Character {
    private String name;
    private int age;
    private int foodLevel;
    private int happinessLevel;
    private int energyLevel;
    private int healthLevel;

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public void setFoodLevel(int foodLevel) {
        this.foodLevel = foodLevel;
    }


    public Character() {
        this.name = "John Doe";
        this.age = 0;
        this.foodLevel = 100;
        this.happinessLevel = 100;
        this.energyLevel = 100;
        this.healthLevel = 100;
    }

    public Character(String name, int age, int foodLevel, int happinessLevel, int energyLevel, int healthLevel) {
        this.name = name;
        this.age = age;
        this.foodLevel = 100;
        this.happinessLevel = 100;
        this.energyLevel = 100;
        this.healthLevel = 100;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", foodLevel=" + foodLevel +
                ", happinessLevel=" + happinessLevel +
                ", energyLevel=" + energyLevel +
                ", healthLevel=" + healthLevel +
                '}';
    }

    public void updateCharacter(long minutesPassed) {
        int reduction = (int) ((int) minutesPassed);
        foodLevel = Math.max(foodLevel - reduction, 0);
        happinessLevel = Math.max(happinessLevel - reduction, 0);
        energyLevel = Math.max(energyLevel - reduction, 0);
        healthLevel = Math.max(healthLevel - reduction, 0);
    }

    public void takeFood() {
        foodLevel = Math.min(foodLevel + 10, 100);
    }
}
