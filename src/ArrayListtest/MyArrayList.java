package ArrayListtest;

/****************************
 * @project zjhjavawork
 * @package ArrayListtest
 * @className MyArrayList
 * @author Zjiah
 * @date 2023/5/16 21:29
 * @Description:  泛型类 *
 ****************************/
public class MyArrayList<E> {
    Object[] obj  = new Object[10];
    int size;

    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int a){
        return (E) obj[a];
    }
}
