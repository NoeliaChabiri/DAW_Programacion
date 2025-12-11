public class OperadoresEjemplo {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        boolean resultado;

        // Aritméticos
        System.out.println("Suma: " + (a + b));          // 8
        System.out.println("Resta: " + (a - b));         // 2
        System.out.println("Multiplicación: " + (a * b));// 15
        System.out.println("División: " + (a / b));      // 1
        System.out.println("Módulo: " + (a % b));        // 2

        // Incremento/Decremento
        a++;
        System.out.println("Incremento a++: " + a);      // 6
        b--;
        System.out.println("Decremento b--: " + b);      // 2

        // Relacionales
        System.out.println("a == b: " + (a == b));       // false
        System.out.println("a != b: " + (a != b));       // true
        System.out.println("a > b: " + (a > b));         // true
        System.out.println("a < b: " + (a < b));         // false

        // Lógicos
        resultado = (a > b) && (b > 0);
        System.out.println("(a>b) && (b>0): " + resultado); // true
        resultado = (a < b) || (b > 0);
        System.out.println("(a<b) || (b>0): " + resultado); // true
        resultado = !(a == b);
        System.out.println("!(a==b): " + resultado);        // true

        // Asignación combinada
        a += 10; // a = a + 10
        System.out.println("a += 10: " + a);               // 16
        b *= 5;  // b = b * 5
        System.out.println("b *= 5: " + b);               // 10
    }
}
