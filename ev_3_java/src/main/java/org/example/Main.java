package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opcion;
        String res = "";
        String user, password;
        CrearUsuario admin = new CrearUsuario();
        admin.DatosAdmin();

        do {

            System.out.println("Login.");
            System.out.println("---------------------");
            System.out.println("User: ");
            user = scanner.next();
            System.out.println("Password: ");
            password = scanner.next();

            if (user.equals(String.valueOf(user)) && password.equals(String.valueOf(password))) {
                System.out.println("Hospital OK");
                System.out.println("Menú");
                System.out.println("------------------------");
                System.out.println("Elige una opción: ");
                System.out.println();
                System.out.println("1. Alta de doctores");
                System.out.println("2. Alta pacientes");
                System.out.println("3. Crear una cita");
                System.out.println("4. Realizar conexion");
                System.out.println("5. Lista de doctores");
                System.out.println("6. Lista de pacientes");
                System.out.println("7. Lista de citas");
                System.out.println("8. Mostrar conexion");
                System.out.println();

                opcion = scanner.next();

                switch (opcion) {
                    case "1":
                        CrearDoctor doctor = new CrearDoctor();
                        doctor.Datos();
                        doctor.darAltaDoctor();
                        break;

                    case "2":
                        CrearPaciente paciente = new CrearPaciente();
                        paciente.pedirDatos();
                        paciente.darAltaPaciente();
                        break;

                    case "3":
                        GenerarCita cita = new GenerarCita();
                        cita.DatosCita();
                        cita.crearCita();
                        break;

                    case "4":
                        ID conexion = new ID();
                        conexion.pedirDatos();
                        conexion.relacionarInformacion();
                        break;

                    case "5":
                        doctor = new CrearDoctor();
                        doctor.mostrarDoctores();
                        break;

                    case "6":
                        paciente = new CrearPaciente();
                        paciente.mostrarPacientes();
                        break;

                    case "7":
                        cita = new GenerarCita();
                        cita.mostrarCitas();
                        break;

                    case "8":
                        conexion = new ID();
                        conexion.mostrarRelacionesInformacion();
                        break;

                    default:
                        System.out.println("Elige una opcion correcta");

                }
            } else {
                System.out.println("Usuario o Contraseña incorrectos");
            }

            do {
                System.out.println("¿Deseas repetir la aplicacion?");
                System.out.println("si o no: ");
                scanner.nextLine();
                res = scanner.next();
                res = res.toLowerCase();

                if (!res.equals("si") && !res.equals("no")) {
                    System.out.println("Ingresa una opcion valida.");
                }

            } while (!res.equals("si") && !res.equals("no"));

            System.out.println();
        } while (res.equals("si"));

    }



}