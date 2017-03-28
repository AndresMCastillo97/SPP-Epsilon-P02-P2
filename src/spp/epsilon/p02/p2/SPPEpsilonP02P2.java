//Proyecto Parcial 2 
//Problema 2
//Equipo Epsilon
//Nombres, matrículas y carreras de integrantes de equipo:
//Roberto Alain Rivera Bravo | A01411516 | IMT11
//Fabricio Arturo Balboa Cavazos | A01411541 | IMT11
//Andrés de Jesús Martínez Castillo | A01411447 | IMT11
//Jessica Delgado González | A01411536 | IMT11
//Alfredo Alejandro Lárraga Sosa | A01410278 | LMC

/*
2.	Haga un programa que dados dos arreglos determine si son iguales. 
La dimensión y contenido del arreglo deberán ser definidas por el usuario. 
Deberá recorrer cada arreglo para hacer la comparación. 
*/
package spp.epsilon.p02.p2;
import java.util.Arrays;
import java.util.Scanner;

public class SPPEpsilonP02P2 {

    public static void main(String[] args) {
    System.out.println("Programa 2");
        System.out.println("\nPrograma que determina si una matriz es igual a otra");
        System.out.println("\nIntroduzca el tamaño n de las matrices cuadradas A y B (nxn)");
        int n=solicitarentero();//Solicito al usuario ingresar el tamaño de las matrices a comparar
       
        int[][] A= matriz(n,"A");//Declaro las matrices a utilizar y los valores se los introduce el usuario por medio del método matriz()
        int[][] B= matriz(n,"B");
        
        if(Arrays.deepEquals(A, B)){//Se realiza la comparación de las matrices con Array.deepEquals utilizando un if 
            System.out.println("\n *Las matrices A y B son iguales*");
        }else{
            System.out.println("\n *Las matrices A y B no son iguales*");
        }
    }
    public static int[][] matriz(int n, String nombre){//Método que Asigna valores a la matriz
        int[][] matriz= new int[n][n];//declaro la matriz a regresar
        System.out.println("\nIntroduzca los valores de la matriz "+nombre);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=solicitarentero();//por medio de dos "for" se asignan el usuario asigna los valores recorriendo cada espacio del arreglo
            }
        }
        return matriz;//Se regresa la matriz con los valores ingresados
    }
    public static int solicitarentero(){//Método para regresar valores enteros
        Scanner kb=new Scanner(System.in);//Llamo al método Scanner de la librería para introducir valores por teclado
        boolean flag;
        int n=0;
        do{
           try{//Se utiliza un Try & Catch para evitar errores cuando se ingresan valores por teclado
               n=kb.nextInt();
               flag=true;
           }catch (Exception ex) {
                flag=false;
                System.out.println("Dato no válido");
                kb.nextLine();
            }   
        }while(flag==false);
        return n;//Regreso un entero
    }
    
}