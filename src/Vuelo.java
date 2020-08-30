import java.util.Date;
import java.util.List;

public class Vuelo {
    private String codigoVuelo;
    private  Date salida;
    private List<Billete> billetes;
    private Aereopuerto origen;
    private Aereopuerto destino;

    public Vuelo(String codigoVuelo, Date salida, List<Billete> billetes, Aereopuerto origen, Aereopuerto destino) {
        this.codigoVuelo = codigoVuelo;
        this.salida = salida;
        this.billetes = billetes;
        this.origen = origen;
        this.destino = destino;
    }

    public Vuelo(String codigoVuelo, Date salida, Aereopuerto origen, Aereopuerto destino) {
        this.codigoVuelo = codigoVuelo;
        this.salida = salida;
        this.origen = origen;
        this.destino = destino;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public List<Billete> getBilletes() {
        return billetes;
    }

    public void setBilletes(List<Billete> billetes) {
        this.billetes = billetes;
    }

    public Aereopuerto getOrigen() {
        return origen;
    }

    public void setOrigen(Aereopuerto origen) {
        this.origen = origen;
    }

    public Aereopuerto getDestino() {
        return destino;
    }

    public void setDestino(Aereopuerto destino) {
        this.destino = destino;
    }
}
