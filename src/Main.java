import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.*;
import java.io.BufferedWriter;

class Main {
    public static void main(String[]args){
        int res = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido al Sistema del hospital ");
        System.out.println("Indique el idioma del texto que desea traducir");
        System.out.println("[ 1 ] VectorHeap de Java Colection.");
        System.out.println("[ 2 ] VectorHeap propio.");

        while(true){
            try{
                res = s.nextInt();

                if(res>=1 && res<=2){
                    break;
                }else{
                    System.out.println("Ingrese valores entre 1 y 2 !");
                }
            }catch(Exception e){
                System.out.println("Ingrese valores numericos ! ! !");
            }
        }

        if(res==1){
            VectorHeapJC<Paciente> almacen = new VectorHeapJC<Paciente>();

            try{
                File file = new File("pacientes.txt");
                Scanner input = new Scanner (file);
                while(input.hasNextLine()){
                    String dato = input.nextLine();
                    String[] partes = dato.split(",");
                    Paciente temp = new Paciente(partes[0],partes[1],partes[2].trim());

                    almacen.add(temp);
                }

            }catch (Exception e) {
                e.printStackTrace();
            }

            int tamao = almacen.size();
            for (int i=0; i<tamao;i++){
                System.out.println(almacen.remove());
            }

        }else{
            VectorHeapJC<Paciente> almacen = new VectorHeapJC<Paciente>();

            try{
                File file = new File("pacientes.txt");
                Scanner input = new Scanner (file);
                while(input.hasNextLine()){
                    String dato = input.nextLine();
                    String[] partes = dato.split(",");
                    Paciente temp = new Paciente(partes[0],partes[1],partes[2].trim());

                    almacen.add(temp);
                }

            }catch (Exception e) {
                e.printStackTrace();
            }

            int tamao = almacen.size();
            for (int i=0; i<tamao;i++){
                System.out.println(almacen.remove());
            }
        }




    }
}
