/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

/**
 *
 * @author manuel martinez
 */
public class NameHandler {
    
    private String name;
    private int year;
    private int semestre;
    private int fecha;
    private int resultado1;
    private int resultado2;

    public int getResultado2() {
        resultado2=2020-fecha;
        return resultado2;
    }

    public void setResultado2(int resultado2) {
        this.resultado2 = resultado2;
    }

    public int getResultado1() {
        if(semestre==1){
            resultado1=(2020-year)*2+1;
        }else if(semestre==2){
            resultado1=(2020-year)*2;
        }
        return resultado1;
    }

    public void setResultado1(int resultado1) {
        this.resultado1 = resultado1;
    }
    
    public NameHandler(){
        name= null;
        year=0;
        semestre=0;
        fecha=0;
        resultado1=0;
        resultado2=0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the año
     */
    public int getYear() {
        return year;
    }

    /**
     * @param año the año to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
            
}
