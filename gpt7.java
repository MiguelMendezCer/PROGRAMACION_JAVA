import java.util.Scanner;
    public class gpt7 {
    
        public static void main(String args[]){
            Scanner keyboard = new Scanner(System.in);
            int num = 0;
            int resultado = 0; 

            System.out.println("Por favor ingresa el numero para saber la tabla del 1 al 10");
            num = keyboard.nextInt();
            System.out.println("Tabla de multiplicar del " + num);
            for(int i=1; i<=10; i++){
                resultado = i*num;
                System.out.println(num + " x " + i + " = " + resultado);

            }
        }
    }