/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package modelos;

/**
 *
 * @author mbarz
 */
public class RamirezJ_BarzalloM {

    public static void main(String[] args) {
        
        Guerrero g = new Guerrero(1, "a", "si", "no", "au");
        
        Guerrero a = (Guerrero)g.clone();
        System.out.println(a);
    }
}
