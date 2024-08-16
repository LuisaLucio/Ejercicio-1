package sumadeelementos;
import java.util.Scanner;

/**
 *
 * @author Luisa Lucio
 */
public class SumaDeElementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        //Declaracion e inicializacion 
        int [] arrayNumeros = new int [10];
                
        //Asignacion de valores en el arrray
        for(int i=0; i < arrayNumeros.length; i++){
            arrayNumeros[i]= i +  18;
            System.out.print(arrayNumeros[i]+ " ");
            
        }
        
        System.out.println();     
        
        //Pide un numero a buscar en el array
        System.out.println("INGRESE UN NUMERO A BUSCAR: ");
        int x= sc.nextInt();

        //Buscar y mostrarel indice
        boolean bandera= false;
        
        for(int i=0; i < arrayNumeros.length; i++){ 
            if (arrayNumeros[i]== x){
                System.out.println("EL NUMERO"+ x +"QUE FUE ENCONTRADO EN EL INDICE: "+ i);
                bandera=true;
                break;
            }
        }
        if(!bandera){
            System.out.println("EL NUMERO"+ x +"NO FUE ENCONTRADO EN EL ARRAY");
        }
    }    
}