/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionii.SemanaVIII;
import java.lang.IndexOutOfBoundsException;
/**
 *
 * @author David
 */
public class Lista {
    private Nodo inicio=null;
    private int size=0;    //Es importante tener una referencia externa del size, pues no hay una referencia directa del tamaño 
    //el size pertenece a lista
    
    //metodo que me permite ver si un nodo esta apuntando algo
    public boolean isEmpty(){
        return inicio==null;
    }
    
    
    public void add(Nodo obj){
        if(obj==null){ //hay que verificar que el nodo que vamos a agregar no esta vacio
            return;//retornamos ya que solo queremos aceptar algo que si tiene datos
        }
        
        if(isEmpty()){
            inicio=obj;
        }else{
            Nodo temp = inicio;
            
            //esto solo mueve el puntero
            while(temp.sigte!= null){
                temp=temp.sigte;//la idea is guardando la referencia de los nodos que recorremos para verificar su atributo de sigte
            }
            
            temp.sigte=obj;
            System.out.println("¡Se ha agregado el nuevo Nodo!");
        }
        size++;
    }
    
    
    
    public void print(){
        Nodo temp= inicio;
        while(temp!=null){
            System.out.println(temp);
            temp=temp.sigte;//idea de movimiento de puntero
        }
    }
    
    
    
    public Nodo get(int code){
        Nodo temp =inicio;
        while(temp!=null){
            if(temp.codigo==code){
                return temp;
            }
            temp=temp.sigte;
        }
        return null;
    }
    
    //Funcion de eliminar
    public boolean eliminar(int code){
        Nodo temp  = inicio;
        Nodo ant = null;
        
        if(isEmpty()){
            return false;
        }
        
        if(temp.codigo==code){
            inicio = temp.sigte;
            size--;
            return true;
        }
        
        while(temp!=null){
            if(temp.codigo==code){
                ant.sigte=temp.sigte;
                size--;
                return true;
            }
            
            ant=temp;
            temp = temp.sigte;
        }
        
        return false;
        
    }
    
    
    //Funcion para obtener el tamanio de la lista
    public int size(){
        return size;
    }
    
    
    //Funcion para agregar en posicion especifica
    public void add(int index, Nodo obj) throws IndexOutOfBoundsException{
        
        if(index<0 || index> size){
            throw new IndexOutOfBoundsException();
        }
        
        
        //Variable de referencia para posicion contadora
        Nodo temp = inicio;
        Nodo next=null;
        int i=0;
        
        if(isEmpty()){
            System.out.println("La lista esta vacia");
            return;
        }
        
        if(index==0){//considerando el caso que quiere agregar el nuevo nodo en el HEAD
            obj.sigte=temp;//el nuevo nodo tiene como el siguiente al viejo inicio
            inicio=obj;//cambiamos el inicio por el nuevo nodo
            System.out.println("Se ha agregado nuevo nodo en posicion "+(i+1));
            size++;
            return;
        }
        
        //caso que quiera agregar en un nodo distinto al inicio
        Nodo ant = null;
        
        //Verificar si es el index buscado
        while(temp!=null){
            //
            if(i==index){
                //agregar la referencia del anterior como el nuevo, y del nuevo como el siguiente
                next=temp;//el que habia antes se desplaza hacia adelante
                ant.sigte=obj;
                obj.sigte=next;
                System.out.println("Se ha agregado nuevo nodo en posicion "+(i+1));
                size++;
                break;
            }
            ant=temp;
            temp=temp.sigte;
            i++;
        }
        
    }
    
    
    
}
