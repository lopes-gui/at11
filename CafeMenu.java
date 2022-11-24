
import at11.Iterator;
import at11.Menu;
import java.util.Hashtable;

public class CafeMenu implements Menu { 
    Hashtable menuItems = new Hashtable(); 
public CafeMenu() { //cOdigo do construtor aqui 
} 


public void addItem(String name, String description, boolean Vegetarian, double price) 
{
    MenuItem menuItem = new MenuItem(name, description, Vegetarian, price);
        Object menultem = null;
    menuItems.put(menuItem.getName(), menultem); 
} 
public Iterator createIterator(){
    return (Iterator) menuItems.values().iterator();
}
}