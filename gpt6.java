import java.util.Scanner;
    public class gpt6{
        public static void main(String args[]){

            Scanner keyboard = new Scanner(System.in);
            int num = 0;
            
            System.out.println("Ingresa el numero para ver los numero enteros que van antes");
            num =keyboard.nextInt();
            System.out.println("Los numeros que van antes de " + num + " son");
            for(int i = num; i>=0;i--){
            System.out.print(i + " ");
            }
    }
}