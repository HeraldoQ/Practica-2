/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;
import java.time.LocalDateTime;
import javax.swing.JLabel;

/**
 *
 * @author Heraldo
 */
public class movimiento extends Thread{

    private JLabel vehiculo;
    private double limiteder;
    private boolean derecha;
    private int numvehiculo;
    private JLabel datos;

    public movimiento(JLabel vehiculo, double limiteder,int numvehiculo,JLabel datos) {
        this.vehiculo = vehiculo;
        this.limiteder = limiteder;
        this.derecha = true;
        this.numvehiculo= numvehiculo;
        this.datos=datos;
    }

    @Override
    public void run() {
        try {
            int km = 1;
            double gaso= main.Main.vehiculo.get(numvehiculo).getConsumo();
            double gaso1=gaso;
            double estimado=0.0;
            int contadorex = gui.Cargaruta.cont23;
            System.out.println("ASSSSSSSSSSSSSSSSS "+contadorex);
            estimado = (main.Main.vehiculo.get(numvehiculo).getConsumo()* main.Main.vehiculo.get(numvehiculo).getDistanciatotal())/main.Main.vehiculo.get(numvehiculo).getCapacidad();
            while (true) {
                
                int x = vehiculo.getX();
                double t = 510.0/main.Main.vehiculo.get(numvehiculo).getDistanciatotal();
                System.out.println(main.Main.vehiculo.get(numvehiculo).getDistanciatotal());
                
                
                if (derecha) {
                    if (x >= getLimiteder()+10) {
                         //agregar la hora de finalización...
                         LocalDateTime fechafinal= LocalDateTime.now();
                            int año = fechafinal.getYear();
                            int mes = fechafinal.getMonthValue();
                            int dia = fechafinal.getDayOfMonth();
                            int hora = fechafinal.getHour();
                            int minutos = fechafinal.getMinute();
                            int segundos = fechafinal.getSecond();

                            String fechafinal1= Integer.toString(año)+"-"+Integer.toString(mes)+"-"+Integer.toString(dia)+"  " +Integer.toString(hora)+":"+Integer.toString(minutos)+":"+Integer.toString(segundos);
                            
                            main.Main.rutaelegidalist.get(contadorex).setFin(fechafinal1);
                            main.Main.rutaelegidalist.get(contadorex).setGasol((Math.round((gaso1-0.300)*100.00)/100.00));
                          
                         System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" +contadorex);
                        
                        this.stop();
                        
                        
                    }
                }
                if (derecha) {
                   
                    System.out.println(t); 
                    x=x+(int)Math.round(t);
                    System.out.println("distancia actual "+x);
                    km++;
                    gaso1=gaso1+gaso;
                    System.out.println("km "+km+"   gasolina t "+gaso1);
                    
                }
                if(main.Main.vehiculo.get(numvehiculo).getCapacidad()> 0 && x <= getLimiteder()){
                main.Main.vehiculo.get(numvehiculo).setCapacidad(main.Main.vehiculo.get(numvehiculo).getCapacidad()-main.Main.vehiculo.get(numvehiculo).getConsumo());
                System.out.println("nueva capacidad: " + main.Main.vehiculo.get(numvehiculo).getCapacidad()); 
               
                this.derecha = true;
                
                
                
                } else if(main.Main.vehiculo.get(numvehiculo).getCapacidad()<= 0){
                    
                    pausar();
                 
                
                }
                 
                datos.setText("<html>Gasolina actual:<p>"+Double.toString(Math.round(main.Main.vehiculo.get(numvehiculo).getCapacidad()*1000.0)/1000.0)+"<p>km actual:<p>"+(km-1)+"<p>recargas estimadas:<p>"+(Math.ceil(estimado-1)));
                
               if(main.Main.vehiculo.get(numvehiculo).getCapacidad()<= 0){datos.setText("<html>Gasolina actual:<p>"+"0<p>"+"km actual:<p>"+(km-1)+"<p>recargas estimadas:<p>"+(Math.ceil(estimado-1)));} else{}
                vehiculo.setLocation(x, getVehiculo().getY());
                
                
                
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
     * @return the datos
     */
    public JLabel getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(JLabel datos) {
        this.datos = datos;
    }

}


