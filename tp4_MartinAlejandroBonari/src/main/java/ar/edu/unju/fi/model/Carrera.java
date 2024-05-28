package ar.edu.unju.fi.model;

public class Carrera {
    private int codigo;
    private String nombre;
    private int cantidadAnios;
    private String estado;

    public Carrera(int codigo, String nombre, int cantidadAnios, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadAnios = cantidadAnios;
        this.estado = estado;
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadAnios() {
		return cantidadAnios;
	}

	public void setCantidadAnios(int cantidadAnios) {
		this.cantidadAnios = cantidadAnios;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
    
}
