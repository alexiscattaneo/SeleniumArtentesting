package Escuela;

public class Alumno {
	private String Nombre;
	private String Apellido;
	private String Legajo;
	private int NotaMatematica;
	private int NotaLengua;
	private int NotaProgramacion;
	private double Promedio;
	
	public Alumno(String Nombre, String Apellido, String Legajo, int NotaMatematica, int NotaLengua, int NotaProgramacion) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Legajo = Legajo;
		this.NotaMatematica = NotaMatematica;
		this.NotaLengua = NotaLengua;
		this.NotaProgramacion = NotaProgramacion;
		this.Promedio = this.getPromedio();
	}

	public String getNombre() {
		return this.Nombre;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getApellido() {
		return this.Apellido;
	}
	
	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}
	
	public String getLegajo() {
		return this.Legajo;
	}
	
	public void setLegajo(String Legajo) {
		this.Legajo = Legajo;
	}
	
	public int getNMatematica() {
		return this.NotaMatematica;
	}
	
	public void setNMatematica(int NotaMatematica) {
		this.NotaMatematica = NotaMatematica;
	}
	
	public int getNLengua() {
		return this.NotaLengua;
	}
	
	public void setNLengua(int NotaLengua) {
		this.NotaLengua= NotaLengua;
	}
	
	public int getNProgramacion() {
		return this.NotaProgramacion;
	}
	
	public void setNProgramacion(int NotaProgramacion) {
		this.NotaProgramacion = NotaProgramacion;
	}
	
	public double getPromedio() {
		return ((this.NotaMatematica+this.NotaLengua+this.NotaProgramacion)/3);
	}
}
