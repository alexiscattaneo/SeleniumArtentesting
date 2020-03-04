package Escuela;

import java.util.Arrays;
import java.util.List;

import Escuela.Alumno;

public class Quinto {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Alan","Diaz","ABC123",7,8,9);
		Alumno alumno2 = new Alumno("Pablo","Garrago","QWE456",6,8,6);
		Alumno alumno3 = new Alumno("Martina","Medina","RTY789",7,7,9);
		Alumno alumno4 = new Alumno("Micaela","Gonzalez","ASD098",10,6,6);
		Alumno alumno5 = new Alumno("Carolina","Herrere","FGH765",3,2,8);
		Alumno alumno6 = new Alumno("Albert","Einstein","XXXXXX",10,10,10);
		List<Alumno> listaAlumnos = Arrays.asList(alumno1,alumno2,alumno3,alumno4,alumno5,alumno6);
		for(Alumno alumno:listaAlumnos) {
			System.out.println("Nombre: "+alumno.getNombre());
			System.out.println("Apellido: "+alumno.getApellido());
			System.out.println("Legajo: "+alumno.getLegajo());
			System.out.println("Nota Matemáticas: "+alumno.getNMatematica());
			System.out.println("Nota Lengua: "+alumno.getNLengua());
			System.out.println("Nota Programación: "+alumno.getNProgramacion());
			System.out.println("Promedio: "+String.format("%.2f", alumno.getPromedio()));
			
			if(alumno.getNMatematica() < 6 || alumno.getNLengua() < 6 || alumno.getNProgramacion() < 6) {
				System.out.println("El alumno tiene materias sin aprobar");
			}
			
			if(alumno.getPromedio() < 6) {
				System.out.println("El alumno no está aprobado");
			}else if(alumno.getPromedio() > 9) {
				System.out.println("Es un alumno destacado");
			}
			
			System.out.println(" ");
	}

}
	
}
