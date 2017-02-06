package Clases;

import java.io.Serializable;

/**
 * Created by mauricio on 6/02/17.
 */

public class Proyecto implements Serializable {

    private double funcionalidad; //50%
    private double presentacion;  //25%
    private double usabilidad;    //25%
    private double total;

    public Proyecto(double funcionalidad, double presentacion, double usabilidad, double total) {
        this.funcionalidad = funcionalidad;
        this.presentacion = presentacion;
        this.usabilidad = usabilidad;
        this.total = total;
    }

    public double getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(int funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public double getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(int presentacion) {
        this.presentacion = presentacion;
    }

    public double getUsabilidad() {
        return usabilidad;
    }

    public void setUsabilidad(int usabilidad) {
        this.usabilidad = usabilidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}

