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
public class Waitress {
   MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
   
   public void printMenu(){
       allMenus.print();
   }
   public void printVegetarianMenu() { 
Iterator iterator = allMenus.createIterator();
 System.out.println("\nVEGETARIAN MENU\n-----"); 
while (iterator.hasNext()) { 
MenuComponent menuComponent = 
(MenuComponent)iterator.next();
} try{
if (allMenus.isVegetarian()) { 
    allMenus.print();
} 
}  catch (UnsupportedOperationException e) {} 
} 
}
