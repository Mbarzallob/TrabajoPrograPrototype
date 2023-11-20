/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author mbarz
 */
public abstract class Personaje implements Cloneable{
    private String imagen;
    private String nombre;
    private String habilidad;
    private String equipo;

    public Personaje() {
    }

    public Personaje(String imagen, String nombre, String habilidad, String equipo) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.equipo = equipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Personajes{" + "imagen=" + imagen + ", nombre=" + nombre + ", habilidad=" + habilidad + ", equipo=" + equipo + '}';
    }

    
    @Override
    public Personaje clone() {
        try {
            return (Personaje) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
