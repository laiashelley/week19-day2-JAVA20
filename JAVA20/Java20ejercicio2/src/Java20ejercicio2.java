// 2- (medio-difícil) CONTADOR ID CLIENTES

// Vamos a crear un generador de ids de clientes, y para ello nos valdremos del static. OJO! Si borras
// un cliente, no pueden cambiar los ids de los que vienen detrás.
// Propuesta 3 ejercicios al respecto:

// 1º - Cómo haces un contador simple SIN static, con un método en la clase. La clase puede llamarse
// contarClase, p.ej.

// 2º- Cómo haces un contador simple CON static => contador de clase, que cada vez que llames al
// método te sume uno. SumaTotal = SumaTotal +1 (cuantas veces llamas al método)

// 3º - Contador con static que se aplique a los clientes, y que conserve el número de id de cliente aunque se borren otros. Pista: os recuerdo que existen las variables intermedias (estás creando un contador static pero lo debes poder aplicar a cada objeto). Quiere decir que el primer cliente que damos de alta tiene el idCliente=1, el segundo =2, etc. Crear 3 ó 4 e imprimir el num de id de cada cliente, que tiene ser consecutivo, incluso aunque borres cliente entre medio.

// PD: podéis usar debuggar para ver por dónde va el flujo del programa, y ver cuanto vale la variable idCliente

public class Java20ejercicio2 {
    public static void main(String[] args) throws Exception {

        // instancias de Clientes:
       
        Clientes cliente1 = new Clientes("Laia", 28);
        Clientes cliente2 = new Clientes("Eric", 29);
        Clientes cliente3 = new Clientes("Cooper", 10);

        // mostramos el id de cada cliente:

        System.out.println(cliente1.getNombre() + " " + cliente1.getIdClientes());
        System.out.println(cliente2.getNombre() + " " + cliente2.getIdClientes());
        System.out.println(cliente3.getNombre() + " " + cliente3.getIdClientes());

        // instanciamos más clientes:

        Clientes cliente4 = new Clientes("Gennai", 11);
        Clientes cliente5 = new Clientes("Tacihi", 4);
        Clientes cliente6 = new Clientes("Mars", 4);

        // mostramos el id de los siguientes clientes:

        System.out.println(cliente4.getNombre() + " " + cliente4.getIdClientes());
        System.out.println(cliente5.getNombre() + " " + cliente5.getIdClientes());
        System.out.println(cliente6.getNombre() + " " + cliente6.getIdClientes());

        // si mostramos los primeros clientes, sale el id que les toca:

        System.out.println(cliente1.getNombre() + " " + cliente1.getIdClientes());
        System.out.println(cliente2.getNombre() + " " + cliente2.getIdClientes());
        System.out.println(cliente3.getNombre() + " " + cliente3.getIdClientes());

    }
}
