/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */





// ESTO ES PARA EL HISTORIAL
package clases;

import java.io.Serializable;

/**
 *
 * @author Heraldo
 */
public class rutaelegida implements Serializable{
    private int id;
    private String inicio;
    private String fin;
    private int distancia;
    private String vehiculo;
    private double gasol;
    
    
    public rutaelegida(int id, String inicio, String fin, int distancia, String vehiculo, double gasol) {
        this.id = id;
        this.inicio = inicio;
        this.fin = fin;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.gasol = gasol;
        
        
        
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

    /**
     * @return the distancia
     */
    public int getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the vehiculo
     */
    public String getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * @return the gasol
     */
    public double getGasol() {
        return gasol;
    }

    /**
     * @param gasol the gasol to set
     */
    public void setGasol(double gasol) {
        this.gasol = gasol;
    }
    

}
