package compiler;

import java.util.HashMap;
import java.util.Map;
  

public class SymbolTable {
 
    private static Map<String,Double> uniqueInstance;
 
    private SymbolTable() {
    }
 
    public static synchronized Map getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new HashMap<String,Double>();
        
        return uniqueInstance;
    }
}