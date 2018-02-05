package es.altair.formulario.bean;

public class Empleado {
	private int idEmpleado;
	private String nombrre;
	private long salario;
	private int edad;

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(int idEmpleado, String nombrre, long salario, int edad) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombrre = nombrre;
		this.salario = salario;
		this.edad = edad;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombrre() {
		return nombrre;
	}

	public void setNombrre(String nombrre) {
		this.nombrre = nombrre;
	}

	public long getSalario() {
		return salario;
	}

	public void setSalario(long salario) {
		this.salario = salario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
