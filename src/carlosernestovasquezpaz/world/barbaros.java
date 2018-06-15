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
public class barbaros implements raza{

    @Override
    public String nombre() {
        int hola;
        hola = poder();
           return "BARBAROS"+hola;
    }
    
    public int poder(){
        return 10;
    }
    
}
