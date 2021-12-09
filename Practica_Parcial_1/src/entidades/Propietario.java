package entidades;
import java.util.LinkedList;


public class Propietario {
	
	private int dni;
	private String descripcion;
	private String telefono;
	private String Domicilio;
	private LinkedList<Propiedad> propiedades = new LinkedList<>();
	
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDomicilio() {
		return Domicilio;
	}
	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}
	public LinkedList<Propiedad> getPropiedades() {
		return propiedades;
	}
	public void setPropiedades(LinkedList<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}
	
	

	
}
