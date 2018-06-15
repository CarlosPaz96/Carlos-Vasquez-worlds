/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosernestovasquezpaz.world;

/**
 *
 * @author CarlosPaz
 */
public class Acerraderos implements edificio {

    @Override
    public String nombre(String raza) {
        return "Acerradero de "+ raza;
    }

    @Override
    public int nivel(int nivel) {
        return nivel;
    }

    @Override
    public int cont(int madera) {
        return madera;
    }

    @Override
    public int vida() {
        int vida=500;
        return vida;
    }
        
    
}
