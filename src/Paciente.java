public class Paciente implements Comparable<Paciente>{
    public String nombre;
    public String enf;
    public String prio;

    public Paciente(String n, String e,String p){
        nombre = n;
        enf = e;
        prio = p;
    }

    @Override
    public String toString() {
        return "El paciente: " +
                nombre +
                ", tiene:" + enf +
                ", y es de prioridad: " + prio ;
    }

    public String getPrio(){
        return prio;
    }

    public int compareTo(Paciente o) {
        return this.getPrio().compareTo(o.getPrio());
    }
}
