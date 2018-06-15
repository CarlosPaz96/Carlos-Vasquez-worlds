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
    
    
    
    public static void main(String[] args) {
        Jugador player1=new Jugador();
        Jugador player2=new Jugador();
        
        ArrayList ListaEdificiosPlayer1=new ArrayList();
        ArrayList ListaEdificiosPlayer2=new ArrayList();
        ArrayList ListaEjercitoPlayer1=new ArrayList();
        ArrayList ListaEjercitoPlayer2=new ArrayList();
        ArrayList ListaVehiculosPlayer1=new ArrayList();
        ArrayList ListaVehiculosPlayer2=new ArrayList();
        
        
        
        int oro=10000;
        int elixir=3000;
        int madera=5000;
        int vida1 = 1000,vida2=1000;
        int oro2=10000;
        int elixir2=3000;
        int madera2=5000;
  
        
                
        Scanner sc= new Scanner(System.in);
	    
	System.out.println("-----------------------------------------------");
	System.out.println("|                 Bienvenido                   |");
	System.out.println("-----------------------------------------------");
	System.out.println("");
	System.out.println(">> ingrese su nombre Jugador 1:");
	String mono1=sc.nextLine(); 
        
        Jugador jugador= new Jugador();
        jugador.nombre=mono1;
        
	System.out.println("-----------------------------------------------");
	System.out.println("");
	System.out.println(">> ingrese su nombre Jugador 2:");
	String mono2=sc.nextLine(); 
        
        Jugador jugador2= new Jugador();
        jugador2.nombre=mono2;
        
	System.out.println("-----------------------------------------------");
	System.out.println("");
	//System.out.println("mono2 es: "+mono2);
        menusDeOpciones opcion=new menusDeOpciones();
                
	jugador.raza=opcion.conversor(jugador.nombre);
	jugador2.raza=opcion.conversor(jugador2.nombre);
        System.out.println("-----------------------------------------------");
        System.out.println(jugador.nombre+" su raza es "+jugador.raza);
        System.out.println("-----------------------------------------------");
        System.out.println(jugador2.nombre+" su raza es "+jugador2.raza);
        System.out.println("-----------------------------------------------");
        player1=opcion.Select_Aleatoria(jugador,jugador2);
        if (player1==jugador){
            player2=jugador2;
        }
        if (player1==jugador2){
            player2= jugador;
        }
        System.out.println("player1: "+player1.nombre+" raza: "+player1.raza);
        System.out.println("player2: "+player2.nombre+" raza: "+player2.raza);
        
        Centro_de_comando cdc1=new Centro_de_comando();
        Centro_de_comando cdc2=new Centro_de_comando();
        cdc1.duenno=player1.nombre;
        cdc1.razaDeDuenno=player1.raza;
        cdc1.elixir=elixir;
        cdc1.madera=madera;
        cdc1.oro=oro;
        cdc1.vida= vida1;
        
        cdc2.duenno=player2.nombre;
        cdc2.razaDeDuenno=player2.raza;
        cdc2.elixir=elixir2;
        cdc2.madera=madera2;
        cdc2.oro=oro2;
        cdc2.vida= vida2;
        
        boolean i=false;
        
        int opcionfin1=0;
        int opcionfin2=0;
        
        
        while(opcionfin1!=6||opcionfin2!=6){
            opcion.MenuDGuerra(cdc1.duenno,cdc1.duenno,cdc1.oro,cdc1.elixir,cdc1.madera,cdc1.razaDeDuenno,ListaEdificiosPlayer2,ListaEdificiosPlayer1);
            opcion.MenuDGuerra(cdc2.duenno,cdc1.duenno,cdc2.oro,cdc2.elixir,cdc2.madera,cdc2.razaDeDuenno,ListaEdificiosPlayer1,ListaEdificiosPlayer2);
            opcionfin1=opcion.MenuDGuerra(cdc1.duenno,cdc1.duenno,cdc1.oro,cdc1.elixir,cdc1.madera,cdc1.razaDeDuenno,ListaEdificiosPlayer2,ListaEdificiosPlayer1);
            opcionfin2=opcion.MenuDGuerra(cdc2.duenno,cdc1.duenno,cdc2.oro,cdc2.elixir,cdc2.madera,cdc2.razaDeDuenno,ListaEdificiosPlayer1,ListaEdificiosPlayer2);
            if(opcionfin1==6 || opcionfin2==6){
                break;
            }
        }
    }
    
}
