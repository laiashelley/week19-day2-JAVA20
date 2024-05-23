// 1- (fácil) entrenamiento (opcional)

// Tenemos diversos camiones y creamos una variable estática (numRuedas) y dos métodos estáticos:
// acelerar() y frenar(). El resto de atributos y métodos, son no-estáticos.

// Desde el main, crear 3 camiones e imprimir su estado. Cómo muestras el número de ruedas?

// Llamar a los métodos estáticos y mostrar “acelerando” o “frenando”.

public class Java20ejercicio1 {
    public static void main(String[] args) throws Exception {

        // instanciar camiones
        
        Camiones camion1 = new Camiones("Volvo", 420, 120.000);
        Camiones camion2 = new Camiones("Scania", 450, 130.000);
        Camiones camion3 = new Camiones("Mercedes-Benz", 400, 125.000);

        // mostrar numero de ruedas de los 3 camiones

        System.out.println(Camiones.getRuedas());

        // mostrar camiones acelerando:

        System.out.println(Camiones.acelerar());

        // mostrar camiones frenando:

        System.out.println(Camiones.frenar());


    }
}
