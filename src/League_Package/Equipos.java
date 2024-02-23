package League_Package;

public class Equipos {

    private String nombre, pais, ciudad, estadio;

    public Equipos() {
    }

    public Equipos(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Equipos(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
