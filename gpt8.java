import java.util.Scanner;
    public class gpt8{
        public static void main(String args[]){
            Scanner keyboard = new Scanner (System.in);
            int num = 0;
            long factorial = 0;

            System.out.println("Ingresa un numero");
            num = keyboard.nextInt();
            System.out.println("El numero seleccionado es " + num);
            for(int i = 1; i<=num; i++){
                i = factorial * num;
                System.out.println("El factorial de " + num + " es : " + factorial);
            }
        }
    }