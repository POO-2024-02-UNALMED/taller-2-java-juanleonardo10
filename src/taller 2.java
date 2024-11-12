package Taller;
public class Asiento{
    String color;
    int precio;
    int registro;

    public void cambiarColor(String color){
        if (color=="rojo" || color=="verde" || color=="amaramillo" || color=="negro" || color=="blanco"){
            this.color=color;
        }  
    }
}

public class Auto {
    String modelo;
    int precio;
    String marca;
    String cantidadCreados;
    int registro;
    Motor motor;
    Asiento[] asientos;  
    
    int cantidadAsientos(){
        int contador=0;
        for(int i=0; i< asientos.length;i++){
            if (asientos[i] != null){
                contador++;
            }
        }
        return contador;
    }
    String verificarIntegridad(){
        for(Asiento i:asientos){
            if(i instanceof Asiento){
                if(i.registro!=motor.registro || i.registro!=registro || registro!=motor.registro){
                  return"Las piezas no son originales";
                }
                } 
            }    
        return"Auto original";
        }    
}

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    void cambiarRegistro(int registro){
        this.registro=registro;
    }
    void asignarTipo(String tipo){
        if (tipo=="gasolina" || tipo=="electrico"){
            this.tipo=tipo;
        }
    }
}