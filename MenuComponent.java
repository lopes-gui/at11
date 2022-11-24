/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at11;

/**
 *
 * @author guilh
 */
public abstract class MenuComponent {
    public void add (MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    
    public void remove (MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent  getChild (int i){
        throw new UnsupportedOperationException();
    }
    
    public String  getName ( ){
        throw new UnsupportedOperationException();
    }
    
    public String  getDescription ( ){
        throw new UnsupportedOperationException();
    }
    
     public double  getPrice ( ){
        throw new UnsupportedOperationException();
    }
      public boolean  isVegetarian ( ){
        throw new UnsupportedOperationException();
    }
       public void  Print ( ){
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object crateIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Iterator createIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
