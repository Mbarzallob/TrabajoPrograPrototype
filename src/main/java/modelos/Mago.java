/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author mbarz
 */
public class Mago extends Personaje{
    private int encanto;

    public Mago() {
    }

    public Mago(int encanto) {
        this.encanto = encanto;
    }

    public Mago(int encanto, String imagen, String nombre, String habilidad, String equipo) {
        super(imagen, nombre, habilidad, equipo);
        this.encanto = encanto;
    }

    public int getEncanto() {
        return encanto;
    }

    public void setEncanto(int encanto) {
        this.encanto = encanto;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
