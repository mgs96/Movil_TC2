package com.example.mauricio.tc2;

/**
 * Created by mauricio on 6/02/17.
 */

public class Proyecto {

    private int funcionalidad; //50%
    private int presentacion;  //25%
    private int usabilidad;    //25%

    public Proyecto(int funcionalidad, int presentacion, int usabilidad) {
        this.funcionalidad = funcionalidad;
        this.presentacion = presentacion;
        this.usabilidad = usabilidad;
    }

    public int getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(int funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public int getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(int presentacion) {
        this.presentacion = presentacion;
    }

    public int getUsabilidad() {
        return usabilidad;
    }

    public void setUsabilidad(int usabilidad) {
        this.usabilidad = usabilidad;
    }
}

