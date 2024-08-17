import java.util.Scanner;
    public class Division {
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int num_1 = 0; 
            int num_2 = 0; 
            int resultado = 0;
            //Crea un programa que pida al usuario dos números >//
            //y muestre el resultado de su división. Si el segundo //
            //número es 0, debe mostrar un mensaje de error.//

            System.out.println("Division");
            System.out.println("Porfavor ingresa el primer valor para hacer tu division");
            num_1 = teclado.nextInt();
            System.out.println("Ahora ingresa el segundo numero para dividir");
            num_2 = teclado.nextInt();
            if (num_2 >=1){
                resultado = num_1 / num_2; 
                System.out.println("El resultado de la division es " + resultado);
            }else{
                System.out.println("El valor que ingresaste es incorrecto ");
            }           
        }
    }

