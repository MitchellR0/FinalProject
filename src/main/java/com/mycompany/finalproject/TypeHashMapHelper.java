/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

import java.util.HashMap;

/**
 *
 * @author mitch
 */
public class TypeHashMapHelper {
    
    //hashmap of all type advantages
    //to lookup you use the attackers type first then the defenders type second
    private final HashMap<String, HashMap<String, Double>> typeMap = new HashMap<>();
    
    public TypeHashMapHelper(){
        generateMap();
    }
    
    public double getTypeMatchup(String attackType, String defendType){
        return typeMap.get(attackType).get(defendType);
    }
    
    //Setting up the map
    private void generateMap(){
        HashMap<String, Double> normalMap = new HashMap<>();
        
        normalMap.put("normal", 1.0);
        normalMap.put("fire", 1.0);
        normalMap.put("water", 1.0);
        normalMap.put("grass", 1.0);
        normalMap.put("electric", 1.0);
        normalMap.put("ice", 1.0);
        normalMap.put("fighting", 1.0);
        normalMap.put("poison", 1.0);
        normalMap.put("ground", 1.0);
        normalMap.put("flying", 1.0);
        normalMap.put("psychic", 1.0);
        normalMap.put("bug", 1.0);
        normalMap.put("rock", 0.5);
        normalMap.put("ghost", 0.0);
        normalMap.put("dragon", 1.0);
        normalMap.put("dark", 1.0);
        normalMap.put("steel", 0.5);
        normalMap.put("fairy", 1.0);
        
        typeMap.put("normal", normalMap);
        
        HashMap<String, Double> fireMap = new HashMap<>();
        
        fireMap.put("normal", 1.0);
        fireMap.put("fire", 0.5);
        fireMap.put("water", 0.5);
        fireMap.put("grass", 2.0);
        fireMap.put("electric", 1.0);
        fireMap.put("ice", 2.0);
        fireMap.put("fighting", 1.0);
        fireMap.put("poison", 1.0);
        fireMap.put("ground", 1.0);
        fireMap.put("flying", 1.0);
        fireMap.put("psychic", 1.0);
        fireMap.put("bug", 2.0);
        fireMap.put("rock", 0.5);
        fireMap.put("ghost", 1.0);
        fireMap.put("dragon", 0.5);
        fireMap.put("dark", 1.0);
        fireMap.put("steel", 2.0);
        fireMap.put("fairy", 1.0);
        
        typeMap.put("fire", fireMap);
        
        HashMap<String, Double> waterMap = new HashMap<>();
        
        waterMap.put("normal", 1.0);
        waterMap.put("fire", 2.0);
        waterMap.put("water", 0.5);
        waterMap.put("grass", 0.5);
        waterMap.put("electric", 1.0);
        waterMap.put("ice", 1.0);
        waterMap.put("fighting", 1.0);
        waterMap.put("poison", 1.0);
        waterMap.put("ground", 2.0);
        waterMap.put("flying", 1.0);
        waterMap.put("psychic", 1.0);
        waterMap.put("bug", 1.0);
        waterMap.put("rock", 2.0);
        waterMap.put("ghost", 1.0);
        waterMap.put("dragon", 0.5);
        waterMap.put("dark", 1.0);
        waterMap.put("steel", 1.0);
        waterMap.put("fairy", 1.0);
        
        typeMap.put("water", waterMap);
        
        HashMap<String, Double> grassMap = new HashMap<>();
        
        grassMap.put("normal", 1.0);
        grassMap.put("fire", 0.5);
        grassMap.put("water", 2.0);
        grassMap.put("grass", 0.5);
        grassMap.put("electric", 1.0);
        grassMap.put("ice", 1.0);
        grassMap.put("fighting", 1.0);
        grassMap.put("poison", 0.5);
        grassMap.put("ground", 2.0);
        grassMap.put("flying", 0.5);
        grassMap.put("psychic", 1.0);
        grassMap.put("bug", 0.5);
        grassMap.put("rock", 2.0);
        grassMap.put("ghost", 1.0);
        grassMap.put("dragon", 0.5);
        grassMap.put("dark", 1.0);
        grassMap.put("steel", 0.5);
        grassMap.put("fairy", 1.0);
        
        typeMap.put("grass", grassMap);
        
        HashMap<String, Double> electricMap = new HashMap<>();
        
        electricMap.put("normal", 1.0);
        electricMap.put("fire", 1.0);
        electricMap.put("water", 2.0);
        electricMap.put("grass", 0.5);
        electricMap.put("electric", 0.5);
        electricMap.put("ice", 1.0);
        electricMap.put("fighting", 1.0);
        electricMap.put("poison", 1.0);
        electricMap.put("ground", 0.0);
        electricMap.put("flying", 2.0);
        electricMap.put("psychic", 1.0);
        electricMap.put("bug", 1.0);
        electricMap.put("rock", 1.0);
        electricMap.put("ghost", 1.0);
        electricMap.put("dragon", 0.5);
        electricMap.put("dark", 1.0);
        electricMap.put("steel", 1.0);
        electricMap.put("fairy", 1.0);
        
        typeMap.put("electric", electricMap);
        
        HashMap<String, Double> iceMap = new HashMap<>();
        
        iceMap.put("normal", 1.0);
        iceMap.put("fire", 0.5);
        iceMap.put("water", 0.5);
        iceMap.put("grass", 2.0);
        iceMap.put("electric", 1.0);
        iceMap.put("ice", 0.5);
        iceMap.put("fighting", 1.0);
        iceMap.put("poison", 1.0);
        iceMap.put("ground", 2.0);
        iceMap.put("flying", 2.0);
        iceMap.put("psychic", 1.0);
        iceMap.put("bug", 1.0);
        iceMap.put("rock", 1.0);
        iceMap.put("ghost", 1.0);
        iceMap.put("dragon", 2.0);
        iceMap.put("dark", 1.0);
        iceMap.put("steel", 0.5);
        iceMap.put("fairy", 1.0);
        
        typeMap.put("ice", iceMap);
        
        HashMap<String, Double> fightingMap = new HashMap<>();
        
        fightingMap.put("normal", 2.0);
        fightingMap.put("fire", 1.0);
        fightingMap.put("water", 1.0);
        fightingMap.put("grass", 1.0);
        fightingMap.put("electric", 1.0);
        fightingMap.put("ice", 2.0);
        fightingMap.put("fighting", 1.0);
        fightingMap.put("poison", 0.5);
        fightingMap.put("ground", 1.0);
        fightingMap.put("flying", 0.5);
        fightingMap.put("psychic", 0.5);
        fightingMap.put("bug", 0.5);
        fightingMap.put("rock", 2.0);
        fightingMap.put("ghost", 0.0);
        fightingMap.put("dragon", 1.0);
        fightingMap.put("dark", 2.0);
        fightingMap.put("steel", 2.0);
        fightingMap.put("fairy", 0.5);
        
        typeMap.put("fighting", fightingMap);
        
        HashMap<String, Double> poisonMap = new HashMap<>();
        
        poisonMap.put("normal", 1.0);
        poisonMap.put("fire", 1.0);
        poisonMap.put("water", 1.0);
        poisonMap.put("grass", 2.0);
        poisonMap.put("electric", 1.0);
        poisonMap.put("ice", 1.0);
        poisonMap.put("fighting", 1.0);
        poisonMap.put("poison", 0.5);
        poisonMap.put("ground", 0.5);
        poisonMap.put("flying", 1.0);
        poisonMap.put("psychic", 1.0);
        poisonMap.put("bug", 1.0);
        poisonMap.put("rock", 0.5);
        poisonMap.put("ghost", 0.5);
        poisonMap.put("dragon", 1.0);
        poisonMap.put("dark", 1.0);
        poisonMap.put("steel", 0.0);
        poisonMap.put("fairy", 2.0);
        
        typeMap.put("poison", poisonMap);
        
        HashMap<String, Double> groundMap = new HashMap<>();
        
        groundMap.put("normal", 1.0);
        groundMap.put("fire", 2.0);
        groundMap.put("water", 1.0);
        groundMap.put("grass", 0.5);
        groundMap.put("electric", 2.0);
        groundMap.put("ice", 1.0);
        groundMap.put("fighting", 1.0);
        groundMap.put("poison", 2.0);
        groundMap.put("ground", 1.0);
        groundMap.put("flying", 0.0);
        groundMap.put("psychic", 1.0);
        groundMap.put("bug", 0.5);
        groundMap.put("rock", 2.0);
        groundMap.put("ghost", 1.0);
        groundMap.put("dragon", 1.0);
        groundMap.put("dark", 1.0);
        groundMap.put("steel", 2.0);
        groundMap.put("fairy", 1.0);
        
        typeMap.put("ground", groundMap);
        
        HashMap<String, Double> flyingMap = new HashMap<>();
        
        flyingMap.put("normal", 1.0);
        flyingMap.put("fire", 1.0);
        flyingMap.put("water", 1.0);
        flyingMap.put("grass", 2.0);
        flyingMap.put("electric", 0.5);
        flyingMap.put("ice", 1.0);
        flyingMap.put("fighting", 2.0);
        flyingMap.put("poison", 1.0);
        flyingMap.put("ground", 1.0);
        flyingMap.put("flying", 1.0);
        flyingMap.put("psychic", 1.0);
        flyingMap.put("bug", 2.0);
        flyingMap.put("rock", 0.5);
        flyingMap.put("ghost", 1.0);
        flyingMap.put("dragon", 1.0);
        flyingMap.put("dark", 1.0);
        flyingMap.put("steel", 0.5);
        flyingMap.put("fairy", 1.0);
        
        typeMap.put("flying", flyingMap);
        
        HashMap<String, Double> psychicMap = new HashMap<>();
        
        psychicMap.put("normal", 1.0);
        psychicMap.put("fire", 1.0);
        psychicMap.put("water", 1.0);
        psychicMap.put("grass", 1.0);
        psychicMap.put("electric", 1.0);
        psychicMap.put("ice", 1.0);
        psychicMap.put("fighting", 2.0);
        psychicMap.put("poison", 2.0);
        psychicMap.put("ground", 1.0);
        psychicMap.put("flying", 1.0);
        psychicMap.put("psychic", 0.5);
        psychicMap.put("bug", 1.0);
        psychicMap.put("rock", 1.0);
        psychicMap.put("ghost", 1.0);
        psychicMap.put("dragon", 1.0);
        psychicMap.put("dark", 0.0);
        psychicMap.put("steel", 0.5);
        psychicMap.put("fairy", 1.0);
        
        typeMap.put("psychic", psychicMap);
        
        HashMap<String, Double> bugMap = new HashMap<>();
        
        bugMap.put("normal", 1.0);
        bugMap.put("fire", 0.5);
        bugMap.put("water", 1.0);
        bugMap.put("grass", 2.0);
        bugMap.put("electric", 1.0);
        bugMap.put("ice", 1.0);
        bugMap.put("fighting", 0.5);
        bugMap.put("poison", 0.5);
        bugMap.put("ground", 1.0);
        bugMap.put("flying", 0.5);
        bugMap.put("psychic", 2.0);
        bugMap.put("bug", 1.0);
        bugMap.put("rock", 1.0);
        bugMap.put("ghost", 0.5);
        bugMap.put("dragon", 1.0);
        bugMap.put("dark", 2.0);
        bugMap.put("steel", 0.5);
        bugMap.put("fairy", 0.5);
        
        typeMap.put("bug", bugMap);
        
        HashMap<String, Double> rockMap = new HashMap<>();
        
        rockMap.put("normal", 1.0);
        rockMap.put("fire", 2.0);
        rockMap.put("water", 1.0);
        rockMap.put("grass", 1.0);
        rockMap.put("electric", 1.0);
        rockMap.put("ice", 2.0);
        rockMap.put("fighting", 0.5);
        rockMap.put("poison", 1.0);
        rockMap.put("ground", 0.5);
        rockMap.put("flying", 2.0);
        rockMap.put("psychic", 1.0);
        rockMap.put("bug", 2.0);
        rockMap.put("rock", 1.0);
        rockMap.put("ghost", 1.0);
        rockMap.put("dragon", 1.0);
        rockMap.put("dark", 1.0);
        rockMap.put("steel", 0.5);
        rockMap.put("fairy", 1.0);
        
        typeMap.put("rock", rockMap);
        
        HashMap<String, Double> ghostMap = new HashMap<>();
        
        ghostMap.put("normal", 0.0);
        ghostMap.put("fire", 1.0);
        ghostMap.put("water", 1.0);
        ghostMap.put("grass", 1.0);
        ghostMap.put("electric", 1.0);
        ghostMap.put("ice", 1.0);
        ghostMap.put("fighting", 1.0);
        ghostMap.put("poison", 1.0);
        ghostMap.put("ground", 1.0);
        ghostMap.put("flying", 1.0);
        ghostMap.put("psychic", 2.0);
        ghostMap.put("bug", 1.0);
        ghostMap.put("rock", 1.0);
        ghostMap.put("ghost", 2.0);
        ghostMap.put("dragon", 1.0);
        ghostMap.put("dark", 0.5);
        ghostMap.put("steel", 1.0);
        ghostMap.put("fairy", 1.0);
        
        typeMap.put("ghost", ghostMap);
        
        HashMap<String, Double> dragonMap = new HashMap<>();
        
        dragonMap.put("normal", 1.0);
        dragonMap.put("fire", 1.0);
        dragonMap.put("water", 1.0);
        dragonMap.put("grass", 1.0);
        dragonMap.put("electric", 1.0);
        dragonMap.put("ice", 1.0);
        dragonMap.put("fighting", 1.0);
        dragonMap.put("poison", 1.0);
        dragonMap.put("ground", 1.0);
        dragonMap.put("flying", 1.0);
        dragonMap.put("psychic", 1.0);
        dragonMap.put("bug", 1.0);
        dragonMap.put("rock", 1.0);
        dragonMap.put("ghost", 1.0);
        dragonMap.put("dragon", 2.0);
        dragonMap.put("dark", 1.0);
        dragonMap.put("steel", 0.5);
        dragonMap.put("fairy", 0.0);
        
        typeMap.put("dragon", dragonMap);
        
        HashMap<String, Double> darkMap = new HashMap<>();
        
        darkMap.put("normal", 1.0);
        darkMap.put("fire", 1.0);
        darkMap.put("water", 1.0);
        darkMap.put("grass", 1.0);
        darkMap.put("electric", 1.0);
        darkMap.put("ice", 1.0);
        darkMap.put("fighting", 0.5);
        darkMap.put("poison", 1.0);
        darkMap.put("ground", 1.0);
        darkMap.put("flying", 1.0);
        darkMap.put("psychic", 2.0);
        darkMap.put("bug", 1.0);
        darkMap.put("rock", 1.0);
        darkMap.put("ghost", 2.0);
        darkMap.put("dragon", 1.0);
        darkMap.put("dark", 0.5);
        darkMap.put("steel", 1.0);
        darkMap.put("fairy", 0.5);
        
        typeMap.put("dark", darkMap);
        
        HashMap<String, Double> steelMap = new HashMap<>();
        
        steelMap.put("normal", 1.0);
        steelMap.put("fire", 0.5);
        steelMap.put("water", 0.5);
        steelMap.put("grass", 1.0);
        steelMap.put("electric", 0.5);
        steelMap.put("ice", 2.0);
        steelMap.put("fighting", 1.0);
        steelMap.put("poison", 1.0);
        steelMap.put("ground", 1.0);
        steelMap.put("flying", 1.0);
        steelMap.put("psychic", 1.0);
        steelMap.put("bug", 1.0);
        steelMap.put("rock", 2.0);
        steelMap.put("ghost", 1.0);
        steelMap.put("dragon", 1.0);
        steelMap.put("dark", 1.0);
        steelMap.put("steel", 0.5);
        steelMap.put("fairy", 2.0);
        
        typeMap.put("steel", steelMap);
        
        HashMap<String, Double> fairyMap = new HashMap<>();
        
        fairyMap.put("normal", 1.0);
        fairyMap.put("fire", 0.5);
        fairyMap.put("water", 1.0);
        fairyMap.put("grass", 1.0);
        fairyMap.put("electric", 1.0);
        fairyMap.put("ice", 1.0);
        fairyMap.put("fighting", 2.0);
        fairyMap.put("poison", 0.5);
        fairyMap.put("ground", 1.0);
        fairyMap.put("flying", 1.0);
        fairyMap.put("psychic", 1.0);
        fairyMap.put("bug", 1.0);
        fairyMap.put("rock", 1.0);
        fairyMap.put("ghost", 1.0);
        fairyMap.put("dragon", 2.0);
        fairyMap.put("dark", 2.0);
        fairyMap.put("steel", 0.5);
        fairyMap.put("fairy", 1.0);
        
        typeMap.put("fairy", fairyMap);
    }
    
}
