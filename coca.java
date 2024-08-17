import java.util.Scanner;
    public class coca{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        int clave = 0;
        int antiguedad = 0;

        /* Clave 1 = Atencion al cliente  */
        /* Clave 2 = Logistica */
        /* Clave 3 = Gerencial */
        System.out.println("=========================================================================");
        System.out.println("***Bienvenido al sistema vacacional de Coca-Cola Femsa, S.A.B. de C.V.***");
        System.out.println("=========================================================================");
        System.out.println("Porfavor ingresa el nombre del empleado");
        nombre = teclado.nextLine();
        System.out.println("Ingresa la clave del departamento");
        clave = teclado.nextInt();
        System.out.println("Ahora ingresa la antiguedad que tenga el empleado");
        antiguedad = teclado.nextInt();
        if (clave == 1 && antiguedad == 1){
            System.out.println(nombre + " Tiene derecho a 6 dias de vacaciones");
        }else if (clave == 1 && antiguedad <=6){
            System.out.println(nombre + " Tiene derecho a 14 dias de vacaciones");
        } else if (clave == 1 && antiguedad >= 7){
            System.out.println(nombre + " Tiene derecho a 20 dias de vacaciones");
        }else if (clave == 2 && antiguedad == 1){
            System.out.println(nombre + " Tiene derecho a 7 dias de vacaciones");
        }else if (clave == 2 && antiguedad <=6){
            System.out.println(nombre + " Tiene derecho a 15 dias de vacaciones");
        }else if (clave == 2 && antiguedad >=7){
            System.out.println(nombre + " Tiene derecho a 22 dias de vacaciones");
        }else if (clave == 3 && antiguedad == 1){
            System.out.println(nombre + " Tiene derecho a 10 dias de vacaciones");
        }else if (clave == 3 && antiguedad <=6){
            System.out.println(nombre + " Tiene derecho a 20 dias de vacaciones");
        }else if (clave == 3 && antiguedad >=7){
            System.out.println(nombre + " Tiene derecho a 30 dias de vacaciones");
        }else{
            System.out.println("Los datos son incorrectos");
        }   
    }     
}
    
        

    