public class Aereopuerto {
    private String codigoAereopuerto;
    private String nombre;
    private Ciudad ciudad;

    public Aereopuerto(String codigoAereopuerto, String nombre, Ciudad ciudad) {
        this.codigoAereopuerto = codigoAereopuerto;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getCodigoAereopuerto() {
        return codigoAereopuerto;
    }

    public void setCodigoAereopuerto(String codigoAereopuerto) {
        this.codigoAereopuerto = codigoAereopuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
