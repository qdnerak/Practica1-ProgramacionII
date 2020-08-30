import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        //cliente
        Cliente carlos = new Cliente(1, "Carlos","Perez", "Vargas");
        //ciudad
        Ciudad cochabamba = new Ciudad(1,"Cochabamba");
        Ciudad santaCruz = new Ciudad(2,"Santa Cruz");
        Ciudad tarija = new Ciudad(3, "Tarija");
        //categoria
        Categoria turista = new Categoria(1, "Turista");
        //aereopuertos
        Aereopuerto jorgeWilstermann = new Aereopuerto("JW","Jorge Wilsterman Camacho",cochabamba);
        Aereopuerto viruViru = new Aereopuerto("VV","Viru Viru", santaCruz);
        Aereopuerto orielLea = new Aereopuerto("OL", "Oriel Lea Plaza", tarija);
        //vuelos
        List<Vuelo> vuelos = new ArrayList<>();
        Vuelo cochabambaSantaCruz = new Vuelo("BOA-158", Calendar.getInstance().getTime(),jorgeWilstermann, viruViru);
        vuelos.add(cochabambaSantaCruz);
        Vuelo santaCruzTarija = new Vuelo("BOA-159", Calendar.getInstance().getTime(),viruViru,orielLea);
        vuelos.add(santaCruzTarija);
        //billete
        Billete billete = new Billete(1, Calendar.getInstance().getTime(),650.5, carlos, cochabamba, tarija,turista,vuelos);
        System.out.println("***********");
        System.out.println("**BILLETE**");
        System.out.println("***********");
        System.out.println("Id"+billete.getIdBillete());
        System.out.println("Fecha: "+ billete.getFechaEmision());
        System.out.println("Precio: "+billete.getPreciototal());
        System.out.println("Cliente: "+billete.getCliente().getNombre());
        System.out.println("Origen: "+billete.getOrigen().getNombre());
        System.out.println("Destino: "+billete.getDestino().getNombre());
        System.out.println("Categoria: "+billete.getCategoria().getNombre());
        System.out.println("Vuelos");
        for (Vuelo vuelo:billete.getVuelos())
        {
            System.out.println("Codigo vuelo:"+vuelo.getCodigoVuelo()+ vuelo.getSalida()+ "| Origen: "+vuelo.getOrigen().getNombre()+ "| Destino: "+vuelo.getDestino().getNombre() );
        }


    }
}
