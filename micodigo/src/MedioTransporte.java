public abstract class MedioTransporte {

    private int multiplicador;
    private int distancia;

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double calcularCosto(int distancia){
        setDistancia(distancia);
        return getMultiplicador()*getDistancia();
    }

    public double calcularCosto(){
        return getMultiplicador()*getDistancia();
    }

}


//Como no existe esa clase en la realidad se hace abstracta
//Se usa el metodo getter y setter para acceder al multiplicador ya que es privado