/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionii.SemanaVIII;

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
    public void eliminar(int code){
        Nodo temp  = inicio;
        Nodo ant = null;
        
        if(isEmpty()){
            return;
        }
        
        if(temp.codigo==code){
            inicio = temp.sigte;
            return;
        }
        
        while(temp!=null){
            if(temp.codigo==code){
                ant.sigte=temp.sigte;
                return;
            }
            
            ant=temp;
            temp = temp.sigte;
        }
        
        return;
        
    }
    
}
