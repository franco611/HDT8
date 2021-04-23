/**
 * @author Diego Franco
 * @version 22/04/2021
 * @since 20/04/2021
 *
 * Clase VectorHeap que se encarga de almacenar de manera ordenada segun la comparacion realizada.
 */
import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E>
{

    protected Vector<E> data; // the data, kept in heap order

    /**
     * post: constructs a new priority queue
     */
    public VectorHeap()
    {
        data = new Vector<E>();
    }

    /**
     * @param v constructs a new priority queue from an unordered vector
     */
    public VectorHeap(Vector<E> v)
    {
        int i;
        data = new Vector<E>(v.size()); // we know ultimate size
        for (i = 0; i < v.size(); i++)
        { // add elements to heap
            add(v.get(i));
        }
    }

    /**
     * @param i 0 <= i < size
     * @return returns parent of node at location i
     */
    protected static int parent(int i)
    {
        return (i-1)/2;
    }

    /**
     * @param i 0 <= i < size
     * @return returns index of left child of node at location i
     */
    protected static int left(int i)
    {
        return 2*i+1;
    }

    /**
     *
     * @param i 0 <= i < size
     * @return returns index of right child of node at location i
     */
    protected static int right(int i)
    {
        return (2*i+1) + 1;
    }

    /**
     * // post: moves node at index leaf up to appropriate position
     * @param leaf 0 <= leaf < size
     */
    protected void percolateUp(int leaf)
    {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 &&
                (value.compareTo(data.get(parent)) < 0))
        {
            data.set(leaf,data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf,value);
    }

    /**
     * // post: value is added to priority queue
     * @param value value is non-null comparable
     */
    public void add(E value)
    {
        data.add(value);
        percolateUp(data.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {
        data.clear();
    }

    /**
     * // post: moves node at index root down
     * // to appropriate position in subtree
     * @param root 0 <= root < size
     */
    protected void pushDownRoot(int root)
    {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize)
            {
                if ((right(root) < heapSize) &&
                        ((data.get(childpos+1)).compareTo
                                (data.get(childpos)) < 0))
                {
                    childpos++;
                }
                // Assert: childpos indexes smaller of two children
                if ((data.get(childpos)).compareTo
                        (value) < 0)
                {
                    data.set(root,data.get(childpos));
                    root = childpos; // keep moving down
                } else { // found right location
                    data.set(root,value);
                    return;
                }
            } else { // at a leaf! insert and halt
                data.set(root,value);
                return;
            }
        }
    }

    @Override
    public E getFirst() {
        return data.firstElement();
    }

    /**
     *
     * @return returns and removes minimum value from queue
     */
    public E remove()
    {
        if(!isEmpty()){
            E minVal = getFirst();
            data.set(0,data.get(data.size()-1));
            data.setSize(data.size()-1);
            if (data.size() > 1) pushDownRoot(0);
            return minVal;

        }
        return null;

    }

}