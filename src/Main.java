import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.*;
import java.io.BufferedWriter;

class Main {
    public static void main(String[]args){
        int res = 0;
        int res2 = 0;
        String idioma = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido al Sistema del hospital ");
        System.out.println("");



        try{
            File file = new File("pacientes.txt");
            Scanner input = new Scanner (file);
            while(input.hasNextLine()){
                String dato = input.nextLine();
                String[] partes = dato.split(",");
                System.out.println("El paciente: "+partes[0]+"tiene:"+partes[1]+" es de prioridad:"+partes[2]);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
