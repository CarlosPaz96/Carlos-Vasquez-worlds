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

import static java.lang.Math.random;
import java.util.*;
import java.util.stream.IntStream;

public class CarlosErnestoVasquezPazWorld {

    /**
     * @param args the command line arguments
     */
    
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
    
    /*
    public static void Selector_inicio(String nombre1,String nombre2){
        ArrayList jugadores= new ArrayList();
        jugadores.add(1);
        jugadores.add(2);
        Random eleccion= new Random();
        int seleccionado=eleccion.int();
        String seleccionFinal="";
        switch (seleccionado){
            case 1:
                
            
        }      
        
        
        
        
    }*/
    
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
	    
	System.out.println("-----------------------------------------------");
	System.out.println("|                 Bienvenido                   |");
	System.out.println("-----------------------------------------------");
	System.out.println("");
	System.out.println("ingrese su nombre Jugador 1:");
	String mono1=sc.nextLine(); 
	System.out.println("-----------------------------------------------");
	System.out.println("");
	System.out.println("ingrese su nombre Jugador 2:");
	String mono2=sc.nextLine(); 
	System.out.println("-----------------------------------------------");
	System.out.println("");
	//System.out.println("mono2 es: "+mono2);
	String opcion_mono1=conversor(mono1);
	String opcion_mono2=conversor(mono2);
        System.out.println("-----------------------------------------------");
        System.out.println(mono1+" su raza es "+opcion_mono1);
        System.out.println("-----------------------------------------------");
        System.out.println(mono2+" su raza es "+opcion_mono2);
        System.out.println("-----------------------------------------------");
        
    }
    
}
