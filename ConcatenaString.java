import java.util.Scanner;

public class ConcatenaString {
    public static void main(String[] args) {

        String [] nombres = leerNombres();

        String concat = "";
        for (String nombre : nombres) concat = concat + nombre.trim() + " ";
        System.out.print("Los nombres son: ");
        System.out.println(concat);

    }

    public static String [] leerNombres (){

        String [] nombres = new String[4];
        Scanner teclado = new Scanner(System.in);
        for(int i=0; i<4; i++){
            System.out.println("Ingrese el nombre número " + (i+1));
            nombres[i] = teclado.nextLine();
        }
        return nombres;
    }

}