/**
 * @author Diego Franco
 * @version 22/04/2021
 * @since 20/04/2021
 *
 * Interfaz PriorityQueue en la que se basa el VectorHeap para poder trabajar las comparaciones.
 */
public interface PriorityQueue<E extends Comparable<E>>
{
    /**
     *
     * @return regresa el primer valor almacenado.
     */
    public E getFirst();


    /**
     *
     * @return regresa y elimina el valor mas pequeño.
     */
    public E remove();

    /**
     *
     * @param value recibe el valor que se agregara.
     */
    public void add(E value);

    /**
     *
     * @return regresa verdadero si no hay elementos guardados.
     */
    public boolean isEmpty();

    /**
     *
     * @return regresa el numero de elementos almacenados.
     */
    public int size();


    /**
     * Borra todos los elementos agregados.
     */
    public void clear();
    // post: removes all elements from queue
}