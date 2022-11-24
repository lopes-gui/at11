/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at11;
import java.util.Iterator;
/**
 *
 * @author guilh
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
return null;
    }
     public void remove(){
        throw new UnsupportedOperationException();
    }
}
