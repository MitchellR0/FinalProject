/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mitch
 */
public class URLHelper {
    private Gson gson;
    
    public URLHelper(){
        gson = new Gson();
    }
    
    public newPokemon getPokemon(int i){
    // code from: https://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html
        
        URL pokemon;
        try {
            pokemon = new URL("https://pokeapi.co/api/v2/pokemon/" + i + "/");
            URLConnection yc = pokemon.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                                        yc.getInputStream()));
            String inputLine;
            StringBuilder sb = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                sb.append(inputLine);
            }
            newPokemon p = gson.fromJson(sb.toString(), newPokemon.class);
            in.close();
            return p;
        } catch (MalformedURLException ex) {
            //make an error message
            return null;
        } catch (IOException ex) {
            //make an error message
            return null;
        }
        
    }
}
