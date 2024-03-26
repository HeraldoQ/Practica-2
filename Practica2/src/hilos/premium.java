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
public class premium extends Thread{
      private JLabel vehiculo;
    private double limiteder;
    private boolean derecha;
    private int numvehiculo;

    public premium(JLabel vehiculo, double limiteder,int numvehiculo) {
        this.vehiculo = vehiculo;
        this.limiteder = limiteder;
        this.derecha = true;
        this.numvehiculo= numvehiculo;
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
                if(main.Main.vehiculo.get(numvehiculo).getCapacidad()> 0 && x <= getLimiteder()){
                main.Main.vehiculo.get(numvehiculo).setCapacidad(main.Main.vehiculo.get(numvehiculo).getCapacidad()-main.Main.vehiculo.get(numvehiculo).getConsumo());
                System.out.println("nueva capacidad: " + main.Main.vehiculo.get(numvehiculo).getCapacidad()); 
                this.derecha = true;
                
                
                
                } else if(main.Main.vehiculo.get(numvehiculo).getCapacidad()<= 0){
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
}
