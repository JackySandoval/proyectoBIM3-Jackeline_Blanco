
package agendatelefonica;

import java.util.Scanner;


public class AgendaTelefonica {

    
    public static void main(String[] args) {
        int op =0;
        Scanner entrada = new Scanner(System.in);
        while(op != 4){
         System.out.println("MENU: ");
            System.out.println("1. Guardar contacto");
            System.out.println("2. Ver contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");
            System.out.println("----------------------------");
            System.out.println("ingrese un numero de opcion:");
            System.out.println("-----------------------------");
            op = entrada.nextInt();
            if (op == 1){
                System.out.println("Agrega un nuevo contacto");
            }else if (op == 2) {
                System.out.println("------------Tus contactos son-----------------");
                
            } else if (op == 3) {
                System.out.println("--------------Buscar un contacto-------------");
                System.out.println("Ingrese el nombre: ");
            } else {
                System.out.println("Opcion incorrecta");
            }
        }
    }
    
}
