package latinasincloud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int contrasena = 1350;
        boolean salir = false;
        System.out.println("Bienvenido/a al Cajero Automático");
        System.out.println("Ingrese su contraseña para realizar cualquier operación:");

        int intento;

        while(!salir){
            intento = scanner.nextInt();
            if(intento == contrasena){
                salir = true;
            }
            else{
                System.out.println("La contraseña ingresada es incorrecta. Intente nuevamente:");
            }
        }

        String opcion;
        double saldoDepositar;
        double saldoInicial = 15000.0;
        double saldoRetirar;
        System.out.println("Sistema habilitado.");
        do{
            System.out.println("[1] Consultar saldo");
            System.out.println("[2] Depositar dinero");
            System.out.println("[3] Retirar dinero");
            System.out.println("[4] Salir");
            System.out.println("Ingrese la opcion que desea realizar: ");
            opcion = scanner.next();

            switch (opcion){
                case "1":
                    System.out.println("Su saldo actual es: " + saldoInicial);
                    break;
                case "2":
                    System.out.println("Ingrese el saldo a depositar: ");
                    saldoDepositar = scanner.nextDouble();
                    if (saldoDepositar < 0){
                        System.out.println("Debe ingresar un monto válido. Intente nuevamente realizar una operación.");
                    }
                    else{
                        saldoInicial += saldoDepositar;
                        System.out.println("Depósito exitoso.");
                        System.out.println("Saldo actual: " + saldoInicial);
                    }
                    break;
                case "3":
                    System.out.println("Ingrese el monto a retirar:");
                    saldoRetirar = scanner.nextDouble();
                    if (saldoRetirar > saldoInicial || saldoRetirar < 0){
                        System.out.println("Saldo insuficiente.");
                    }
                    else{
                        saldoInicial -= saldoRetirar;
                        System.out.println("Retiro exitoso.");
                        System.out.println("Saldo actual: " + saldoInicial);
                    }
                    break;
                case "4":
                    System.out.println("Fin de las operaciones.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while(!opcion.equals("4"));
        scanner.close();
        System.out.println("¡Gracias por usar nuestro servicio!");
    }
}