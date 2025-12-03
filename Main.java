/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionii.SemanaVIII;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Main {
    
    
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        
        Lista miLista= new Lista();
        
        boolean status=true;
        
        
        while(status){
            System.out.println("----MENU DE OPCIONES----");
            System.out.println("1-Agregar Nodo");
            System.out.println("2-Agregar Nodo en posicion específica");
            System.out.println("3-Obtener Nodo");
            System.out.println("4-Eliminar Nodo");
            System.out.println("5-Tamaño de lista");
            System.out.println("6-Imprimir la informacion de lista");
            System.out.println("7-Salir");
            System.out.println("Ingrese una opcion: ");
            
            int opcion =lea.nextInt();
            
            switch(opcion){
                
                case 1:
                    System.out.println("Ingrese el codigo a registrar: ");
                    int codigo= lea.nextInt();
                    System.out.println("Ingrese el nombre a registrar: ");
                    String nombre =lea.next();
                    Nodo nuevoNodo = new Nodo(codigo, nombre);
                    miLista.add(nuevoNodo);
                    System.out.println("Nuevo nodo agregado exitosamente");
                    break;
                    
                    
                case 2:
                    System.out.println("Ingrese el codigo a registrar: ");
                    int codigo2= lea.nextInt();
                    System.out.println("Ingrese el nombre a registrar: ");
                    String nombre2 =lea.next();
                    System.out.println("Ingrese el indice de la lista en el que desea registrar el nodo (1-"+miLista.size()+"): ");
                    int index= lea.nextInt();
                    Nodo nuevoNodo2 = new Nodo(codigo2, nombre2);
                    try{
                        miLista.add(index-1, nuevoNodo2);
                    }catch(IndexOutOfBoundsException e){
                        System.out.println("El indice sobrepasa el tamaño de la lista");
                    }
                    
                    
                    break;
                    
                    
                case 3:
                    System.out.println("Ingrese el codigo del nodo que desea obtener: ");
                    int codigo3=  lea.nextInt();
                    Nodo obtenido = miLista.get(codigo3);
                    if(obtenido!=null){
                        System.out.println("Nodo encontrado bajo el nombre de "+obtenido.nombre);
                    }else{
                        System.out.println("No se ha encontrado Nodo bajo codigo indicado");
                    }
                    break;
                    
                case 4:
                    System.out.println("Ingrese el codigo del nodo que desea eliminar: ");
                    int codigo4= lea.nextInt();
                    
                    //considerar caso de tamaño de lista
                    if(miLista.eliminar(codigo4)){
                        System.out.println("Se ha eliminado el nodo exitosamente!");
                    }else{
                        System.out.println("No se ha encontrado Nodo bajo codigo indicado");
                    }
                    
                    break;
                    
                case 5:
                    System.out.println("La lista contiene un total de ("+miLista.size()+") Nodos");
                    break;
                    
                case 6:
                    System.out.println("---CONTENIDO DE LISTA---");
                    miLista.print();
                    break;
                    
                case 7:
                    System.out.println("Cerrando programa...");
                    status=false;
                    break;
            }
            
            
            
            
        }
        
    }
    
}
