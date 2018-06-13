/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosernestovasquezpaz.world;

import java.util.Scanner;
import static java.lang.Math.random;
import java.util.*;
import java.util.stream.IntStream;

/**
 *
 * @author CarlosPaz
 */
public class menusDeOpciones {
    
    public static int menu_opciones(String nombre){
        Scanner sc2= new Scanner(System.in);
        
        System.out.println("-----------Menu de Razas-----------");
        System.out.println("1.Barbaros.");
        System.out.println("2.Magos.");
        System.out.println("3.Esqueletos");
        System.out.println("-------------------------------------------");
        System.out.println(nombre+" escoja una de las opciones:");
        int omr= sc2.nextInt();
        //int opra;
        int respuesta=validar_Raza(omr,nombre);
        return respuesta;
    }
    
    public static int validar_Raza(int opv,String nombrev){
        if(opv!=1 && opv!=2 && opv!=3){
            System.out.println("--------------------------------------------------------------------");
            System.out.println("|La opcion es incorrecta, porfavor escoja entre las opciones 1,2,3.|");
            System.out.println("--------------------------------------------------------------------");
            int validado=menu_opciones(nombrev);
            validar_Raza(validado,nombrev);
            return validado;
        }
        return opv;
    }
    
    public static String conversor(String nombre){
        int opcion= menu_opciones(nombre);
        String tipo_Raza="";
        switch (opcion){
                case 1: 
                    tipo_Raza="Barbaros";
                    break;
                                       
                case 2: 
                    tipo_Raza="Magos";
                    break;
                case 3: 
                    tipo_Raza="Esqueletos";
                    break;
            }
        return tipo_Raza;
    }
    
    public static void MenuDGuerra(String nombre,int oro,int elipsis,int madera){
        Scanner s=new Scanner(System.in);
        Validaciones validar= new Validaciones();
        System.out.println("--------------Menu de Guerra---------------");
        System.out.println("-------------------------------------------");
        System.out.println("Tus recursos "+nombre+" son:");
        System.out.println("|Oro:"+oro+" |Elipsis:"+elipsis+" |Madera:"+madera+"|");
        System.out.println("-----------------------------------------------");
        System.out.println("--------------opciones de guerra---------------");
        System.out.println("1.Construir Edificios.");
        System.out.println("2.Entrenar Ejercito.");
        System.out.println("3.atacar");
        System.out.println("4.defender");
        System.out.println("5.terminar turno");
        System.out.println("-----------------------------------------------");
        System.out.println(nombre+" escoja una de las opciones:");
        int op=s.nextInt();
        validar.menuGerra(op,nombre,oro,elipsis,madera);
        
        
    }
    
    public static String Select_Aleatoria(){
        int aleatorio = (int) (Math.random() * 2) + 1;
        String nombre_f="";
        if (aleatorio==1){
            nombre_f= "salio  el uno";
            
        }
        if(aleatorio==2){
            nombre_f= "salio  el dos";
        }
        return nombre_f;
    }
}
