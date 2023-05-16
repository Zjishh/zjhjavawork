package ArrayListtest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/****************************
 * @project zjhjavawork
 * @package ArrayListtest
 * @className ListUtil
 * @author Zjiah
 * @date 2023/5/16 21:41
 * @Description:   *
 ****************************/
public class ListUtil implements Map {

    Object[] e = new Object[10];


    public static <E> boolean addall(ArrayList<E> list,E e){
        list.add(e);

        return true;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
