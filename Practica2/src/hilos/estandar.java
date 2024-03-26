/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

import javax.swing.JLabel;



/**
 *
 * @author Heraldo
 */
public class estandar extends Thread{
       private JLabel vehiculo;
    private double limiteder;
    private boolean derecha;
    private int numvehiculo;
    private String datos;

    public estandar(JLabel vehiculo, double limiteder,int numvehiculo, String datos) {
        this.vehiculo = vehiculo;
        this.limiteder = limiteder;
        this.derecha = true;
        this.numvehiculo= numvehiculo;
        this.datos=datos;
    }

    @Override
    public void run() {
        try {
            while (true) {
                
                int x = getVehiculo().getX();

                if (derecha) {
                    if (x >= getLimiteder()) {
                        pausar();
                    }
                }
                if (derecha) {
                    x++;
                }
                if(main.Main.vehiculo.get(getNumvehiculo()).getCapacidad()> 0 && x <= getLimiteder()){
                main.Main.vehiculo.get(getNumvehiculo()).setCapacidad(main.Main.vehiculo.get(getNumvehiculo()).getCapacidad()-main.Main.vehiculo.get(getNumvehiculo()).getConsumo());
                System.out.println("nueva capacidad: " + main.Main.vehiculo.get(getNumvehiculo()).getCapacidad()); 
                this.derecha = true;
                
                
                
                } else if(main.Main.vehiculo.get(getNumvehiculo()).getCapacidad()<= 0){
                 /*   
                    main.Main.vehiculo.get(1).setCapacidad(6);
                System.out.println("nueva capacidad: " + main.Main.vehiculo.get(1).getCapacidad());*/ pausar();
                }
                
                getVehiculo().setLocation(x, getVehiculo().getY());
                Thread.sleep(100);
                
                
            }
        } catch (Exception e) {
            
            

        }

    }
public void pausar(){
        setDerecha(false);

}

public void reanudar(){
        setDerecha(true);

}

    /**
     * @return the vehiculo1
     */
    public JLabel getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo1 the vehiculo1 to set
     */
    public void setVehiculo(JLabel vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * @return the limiteder
     */
    public double getLimiteder() {
        return limiteder;
    }

    /**
     * @param limiteder the limiteder to set
     */
    public void setLimiteder(double limiteder) {
        this.limiteder = limiteder;
    }

    /**
     * @return the derecha
     */
    public boolean isDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(boolean derecha) {
        this.derecha = derecha;
    }

    /**
     * @return the numvehiculo
     */
    public int getNumvehiculo() {
        return numvehiculo;
    }

    /**
     * @param numvehiculo the numvehiculo to set
     */
    public void setNumvehiculo(int numvehiculo) {
        this.numvehiculo = numvehiculo;
    }

    /**
     * @return the datos
     */
    public String getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(String datos) {
        this.datos = datos;
    }
}
