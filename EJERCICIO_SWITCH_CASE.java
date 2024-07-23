import java.util.Scanner;
 public class casee{
    public static void main(String args[]){
        //1) Ingresar 2 números y luego un carácter 
        //indicando la operación a realizar (+,-,*,/) //
        //y reportar el resultado de la operación.

        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        char operacion;

        System.out.println("================================================================");
        System.out.println("             Bienvenido a la calculadora de Miguelon ");
        System.out.println("================================================================");
        System.out.println("Porfavor ingresa la operación a realizar");
        System.out.println("SUMA = + RESTA = - MULTIPLICACIÓN = * DIVICIÓN = /");
        operacion = teclado.next().charAt(0);
        System.out.println("Ahora ingresa el primer valor");
        num1 = teclado.nextInt();
        System.out.println("Ahora ingresa el segundo valor");
        num2 = teclado.nextInt();

        switch (operacion) {
            case '+' : resultado = num1 + num2;
            System.out.println("El resultado de la suma es " + resultado);
            break;
            case '-' : resultado = num1 - num2;
            System.out.println("El resultado de la resta es " + resultado);
            break;
            case '*' : resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es " + resultado);
            break;
            case '/' : resultado = num1 / num2;
            System.out.println("El resultado de la divición es " + resultado);
            break;
            default: System.out.println("Error de marcación");
                break;
        }
        teclado.close();





    }

}