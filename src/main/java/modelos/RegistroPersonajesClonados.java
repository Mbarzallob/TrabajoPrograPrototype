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
    private static List<Personaje> listaPersonajes;

    public RegistroPersonajesClonados() {
        listaPersonajes = new ArrayList<>();
    }

    public static void loadCache() {
        Guerrero guerrero = new Guerrero(1, "caballero.png", "Guerrero", "Golpe", "UPS");
        mapPersonaje.put("Guerrero", guerrero);
        Mago mago = new Mago(1, "mago.png", "Mago", "Fuego", "UPS");
        mapPersonaje.put("Mago", mago);
        for (int i = 0; i < 5; i++) {
            listaPersonajes.add(guerrero.clone());
            listaPersonajes.add(mago.clone());
        }
    }

    public void actualizarPersonaje(Personaje personaje) {
        for (int i = 0; i < listaPersonajes.size(); i++) {
            if (listaPersonajes.get(i).getNombre().equals(personaje.getNombre())) {
                listaPersonajes.set(i, personaje);
                break;
            }
        }
    }

    public void eliminarPersonaje(Personaje personaje) {
        listaPersonajes.remove(personaje);
    }

    public List<Personaje> getListaPersonajes() {
        return listaPersonajes;
    }

    public static Map<String, Personaje> getMapPersonaje() {
        return mapPersonaje;
    }

}
