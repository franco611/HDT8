/**
 * @author Diego Franco
 * @version 22/04/2021
 * @since 20/04/2021
 *
 * Clase Paciente que se encarga de llevar el registro de un paciente del hospital.
 */
public class Paciente implements Comparable<Paciente>{
    public String nombre;
    public String enf;
    public String prio;

    /**
     *
     * @param n parametro para identificar al paciente.
     * @param e parametro para identificar el diagnostico.
     * @param p parametro para identificar la prioridad del caso.
     */
    public Paciente(String n, String e,String p){
        nombre = n;
        enf = e;
        prio = p;
    }

    /**
     *
     * @return regresa la estructura correcta de imprimir los datos del paciente.
     */
    public String toString() {
        return "El paciente: " +
                nombre +
                ", tiene:" + enf +
                ", y es de prioridad: " + prio ;
    }

    /**
     *
     * @return retorna el valor de prioridad asignado al paciente.
     */
    public String getPrio(){
        return prio;
    }

    /**
     *
     * @param o parametro del paciente con el cual se ira a comparar.
     * @return regresa la comparacion entre las prioridades de ambos pacientes.
     */
    public int compareTo(Paciente o) {
        return this.getPrio().compareTo(o.getPrio());
    }
}
