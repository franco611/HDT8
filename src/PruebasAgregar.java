import static org.junit.Assert.*;

public class PruebasAgregar {

    @org.junit.Test
    public void add() {
        VectorHeap<Paciente> almacen = new VectorHeap<Paciente>();
        Paciente temp = new Paciente("Ivana Gutierrez","Se abrio la cabeza","A".trim());
        almacen.add(temp);

        assertEquals(1,almacen.size());
    }
}