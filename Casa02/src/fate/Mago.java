package fate;
/**
 * 
 * @author ricardo99
 *
 */
public class Mago {
	protected String nombre;
	protected String clase;
	protected String idClase;
	protected Sirviente servant;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getIdClase() {
		return idClase;
	}
	public void setIdClase(String idClase) {
		this.idClase = idClase;
	}
	public Sirviente getServant() {
		return servant;
	}
	public void setServant(Sirviente servant) {
		this.servant = servant;
	}
	
}
