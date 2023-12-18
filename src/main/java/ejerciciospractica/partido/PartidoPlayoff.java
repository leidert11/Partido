package ejerciciospractica.partido;


public class PartidoPlayoff extends Partido{
    private String ronda;

    public PartidoPlayoff(String equipoLocal, String equipoVisitante, 
            String ronda, String fechaPartido) {
        super(equipoLocal, equipoVisitante, fechaPartido);
        this.ronda = ronda;
    }

    public String getRonda() {
        return ronda;
    }

    public void setRonda(String ronda) {
        this.ronda = ronda;
    }

    @Override
    public String mostrarPartido() {
        return "Partido{" + 
                "equipoLocal=" + super.getEquipoLocal() + 
                ", equipoVisitante=" + super.getEquipoVisitante() + 
                ", cestasLocal=" + super.getCestasLocal() + 
                ", cestasVisitante=" + super.getCestasVisitante() + 
                ", finalizado=" + super.isFinalizado() + 
                ", ronda=" + this.ronda + 
                ", fechaPartido=" + super.getFechaPartido() + '}';
    }

    @Override
    public String obtenerResultado() {
        return "El resultado es: "+super.getEquipoLocal() + " " + super.getCestasLocal() +
                " - " + super.getEquipoVisitante() + " " + super.getCestasVisitante();
    }

    @Override
    public String obtenerGanador() {
        if (super.getCestasLocal() > super.getCestasVisitante() && super.isFinalizado()){
            return super.getEquipoLocal();
        }else if(super.getCestasLocal() < super.getCestasVisitante() 
                && super.isFinalizado()){
            return super.getEquipoVisitante();
        }else{
            return "Partido no finalizado";
        }
    }

    @Override
    public boolean finalizarPartido() {
        if (super.getCestasLocal() == super.getCestasVisitante()) {
            return false;
        }else{
            super.setFinalizado(true);
            return true;
        }
    }


}
public interface Operaciones {
    String obtenerResultado();
    String obtenerGanador();
    boolean finalizarPartido();
}
