/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionii.SemanaVIII;

/**
 *
 * @author David
 */
public class Nodo {
    public int codigo;
    public String nombre;
    public Nodo sigte; //referente del siguiente nodo, que contiene TODA la informacion
    
    
    public Nodo(int codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
        sigte=null;//Esto nos indica que, por defecto, al aparecer, este no esta puntando a otro nodo
    }
    
    
    //pueden existir varias funciones y estructura dinamica
    //Atributos - constructor- funciones
    
    
    @Override
    public String toString(){
        return "Nodo {"+"Codigo: "+codigo+", Nombre: "+nombre+"}";
    }
    
    
            
}
