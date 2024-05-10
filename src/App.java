//Moises Isaias Mendez Sanchez
//2024-1687U
//1M7-S

import java.util.Scanner;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int Tamaño = 0;
        int Posicion = 0;
        String Buscar;
        String Productos[];
        boolean Continuar = true;
        
        do{
            try{
                System.out.println("Cuantos productos desea ingresar?");
            Tamaño = leer.nextInt();
            System.out.println("______________________________________________\n");
            
            if(Tamaño <3 || Tamaño>15){
                System.out.println("Ingrese almenos tres productos y maximo 15");//Condicion de datos
                System.out.println("______________________________________________\n");
                continue;
            }else{
                Continuar = false;//salir del ciclo.
            }
            
            }catch(InputMismatchException inputMismatchException){//excepcion si digite un string en el tamaño del arreglo.

                System.out.println("Solo puedo ingresar numeros no letras.");
                System.out.println("______________________________________________\n");
                leer.nextLine();
            }
        }while(Continuar);

            Productos = new String[Tamaño];

            leer.nextLine();
        
            for(int i=0; i<Productos.length; i++){//Llenado del arreglo.
            System.out.print("Ingrese el producto "+(i+1)+": ");
            Productos[i]= leer.nextLine();
            
            System.out.println("Producto agregado exitosamente!");
            }
        
            System.out.println("______________________________________________\n");
            System.out.println("Que producto desea buscar? ");//Productos a buscar.
        
            Buscar = leer.nextLine();
        

            App Metodo = new App();//Instancia del metodo de busqueda
            Posicion = Metodo.Busqueda(Productos, Buscar);//Determina la posicion del elemento encontrado.
       
            if(Posicion == -1){//Si el metodo no encontro ninguna conisidencia retornara -1, de lo contrario imprimira la posicion del prod.
            System.out.println("Producto "+Buscar+" no existente en el inventario.");
            }else{
            System.out.println("El producto se encuentra en la posicion "+(Posicion+1)+" del inventario.");
            }
    }
        
    public static int Busqueda (String array[], String Buscar){//Metodo de busqueda, metodo lineal.

        for(int i=0; i<array.length; i++){
            if(array[i].equalsIgnoreCase(Buscar)){
                
                return i;
            }
        }
        return -1;
    }

}

