/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import gui.*;
import java.util.LinkedList;
import clases.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**

/**
 *
 * @author Heraldo
 */
public class Main {
   public static int ids = 1;
   
   //lista de rutas que importé
   public static LinkedList<rutas> listarutas = new LinkedList<>();
   
   //lista de rutas finales, las que aparecen en el historial
    public static LinkedList<rutaelegida> rutaelegidalist = new LinkedList<rutaelegida>();
    
    //lista que ayuda a la de arriba (agrega 3 carros a una aislada)
    public static LinkedList<vehiculo> vehiculo = new LinkedList<>();
    
 //variables para serializacion
   public static ObjectInputStream entrada;
   public static ObjectOutputStream salida;
   
   public static ObjectInputStream entrada2;
   public static ObjectOutputStream salida2;
   
   
   
public static void main(String args[]){
    //abrir archivo deserializado de cursos
    listarutas = (LinkedList<rutas>)deserializar1();
    if (listarutas!=null) {
        System.out.println("hay cursos guardados");
        for (rutas c: listarutas) {
            System.out.println("\nAgregada lista:");
            System.out.println("ID:        "+c.getId());
            System.out.println("inicio:    "+c.getInicio());
            System.out.println("Fin:       "+c.getFin());
            System.out.println("Distancia: "+c.getDistancia());
        }
       
    } else {System.out.println("no hay cursos");
    listarutas = new LinkedList<rutas>();
    }
    
    
     rutaelegidalist = (LinkedList<rutaelegida>)deserializar2();
    if (rutaelegidalist!=null) {
        System.out.println("hay cursos guardados");
        for (rutaelegida c: rutaelegidalist) {
            System.out.println("\nAgregada lista:");
            System.out.println("ID:        "+c.getId());
            System.out.println("inicio:    "+c.getInicio());
            System.out.println("Fin:       "+c.getFin());
            System.out.println("Distancia: "+c.getDistancia());
            System.out.println("carro:     "+c.getVehiculo());
            System.out.println("gaso. C:   "+c.getGasol());
            
        }
       
    } else {System.out.println("no hay cursos");
    rutaelegidalist = new LinkedList<rutaelegida>();
    }
    
    Cargaruta log= new Cargaruta();
    log.llenartabla();
    log.setVisible(true);

}

//SERIALIZACION---------------------------------------------

 //metodo serializar////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void serializart1(){
try{
salida = new ObjectOutputStream(new FileOutputStream("Serializados/tabla1.bin"));
salida.writeObject(listarutas);
salida.close();
}catch(Exception e){}
}

public static void serializart2(){
try{
salida2 = new ObjectOutputStream(new FileOutputStream("Serializados/tabla2.bin"));
salida2.writeObject(rutaelegidalist);
salida2.close();
}catch(Exception e){}
}

//metodo deserializar///////////////////////////////////////////////////////////////////////////////////////////////////////////
public static Object deserializar1(){
try{
entrada = new ObjectInputStream(new FileInputStream("Serializados/tabla1.bin"));
LinkedList<rutas> rutasser = (LinkedList<rutas>) entrada.readObject();
entrada.close();
return rutasser;
}catch(Exception e){}
       return null;
 
}


public static Object deserializar2(){
try{
entrada2 = new ObjectInputStream(new FileInputStream("Serializados/tabla2.bin"));
LinkedList<rutaelegida> rutas2ser = (LinkedList<rutaelegida>) entrada2.readObject();
entrada2.close();
return rutas2ser;
}catch(Exception e){}
       return null;
}



public static void añadirruta(rutas rutas){
    listarutas.add(rutas);
    serializart1();

}

public static void editardist(int codigo, int edrut){
    for (int i = 0; i < listarutas.size(); i++) {
        if (codigo== listarutas.get(i).getId()) {
          listarutas.get(i).setDistancia(edrut);
        }
    }
}




// no es una opción, es para no repetir en la tabla ni en el linkedlist
public static void eliminarruta(){
    
    if (listarutas.size()!=0) {
        
    int ta=listarutas.size();
    for (int i = 0; i < ta; i++) {
        
            listarutas.remove(0);
            
        System.out.println("\ruta eliminada= "+ i);
        System.out.println("tamaño: " + listarutas.size());
    }
    ids=1;
        
    }
}

public static void rutalista(rutaelegida rutae){
    rutaelegidalist.add(rutae);
    serializart2();

}
public static void avehiculo(vehiculo vehi){
    vehiculo.add(vehi);
    

}


public static void avehi(){

}

    
}
