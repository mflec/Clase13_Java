package ar.edu.utn.ap4_java.persona;

import java.util.Scanner;
import lombok.Data;

public class App {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese su fecha de nacimiento (dd/mm/aaaa): ");
        String fechaNacimiento = scanner.nextLine();

        // Crear una instancia de Persona y establecer los valores utilizando los setters generados por Lombok
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setFechaNacimiento(fechaNacimiento);

        System.out.println("¡Gracias por ingresar sus datos!");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());

        scanner.close();
    }
