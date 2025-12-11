public class EjemploDeVariables {

    // 1. VARIABLE STATIC (La información COMPARTIDA para toda la clase)
    // Es como el nombre de la empresa. ¡Es el mismo para todos los empleados!
    // Si lo cambiamos, le cambia a todos al mismo tiempo.
    public static String nombreClase = "EjemploDeVariables";

    // 2. VARIABLE FINAL (La Regla que NUNCA Cambia)
    // Es una CONSTANTE. Es información tan importante que NUNCA se debe tocar después de ponerla.
    // Como la tasa de impuestos del país, ¡es FÍSICA y no se modifica!
    public static final double TASA_IMPUESTO = 0.16; // 16%

    // 3. VARIABLE DE INSTANCIA (La información PERSONAL de cada objeto)
    // Es como el nombre de cada empleado. Cada empleado tiene el suyo.
    public String nombreEmpleado;

    // 4. VARIABLE FINAL DE INSTANCIA (Información Personal que NUNCA Cambiará)
    // Es como el DNI o ID de empleado. Se asigna una vez y ya no se puede cambiar.
    public final int idEmpleado;

    // Constructor: Esto es lo que hacemos cuando "creamos" un nuevo empleado.
    public EjemploDeVariables(String nombre, int id) {
        // Le damos su nombre personal
        this.nombreEmpleado = nombre;
        // Le asignamos su ID personal (que ya no se puede cambiar después)
        this.idEmpleado = id;
    }

    // Este es un "método" o una "acción" que puede hacer el empleado: mostrar sus datos
    public void mostrarInformacion() {
        // 5. VARIABLE LOCAL (Información TEMPORAL que solo vive aquí dentro)
        // Es como una nota mental que se usa solo para este momento y luego se olvida.
        int antiguedadAnios = 5;

        System.out.println("--- Información Personal del Empleado ---");
        System.out.println("Nombre: " + this.nombreEmpleado);
        System.out.println("ID (Fijo): " + this.idEmpleado);
        System.out.println("Antigüedad (Temporal): " + antiguedadAnios + " años");
        System.out.println("--- Datos Compartidos de la 'Empresa' ---");
        System.out.println("Nombre de la 'Empresa' (Compartido): " + nombreClase);
        System.out.println("Tasa de Impuesto (La Regla Fija): " + TASA_IMPUESTO);

        // ¡ATENCIÓN! Si quisiéramos cambiar TASA_IMPUESTO aquí...
        // TASA_IMPUESTO = 0.18; // ...el programa nos daría un error, ¡porque es FINAL!
    }

    // El "main" es el jefe de la empresa que organiza todo
    public static void main(String[] args) {
        // Creamos a la "empleada Noelia"
        EjemploDeVariables empleado1 = new EjemploDeVariables("Noelia", 101);
        // Creamos al "empleado Víctor"
        EjemploDeVariables empleado2 = new EjemploDeVariables("Víctor", 102);

        // Pedimos a Noelia que nos muestre sus datos
        empleado1.mostrarInformacion();
        System.out.println("\n");
        // Pedimos a Víctor que nos muestre sus datos
        empleado2.mostrarInformacion();

        // ¡La empresa cambia de nombre!
        // Como 'nombreClase' es STATIC (Compartido), al cambiarlo, le cambia a todos:
        EjemploDeVariables.nombreClase = "Ejemplo Modificado";
        System.out.println("\n--- La información Compartida (STATIC) ha cambiado ---");
        System.out.println("Noelia ahora ve este nombre: " + empleado1.nombreClase);
        System.out.println("Víctor ahora ve este nombre: " + empleado2.nombreClase);
    }
}
