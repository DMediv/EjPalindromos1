/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura.de.datos.practicas;

/**
 *
 * @author Danie
 */
public class Sueldo 
{
    
//Realizo:
//Daniel Medina Bautista    
//Hermelinda Cruz Mata

//Atributibutos
    private String nombre;
    private int dias_trabajados;
    private float sueldo_base;
    private int retardos;
    
    //Construcctor
    public Sueldo()
    {
        nombre="Daniel Medina";
        dias_trabajados=20;
        sueldo_base=1000;
        retardos= 3;     
    }
    
    //Metodo para calcular descuento
    public float Calcular_descuento(float sueldo_base, int retardos)
    {
        float descuento;
        
        if(retardos >= 3)
        {
            descuento =(sueldo_base * 10)/ 100;
        }
        else
        {
            descuento = 0;
        }
        
        return descuento;
    }
    
    //Metodo para calcular bono
    public float Calcular_bono(float sueldo_base, int dias_trabajados)
    {
        float bono;
        
        if(dias_trabajados == 25)
        {
            bono =(sueldo_base * 15)/ 100;
        }
        else
        {
            bono = 0;
        }
        
        return bono;
    }
    
    //Metodo para calcular sueldo
    public float Calcular_sueldo(float sueldo_base, int dias_trabajados)
    {
        float bono = Calcular_bono(sueldo_base,dias_trabajados);
        float descuento = Calcular_descuento(sueldo_base,retardos);
        
        
        float sueldo_final=(sueldo_base * dias_trabajados) + bono - descuento;
        
        return sueldo_final;     
    }  
    
    //Constructor parametrizado
    public Sueldo(String Nombre,int Dias_trabajados,float Sueldo_base, int Retardos)
    {
        nombre = Nombre;
        dias_trabajados = Dias_trabajados;
        sueldo_base = Sueldo_base;
        retardos = Retardos;
    }
    
    public void ImprimirSueldo()
    {
        float sueldo_final = Calcular_sueldo(sueldo_base, dias_trabajados);
        
        System.out.printf("Nombre del Empelado: %s%nSueldo final: $%.2f%n",
                nombre, sueldo_final);
    }
    
}
