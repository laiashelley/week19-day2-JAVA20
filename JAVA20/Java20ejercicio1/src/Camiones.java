public class Camiones {
    
    private String marca;
    private double caballos;
    private double precio;

    // variable estatica igual para todas las instancias

    private static int ruedas = 4;

    public Camiones() {
    }

    public Camiones(String marca, double caballos, double precio) {
        this.marca = marca;
        this.caballos = caballos;
        this.precio = precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCaballos() {
        return this.caballos;
    }

    public void setCaballos(double caballos) {
        this.caballos = caballos;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // metodo estatico para devolver el numero de ruedas de los camiones:

    public static int getRuedas(){
        return ruedas;
    }

    // metodo estatico para acelerar:

    public static String acelerar(){
        return "Acelerando";
    }

    // metodo estatico para frenar:

    public static String frenar(){
        return "Frenando";
    }

    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", caballos='" + getCaballos() + "'" + getPrecio();
    }

}
