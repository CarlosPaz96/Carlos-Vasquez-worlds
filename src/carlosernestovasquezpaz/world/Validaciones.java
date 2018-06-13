/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosernestovasquezpaz.world;

import static carlosernestovasquezpaz.world.menusDeOpciones.MenuDGuerra;

/**
 *
 * @author rafa
 */
public class Validaciones {

    public Validaciones() {
    }
    
    public static int menuGerra(int op,String nombre,int oro,int elipsis,int madera){
        if(op<1 && op>5 ){
            System.out.println("--------------------------------------------------------------------");
            System.out.println("|La opcion es incorrecta, porfavor escoja entre las opciones 1,2,3.|");
            System.out.println("--------------------------------------------------------------------");
            MenuDGuerra(nombre,oro,elipsis,madera);
        }
        return op;
    }
}
