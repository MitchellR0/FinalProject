/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

/**
 *
 * @author mitch
 */
public class newPokemon {
    private final String name;
    private final Type[] types;
    private Stats[] stats;
    private double maxHealth;
    private double currentHealth;
    private int attack;
    private PokeImage sprites;
    private boolean isAlive = true;
    
    
    public newPokemon(String name, int id, Type[] types, Stats[] stats){
        this.name = name;
        this.types = types;
        this.stats = stats;
    }
    
    public void initialLoadStats(){
        maxHealth = (stats[0].base_stat * 3) + (stats[2].base_stat / 2);
        currentHealth = maxHealth;
        attack = stats[1].base_stat;
        isAlive = true;
    }
    
    public String getName(){
        return name;
    }
    
    public String getFullInfo(){
        if (types.length == 2){
            return name + " " + types[0].type.name + " " + types[1].type.name;
        } else {
            return name + " " + types[0].type.name;
        }
    }
    
    public Type[] getTypes(){
        return types;
    }
    
    public PokeImage getSprites(){
        return sprites;
    }
    
    public boolean getIsAlive(){
        return isAlive;
    }
    
    public double getMaxHealth(){
        return maxHealth;
    }
    
    public double getCurrentHealth(){
        return currentHealth;
    }
    
    public int getAttackPower(){
        return attack;
    }
    
    public void attacked(double amount){
        currentHealth = currentHealth - amount;
        if (currentHealth <= 0){
            isAlive = false;
        }   
    }
    
    public void setCurrentHealth(){
        currentHealth = maxHealth;
    }
}
