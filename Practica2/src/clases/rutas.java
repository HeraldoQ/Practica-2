/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.io.Serializable;
import main.Main;
/**
 *
 * @author Heraldo
 */
public class rutas implements Serializable{
    private int id;    
    private String inicio;
    private String fin;
    private int distancia;

    public rutas(int id, String inicio, String fin, int distancia) {
        this.id = id;
        this.inicio = inicio;
        this.fin = fin;
        this.distancia = distancia;
        this.id = Main.ids;
        Main.ids++;
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
    
    
    
    
    
}
