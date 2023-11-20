/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author mbarz
 */
public class Guerrero extends Personaje{
    private int fuerza;

    public Guerrero() {
    }

    public Guerrero(int fuerza) {
        this.fuerza = fuerza;
    }

    public Guerrero(int fuerza, String imagen, String nombre, String habilidad, String equipo) {
        super(imagen, nombre, habilidad, equipo);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
