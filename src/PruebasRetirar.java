import static org.junit.Assert.*;

public class PruebasRetirar {

    @org.junit.Test
    public void retirar() {
        VectorHeap<Paciente> almacen = new VectorHeap<Paciente>();
        Paciente temp = new Paciente("Ivana Gutierrez","Se abrio la cabeza","A".trim());
        almacen.add(temp);
        almacen.remove();

        assertEquals(0,almacen.size());
    }
}