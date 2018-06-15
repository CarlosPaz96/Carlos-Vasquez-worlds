/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosernestovasquezpaz.world;

/**
 *
 * @author UCA
 */
public class Extractores_de_elixis implements edificio{

    @Override
    public String nombre(String raza) {
        return "Extractor de elixir de los " + raza;
    }

    @Override
    public int nivel(int nivel) {
        return nivel;
    }

    @Override
    public int cont(int elixis) {
        return elixis;
    }

    @Override
    public int vida() {
        int vida=500;
        return vida;
    }
    
}
