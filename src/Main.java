import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente [] clientes = new Cliente[4];
        String entradaeleccion = "";
        Cliente nuevoCliente = new Cliente();


        do {
            System.out.println("a. Añadir nuevo cliente.");
            System.out.println("b. Borrar un cliente.");
            System.out.println("c. Buscar un cliente.");
            System.out.println("d. Mostrar los clientes.");
            System.out.println("e. salir.");

            System.out.println("Escribe una de las opciones: ");

            Scanner eleccion = new Scanner(System.in);
            entradaeleccion = eleccion.nextLine();
            System.out.println("Has seleccionado la opcion: " + entradaeleccion);

            switch (entradaeleccion){
                case "a": {
                    try {
                        System.out.println("Ingrese nombre:");
                        String nombreNuevo = eleccion.nextLine();
                        Scanner nuevoNombre = new Scanner(System.in);
                        System.out.println("Ingrese cedula: ");
                        String cedulaNueva = eleccion.nextLine();
                        int number = Integer.parseInt(cedulaNueva);
                        Scanner nuevaCedula = new Scanner(System.in);

                        for (int i = 0; i < clientes.length; i++){
                            clientes [i] = nuevoCliente;
                        }

                    } catch (Exception e) {
                        System.out.println("No es posible usar el valor");
                        break;
                    }
                }
                case "b": {
                    try {
                        System.out.println("Elija el numero de la posicion a borrar: ");
                        String borrarCliente = eleccion.nextLine();
                        Scanner clienteBorrado = new Scanner(System.in);
                        System.out.println("Cliente borrado" + clienteBorrado);
                    } catch (Exception e) {
                        System.out.println("El cliente no existe");
                    }
                }
                case "c":{
                    System.out.println("Indique el que cliente desea buscar: ");
                    String busquedaCliente = eleccion.nextLine();
                    Scanner clienteEncontrado = new Scanner(System.in);
                    System.out.println("Cliente borrado" + clienteEncontrado);
                }
                case "d":{

                    for (int i = 0; i < clientes.length; i++) {
                        System.out.print(clientes[i] + " ");
                    }
                }
                default:
                    break;
            }
        } while (!entradaeleccion.equals("e"));
    }
}