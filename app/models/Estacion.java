package models;

import java.io.Serializable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "inve_estacion")
public class Estacion implements Serializable {
    private static final long serialVersionUID = 1L;

    @DatabaseField(id = true, columnName = "ide_estacion")
    private int id;
    
    @DatabaseField(canBeNull = false, columnName = "nombre_estacion")
    private String nombre;
    
    @DatabaseField(canBeNull = false, columnName = "descripcion")
    private String descripcion;
    
    @DatabaseField(canBeNull = false, columnName = "latitud")
    private double latitud;
    
    @DatabaseField(canBeNull = false, columnName = "longitud")
    private double longitud;

    Estacion(){

    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
    
}
