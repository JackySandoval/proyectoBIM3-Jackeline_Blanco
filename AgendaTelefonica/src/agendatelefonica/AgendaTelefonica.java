package agendatelefonica;

import java.util.Scanner;

public class AgendaTelefonica {

    static contacto misContactos[] = new contacto[10];
    static int contador = 0;

    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        while (op != 4) {
            System.out.println("----------------------------");
            System.out.println("MENU: ");
            System.out.println("1. Guardar contacto");
            System.out.println("2. Ver contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");
            System.out.println("----------------------------");
            System.out.println("ingrese un numero de opcion:");
            System.out.println("-----------------------------");
            op = entrada.nextInt();
            if (op == 1) {
                System.out.println("Agrega un nuevo contacto");
                crearContacto();
            } else if (op == 2) {
                System.out.println("------------Tus contactos son-----------------");
                verContactos();
            } else if (op == 3) {
                System.out.println("--------------Buscar un contacto-------------");
                System.out.println("Ingresa el nombre de tu contacto");
                Scanner teclado = new Scanner(System.in);
                String nombre = teclado.nextLine();
                System.out.println(verContacto(nombre));
            } else {
                System.out.println("Opcion incorrecta");
            }
        }
    }

    static public void crearContacto() {
        if (contador >= 10) {
            System.out.println("---------------------------------------");
            System.out.println("---------La memoria esta llena---------");
            System.out.println("---------------------------------------");
        } else {
            Scanner teclado = new Scanner(System.in);
            System.out.println("--------------Nuevo Contacto--------------");
            System.out.println("Ingrese el nombre del nuevo contacto");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese el numero del contacto");
            String numero_de_telefono = teclado.nextLine();
            System.out.println("Ingrese el domicilio de tu contacto");
            String domicilio = teclado.nextLine();
            misContactos[contador] = new contacto(numero_de_telefono, nombre, domicilio);
            System.out.println("Dato almacenado");
            contador++;
        }
    }

    static public void verContactos() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Nombre: " + misContactos[i].verNombre());
            System.out.println("Numero: " + misContactos[i].verNumero());
            System.out.println("Domicilio: " + misContactos[i].verDomicilio());
            System.out.println("#####################################");
        }
    }

    static public String verContacto(String nombre) {
        int posicion = -1;
        for (int i = 0; i < 10; i++) {
            if (misContactos[i] != null) {
                if (misContactos[i].verNombre().equals(nombre)) {
                    posicion = i;
                    break;
                }
            }
        }
        if (posicion != -1) {
            return "numero: " + misContactos[posicion].verNumero()  +  " domicilio: " + misContactos[posicion].verDomicilio();
        } else {
            return "Contacto no encontrado";
        }

    }
}
