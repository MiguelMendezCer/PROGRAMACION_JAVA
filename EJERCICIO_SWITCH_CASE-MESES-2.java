//Ingresar el número de mes y el año y reporte el número de días que tiene ese mes//
import java.util.Scanner;
 public class meses2{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int month = 0;
        int year = 0;

        System.out.println("=================================================");
        System.out.println("==========¿Cuantos dias tiene cada mes?==========");
        System.out.println("=================================================");

        System.out.println("=================================================");
        System.out.println("Lee las instrucciones para poder usar el sistema");
        System.out.println("=================================================");
        System.out.println("Ingresa el numero de mes (1,2,3,4...)");
        month = teclado.nextInt();
        System.out.println("Ahora ingresa el año (2000,2001,2002....)");
        year = teclado.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println("Este mes tiene 31 dias y el año es " + year);
            break;
            case 2:if((year % 4 == 0 && year % 100!=0) || year%400==0)
            System.out.println("Este mes tiene 29 dias y el año es " + year);
            else{System.out.println("El mes tiene 28 dias " + year);

            }
            break;
            case 4: case 6: case 9: case 11:
            System.out.println("Este mes tiene 30 dias y el año es " + year);
            break;
            default:System.out.println("Datos incorrectos");
            break;
        }        
    }
 }