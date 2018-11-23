
package DAO;

import java.util.ArrayList;

public abstract class Dao { //interfaz DAO (verificar)
    public abstract void create(Object o);
    public abstract void delete(Object o);
    public abstract void update(Object o);
    public abstract Object get(String id);
    public abstract ArrayList<Object> getAll ();
    
    
}
