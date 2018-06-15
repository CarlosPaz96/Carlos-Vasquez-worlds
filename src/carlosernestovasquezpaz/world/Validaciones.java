/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosernestovasquezpaz.world;

import static carlosernestovasquezpaz.world.menusDeOpciones.MenuDGuerra;

/**
 *
 * @author CarlosPaz
 */

import java.util.*;

public class Validaciones {

    private static int MenuDGuerra(String nombre, int oro, int elipsis, int madera, String razaDdue, ArrayList oponente, ArrayList yo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Validaciones() {
    }
    
    public static int menuGerra(int op,String nombre,int oro,int elipsis,int madera,String razaDdue,ArrayList oponente,ArrayList yo){
        if(op!=1 && op!=2 && op!=3 && op!=4 && op!=5 && op!=6 ){
            System.out.println("------------------------------------------------------------------------");
            System.out.println("|La opcion es incorrecta, porfavor escoja entre las opciones disponibles|");
            System.out.println("------------------------------------------------------------------------");
            int validar=MenuDGuerra(nombre,oro,elipsis,madera,razaDdue,oponente,yo);
            return op;
    }
        return op;
}
    


}
