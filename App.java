public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Pedir al usuario ingresar 3 números enteros diferentes
        System.out.println("Ingrese el primer número entero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número entero:");
        int num3 = scanner.nextInt();

        // Calcular y mostrar la suma de los dos números más pequeños
        int suma = calcularSumaDosMasPequenos(num1, num2, num3);
        System.out.println("La suma de los dos números más pequeños es: " + suma);

        // Calcular y mostrar la resta de los dos números más grandes
        int resta = calcularRestaDosMasGrandes(num1, num2, num3);
        System.out.println("La resta de los dos números más grandes es: " + resta);

        // Encontrar y mostrar el número más grande entre los tres
        int max = encontrarMaximo(num1, num2, num3);
        System.out.println("El número más grande entre los tres es: " + max);

        scanner.close();
    }
}
