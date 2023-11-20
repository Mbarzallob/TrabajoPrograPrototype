/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author mbarz
 */
public class RegistroPersonajesClonados {
    private static Map<String, Personaje> mapPersonaje = new HashMap<>();
    private List<Personaje> listaPersonajes;

    public RegistroPersonajesClonados() {
        listaPersonajes = new ArrayList<>();
    }
    
    public static void loadCache(){
        Guerrero guerrero = new Guerrero(1, "", "Guerrero", "Golpe", "UPS");
        mapPersonaje.put("Guerrero", guerrero);
        Mago mago = new Mago(1, "", "Mago", "Fuego", "UPS");
        mapPersonaje.put("Mago", mago);
    }


        
    public List<Personaje> getListaPersonajes() {
        return listaPersonajes;
    }

    public static Map<String, Personaje> getMapPersonaje() {
        return mapPersonaje;
    }

    
    
    
}
