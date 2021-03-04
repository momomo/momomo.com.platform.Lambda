package momomo.com.platform.Lambda.examples;

import momomo.com.platform.Lambda.Lambda;

import java.util.ArrayList;
import java.util.List;

class Examples {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Peter");
        list.add("Anders");
        list.add("Sven");
        list.add("Hanna");
        list.add("Anna");
    
        // Iterate list and output index and name
        each(list, (name, index) -> {
            System.out.println("At index: " + index + " we have " + name);
        });
    
        // Find Anders, print and abort
        each(list, (name, index) -> {
            System.out.println("At index: " + index + " we have " + name);
            
            if ( name.equals("Anders") ) {
                System.out.println("Found " + name + "!" );
                
                return false;
            }
            
            return true;
        });
        
        each(list, name -> {
            System.out.println("We have " + name + " and not using an index!" );
        });
    }
    
    
    public static <E extends Exception> void each(List<String> list, Lambda.R2E<Boolean, String, Integer, E> lambda) throws E {
        int i = -1; while ( ++i < list.size() ) {
            Boolean returns = lambda.call(list.get(i), i);
            
            if ( Boolean.FALSE.equals(returns) ) {
                return; // Abort
            }
        }
    }
    
    /**
     * If we we want to iterate all, a return value should not required
     */
    public static <E extends Exception> void each(List<String> list, Lambda.V2E<String, Integer, E> lambda) throws E {
        each(list, lambda.R2E()); // We use the conversion method to delegate to base eachLine
    }
    
    /**
     * If we we want to iterate all, yet not use the index nor interested in returning anything.  
     */
    public static <E extends Exception> void each(List<String> list, Lambda.V1E<String, E> lambda) throws E {
        each(list, lambda.R2E()); // We use the conversion method to delegate to base eachLine
    }
    
}
