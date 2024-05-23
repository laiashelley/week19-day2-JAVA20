public class Clientes {
    
    private String nombre;
    private int edad;
    private int idClientes;

    // creo contador de id des de 0:

    private static int id = 0;

    public Clientes() {
    }

    public Clientes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

        // aqui le digo que idClientes se basará en el metodo estatic nuevoId() para ir acumulando el id:

        this.idClientes = nuevoId();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdClientes() {
        return this.idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    // creo metodo estatico para contabilizar los id:

    public static int nuevoId(){
        return id++;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", idClientes='" + getIdClientes() + "'" +
            "}";
    }

}
