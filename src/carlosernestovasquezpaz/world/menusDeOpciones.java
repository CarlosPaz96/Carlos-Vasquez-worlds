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
    
    public static int contAcerradero=0;
    public static int contExtractor=0;
    public static int contmina=0;
    public static int contAcerradero2=0;
    public static int contExtractor2=0;
    public static int contmina2=0;

    
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
    
    public static int MenuDGuerra(String MiNombre,String parametro,int oro,int elixir,int madera,String raza,ArrayList EdificiosOponente,ArrayList MisEdificios){
        Scanner s=new Scanner(System.in);
        
        Validaciones validado= new Validaciones();
        System.out.println("");
        System.out.println("----------------------------------------------------");
        System.out.println("            Menu de Guerra de los "+raza);
        System.out.println("----------------------------------------------------");
        System.out.println("");
        System.out.println("Tus recursos "+MiNombre+" son:");
        System.out.println("|Oro:"+oro+" |Elixir:"+elixir+" |Madera:"+madera+"|");
        System.out.println("");
        System.out.println("-----------------opciones de guerra-----------------");
        System.out.println("1.Construir Edificios.");
        System.out.println("2.Entrenar Ejercito.");
        System.out.println("3.atacar");
        System.out.println("4.defender");
        System.out.println("5.terminar turno");
        System.out.println("6.Rendirse");
        System.out.println("----------------------------------------------------");
        System.out.println(MiNombre+" escoja una de las opciones:");
        int op=s.nextInt();
        int raton=validado.menuGerra(op,MiNombre,oro,elixir,madera,raza,EdificiosOponente,MisEdificios);
        
        //System.out.println(raton);
        switch(raton){
            case 1:
                System.out.println("Construir Edificios" + raza);
                if(MiNombre==parametro){
                    construir_edificios(MiNombre,parametro,oro, elixir,madera, raza,EdificiosOponente,MisEdificios,contAcerradero,contmina,contExtractor);
                }
                if(MiNombre!=parametro){
                    construir_edificios(MiNombre,parametro,oro, elixir,madera, raza,EdificiosOponente,MisEdificios,contAcerradero2,contmina2,contExtractor2);
                }
                break;
            case 2 :
                System.out.println("Entrenar Ejercito "+raza);
                break;
            case 3 :
                System.out.println("atacar "+raza);
                break;
            case 4:
                System.out.println("defender " + raza);
                break;
            case 5 :
                System.out.println("terminar turno "+raza);
                break;
            case 6 :
                System.out.println("rendirce "+raza);
                return raton;
                
        }
        return raton;
        
    }
    
    public static int construir_edificios(String nombre,String parametro,int oro,int elixir,int madera,String raza,ArrayList oponente,ArrayList yo,int contador,int contador2,int contador3){
        Scanner cd =new Scanner(System.in);
        Scanner df=new Scanner(System.in);
        
        System.out.println("----------------------------------------------------");
        System.out.println("           Edificios de los "+raza);
        System.out.println("----------------------------------------------------");
        System.out.println("1.Acerraderos.");
        System.out.println("2.Extractor de Elixir.");
        System.out.println("3.Mina de oro.");
        System.out.println("¿que edificio decea construir?:");
        String s="s";
        int op=cd.nextInt();
        int n;
        n = validacionEdi(op,nombre,parametro,oro,elixir,madera,raza,oponente,yo,contador, contador2, contador3);
        String mango="";

        
        if (n==1){
                            
            System.out.println("Creando acerradero de " + raza);
            contador=contador+1;
            if(contador>3){
                System.out.println("-------------------------------------------------");
                System.out.println("| ha llegado al limite de acerraderos"+nombre+"|");
                System.out.println("-------------------------------------------------");
                construir_edificios(nombre,parametro,oro,elixir,madera,raza,oponente,yo,contador,contador2,contador3);
            }
            else{
                if (contador==1){
                System.out.println("creando acerradero de "+raza+" numero "+contador);
                Acerraderos A1=new Acerraderos();
                A1.nombre(raza);
                A1.nivel(1);
                A1.vida();
                A1.cont(0);
                yo.add(A1);
                
            }
                if (contador==2){
                System.out.println("creando acerradero de "+raza+" numero "+contador);
                Acerraderos A2=new Acerraderos();
                A2.nombre(raza);
                A2.nivel(1);
                A2.vida();
                A2.cont(0);
                yo.add(A2);
            }
                if (contador==3){
                System.out.println("creando acerradero de "+raza+" numero "+contador);
                Acerraderos A3=new Acerraderos();
                A3.nombre(raza);
                A3.nivel(1);
                A3.vida();
                A3.cont(0);
                yo.add(A3);
            }
                
            }                    
            System.out.println("desea regresar al menu de guerra, n para no y s para si:");
            mango=df.nextLine();
            if(s.equals(mango)){
                MenuDGuerra(nombre,parametro,oro,elixir,madera,raza,oponente,yo);
            }
        }
        if(n==2){
                System.out.println("creando extractor de elixir "+raza);
                contador2=contador2+1;
            if(contador2>3){
                System.out.println("-------------------------------------------------");
                System.out.println("| ha llegado al limite de Extractores "+nombre+"|");
                System.out.println("-------------------------------------------------");
                construir_edificios(nombre,parametro,oro,elixir,madera,raza,oponente,yo,contador,contador2,contador3);
            }
            else{
                if (contador2==1){
                System.out.println("creando extractor de "+raza+" numero "+contador);
                Extractores_de_elixis B1=new Extractores_de_elixis();
                B1.nombre(raza);
                B1.nivel(1);
                B1.vida();
                B1.cont(0);
                yo.add(B1);
                
            }
                if (contador2==2){
                System.out.println("creando extractor de "+raza+" numero "+contador);
                Extractores_de_elixis B2=new Extractores_de_elixis();
                B2.nombre(raza);
                B2.nivel(1);
                B2.vida();
                B2.cont(0);
                yo.add(B2);
            }
                if (contador2==3){
                System.out.println("creando extractor de "+raza+" numero "+contador);
                Extractores_de_elixis B3=new Extractores_de_elixis();
                B3.nombre(raza);
                B3.nivel(1);
                B3.vida();
                B3.cont(0);
                yo.add(B3);
            }
                
            }
                                
                System.out.println("desea regresar al menu de guerra, n para no y s para si:");
                mango=df.nextLine();
                if(s.equals(mango)){
                    MenuDGuerra(nombre,parametro,oro,elixir,madera,raza,oponente,yo);
                }}
        if (n==3){
                System.out.println("creando mina de oro "+raza);
                
                contador3=contador3+1;
            if(contador3>3){
                System.out.println("-------------------------------------------------");
                System.out.println("| ha llegado al limite de Extractores "+nombre+"|");
                System.out.println("-------------------------------------------------");
                construir_edificios(nombre,parametro,oro,elixir,madera,raza,oponente,yo,contador,contador2,contador3);
            }
            else{
                if (contador3==1){
                System.out.println("creando extractor de "+raza+" numero "+contador);
                minasDeoro C1=new minasDeoro();
                C1.nombre(raza);
                C1.nivel(1);
                C1.vida();
                C1.cont(0);
                yo.add(C1);
                
            }
                if (contador3==2){
                System.out.println("creando extractor de "+raza+" numero "+contador);
                minasDeoro C2=new minasDeoro();
                C2.nombre(raza);
                C2.nivel(1);
                C2.vida();
                C2.cont(0);
                yo.add(C2);
            }
                if (contador3==3){
                System.out.println("creando extractor de "+raza+" numero "+contador);
                minasDeoro C3=new minasDeoro();
                C3.nombre(raza);
                C3.nivel(1);
                C3.vida();
                C3.cont(0);
                yo.add(C3);
            }
                
            }
                                
                System.out.println("desea regresar al menu de guerra, n para no y s para si:");
                mango=df.nextLine();
                if(s.equals(mango)){
                    MenuDGuerra(nombre,parametro,oro,elixir,madera,raza,oponente,yo);
                }
                
                System.out.println("desea regresar al menu de guerra, n para no y s para si:");
                mango=df.nextLine();
                if(s.equals(mango)){
                    MenuDGuerra(nombre,parametro,oro,elixir,madera,raza,oponente,yo);
                }}    
        
        return op;       
        
    }
    public static int validacionEdi(int op,String nombre,String parametro,int oro,int elixir,int madera,String raza,ArrayList oponente,ArrayList yo, int contador,int contador2,int contador3){
        if(op!=1 && op!=2 && op!=3){
            System.out.println("------------------------------------------------------------------------");
            System.out.println("|La opcion es incorrecta, porfavor escoja entre las opciones disponibles|");
            System.out.println("------------------------------------------------------------------------");
            int validar= construir_edificios(nombre,parametro,oro, elixir,madera, raza,oponente,yo,contador,contador2,contador3);
            return op;
    }
        return op;
}
    public static Jugador Select_Aleatoria(Jugador nombre1,Jugador nombre2){
        int aleatorio = (int) (Math.random() * 2) + 1;
        Jugador nombre_f=new Jugador();
        if (aleatorio==1){
            nombre_f= nombre1;
                        
        }
        if(aleatorio==2){
            nombre_f= nombre2;
        }
        return nombre_f;
    }
}
