package ejerciciospractica.partido;


public class PartidoLiga extends Partido {

    private int jornada;

    public PartidoLiga(String equipoLocal, String equipoVisitante,
            int jornada, String fechaPartido) {
        super(equipoLocal, equipoVisitante, fechaPartido);
        this.jornada = jornada;
    }

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    @Override
    public String mostrarPartido() {
        return "Partido{"
                + "equipoLocal=" + super.getEquipoLocal()
                + ", equipoVisitante=" + super.getEquipoVisitante()
                + ", cestasLocal=" + super.getCestasLocal()
                + ", cestasVisitante=" + super.getCestasVisitante()
                + ", finalizado=" + super.isFinalizado()
                + ", jornada=" + this.jornada
                + ", fechaPartido=" + super.getFechaPartido() + '}';
    }

    @Override
    public String obtenerGanador() {
        if (super.getCestasLocal() > super.getCestasVisitante() && super.isFinalizado()) {
            return super.getEquipoLocal();
        } else if (super.getCestasLocal() < super.getCestasVisitante()
                && super.isFinalizado()) {
            return super.getEquipoVisitante();
        } else if (super.getCestasLocal() == super.getCestasVisitante()
                && super.isFinalizado()) {
            return "Empate";
        } else {
            return "Partido no finalizado";
        }
    }

    @Override
    public boolean finalizarPartido() {
        super.setFinalizado(true);
        return true;
    }

    @Override
    public String obtenerResultado() {
        return "El resultado es: " + super.getEquipoLocal() + " " + super.obtenerCestasLocal() +
                " - " + super.getEquipoVisitante() + " " + super.obtenerCestasVisitante();
    }

}
