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
    
    
    public static int validar_Raza(int opv,String nombrev){
        if(opv!=1 && opv!=2 && opv!=3){
            System.out.println("---------------------------------------------------------------------");
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
    
    public static void main(String[] args) {
        raza raza1 = new barbaros();
        System.out.println(raza1.nombre());
        
        
        Scanner sc= new Scanner(System.in);
	    
	System.out.println("-----------------------------------------------");
	System.out.println("|                 Bienvenido                   |");
	System.out.println("-----------------------------------------------");
	System.out.println("");
	System.out.println(">> ingrese su nombre Jugador 1:");
	String mono1=sc.nextLine(); 
        
        Jugador player= new Jugador();
        player.nombre=mono1;
        
	System.out.println("-----------------------------------------------");
	System.out.println("");
	System.out.println(">> ingrese su nombre Jugador 2:");
	String mono2=sc.nextLine(); 
        
        Jugador player2= new Jugador();
        player2.nombre=mono2;
        
	System.out.println("-----------------------------------------------");
	System.out.println("");
	//System.out.println("mono2 es: "+mono2);
        menusDeOpciones opcion=new menusDeOpciones();
                
	player.raza=opcion.conversor(player.nombre);
	player2.raza=opcion.conversor(player2.nombre);
        System.out.println("-----------------------------------------------");
        System.out.println(player.nombre+" su raza es "+player.raza);
        System.out.println("-----------------------------------------------");
        System.out.println(player2.nombre+" su raza es "+player2.raza);
        System.out.println("-----------------------------------------------");
        String nombre=opcion.Select_Aleatoria();
        System.out.println(nombre);
    }
    
}

