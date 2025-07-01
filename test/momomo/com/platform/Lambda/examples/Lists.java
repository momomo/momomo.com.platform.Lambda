package momomo.com.platform.Lambda.examples;

import m.Lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joseph S.
 *
 * Intentionally package private
 */
class Lists {
    private Lists(){}
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); list.add("Peter"); list.add("Anders"); list.add("Sven"); list.add("Hanna"); 
    
        // We ignore the use of the index passing only a V1
        each(list, name -> {
            System.out.println("We have " + name + " and not using an index!" );
        });
    
        // Iterate list and output index and name, passing a V2E
        each(list, (name, index) -> {
            System.out.println("At index: " + index + " we have " + name);
        });
    
        // Find Anders, print and abort, passing an R2E
        each(list, (name, index) -> {
            System.out.println("At index: " + index + " we have " + name);
            
            if ( name.equals("Anders") ) {
                System.out.println("Found " + name + "! Aborting further iteration!" );
                
                return false;
            }
            return true;
        });
    }
    
    /////////////////////////////////////////////////////////////////////
    
    /**
     * If we we want to iterate all, yet not use the index nor interested in returning anything.
     */
    public static <E extends Exception> void each(List<String> list, Lambda.V1E<String, E> lambda) throws E {
        each(list, lambda.R2E()); // We use the conversion method to delegate to base eachLine
    }
    
    /**
     * If we we want to iterate all, a return value should not required
     */
    public static <E extends Exception> void each(List<String> list, Lambda.V2E<String, Integer, E> lambda) throws E {
        each(list, lambda.R2E()); // We use the conversion method to delegate to base eachLine
    }
    
    /**
     * @param lambda Return false to abort iteration
     */
    public static <E extends Exception> void each(List<String> list, Lambda.R2E<Boolean, String, Integer, E> lambda) throws E {
        int i = -1; while ( ++i < list.size() ) {
            if ( Boolean.FALSE.equals(lambda.call(list.get(i), i)) ) {
                return; // Abort
            }
        }
    }
    
    /////////////////////////////////////////////////////////////////////
}



