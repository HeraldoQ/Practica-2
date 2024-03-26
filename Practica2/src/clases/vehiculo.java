/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Heraldo
 */
public class vehiculo {
    
    private double consumo; 
    private double capacidad;
    private String nombre;
    private int distanciatotal;
    private int distanciaactual;
    private int id;
    private String inicio;
    private String fin;
    

    public vehiculo(int id, double consumo, double capacidad, String nombre, int distanciatotal, int distanciaactual,String inicio, String fin) {
        this.consumo = consumo;
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.distanciatotal = distanciatotal;
        this.distanciaactual = distanciaactual;
        this.id = id;
        this.inicio = inicio;
        this.fin = fin;
    }

    /**
     * @return the consumo
     */
    public double getConsumo() {
        return consumo;
    }

    /**
     * @param consumo the consumo to set
     */
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    /**
     * @return the capacidad
     */
    public double getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the distanciatotal
     */
    public int getDistanciatotal() {
        return distanciatotal;
    }

    /**
     * @param distanciatotal the distanciatotal to set
     */
    public void setDistanciatotal(int distanciatotal) {
        this.distanciatotal = distanciatotal;
    }

    /**
     * @return the distanciaactual
     */
    public int getDistanciaactual() {
        return distanciaactual;
    }

    /**
     * @param distanciaactual the distanciaactual to set
     */
    public void setDistanciaactual(int distanciaactual) {
        this.distanciaactual = distanciaactual;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the inicio
     */
    public String getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public String getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(String fin) {
        this.fin = fin;
    }
    
    
    


    
    
}
