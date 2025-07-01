package momomo.com.platform.Lambda.examples;

import m.Lambda;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Joseph S.
 *
 * Intentionally package private
 *
 * Parts taken from momomo.com.platform.IO package
 */
class IO { private IO(){}
    
    public static void main(String[] args) throws IOException {
        File file = new File("/path/to/some/file.txt");
    
        eachLine(file, line -> {
            System.out.println("Line in file " + line);
        });
    
        eachLine(file, (line, index) -> {
            System.out.println("Line in file " + line + " at index " + index);
        });
    
        eachLine(file, (line, index) -> {
            System.out.println("Line in file " + line + " at index " + index);
        
            if ( line.equals("someline") ) {
                System.out.println("Found " + line + "! Aborting further iteration!" );
            
                return false;
            }
        
            return true;
        });
    }
    
    /////////////////////////////////////////////////////////////////////
    // File
    /////////////////////////////////////////////////////////////////////
                                                                            
    /**
     * @param lambda passes line only, iterates all
     */
    public static <E extends Exception> void eachLine(File file, Lambda.V1E<String, E> lambda) throws IOException, E {
        eachLine(file, lambda.R2E());
    }
    /**
     * @param lambda passes line and line index, iterates all
     */
    public static <E extends Exception> void eachLine(File file, Lambda.V2E<String, Integer, E> lambda) throws IOException, E {
        eachLine(file, lambda.R2E());
    }
    
    /**
     * @param lambda passes line only, return false to abort iteration anytime
     */
    public static <E extends Exception> void eachLine(File file, Lambda.R1E<Boolean, String, E> lambda) throws IOException, E {
        eachLine(file, lambda.R2E());
    }
    
    /**
     * @param lambda passes line and line index, return false to abort iteration anytime
     */
    public static <E extends Exception> void eachLine(File file, Lambda.R2E<Boolean, String, Integer, E> lambda) throws IOException, E {
        eachLine(toURL(file), lambda);
    }
    
    /////////////////////////////////////////////////////////////////////
    // URL
    /////////////////////////////////////////////////////////////////////
    
    /**
     * @param lambda passes line only, return false to abort iteration anytime
     */
    public static <E extends Exception> void eachLine(URL url, Lambda.R1E<Boolean, String, E> lambda) throws IOException, E {
        eachLine(url, lambda.R2E());
    }
    
    /**
     * @param lambda passes line and line index, return false to abort iteration anytime
     */
    public static <E extends Exception> void eachLine(URL url, Lambda.R2E<Boolean, String, Integer, E> lambda) throws IOException, E {
        try ( InputStream is = openConnection(url).getInputStream() ) {
            eachLine(is, lambda);
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    // InputStream
    /////////////////////////////////////////////////////////////////////
    
    /**
     * @param lambda passes line only, iterates all
     */
    public static <E extends Exception> void eachLine(InputStream inputStream, Lambda.V1E<String, E> lambda) throws IOException, E {
        eachLine(inputStream, lambda.R1E());
    }
    
    /**
     * @param lambda passes line and line index, iterates all
     */
    public static <E extends Exception> void eachLine(InputStream inputStream, Lambda.V2E<String, Integer, E> lambda) throws IOException, E {
        eachLine(inputStream, lambda.R2E());
    }
    
    /**
     * @param lambda passes line only, return false to abort iteration anytime
     */
    public static <E extends Exception> void eachLine(InputStream inputStream, Lambda.R1E<Boolean, String, E> lambda) throws IOException, E {
        eachLine(inputStream, lambda.R2E());
    }
    /**
     * @param lambda passes line and line index, return false to abort iteration anytime
     */
    public static <E extends Exception> void eachLine(InputStream inputStream, Lambda.R2E<Boolean, String, Integer, E> lambda) throws IOException, E {
        try (InputStreamReader isr = new InputStreamReader(inputStream); BufferedReader bfr = new BufferedReader(isr, 8192) ) {
            int i = 0; String line; while ( (line = bfr.readLine()) != null ) {
                if ( Boolean.FALSE.equals(lambda.call(line, i++)) ) return;
            }
        }
    }
    
    /////////////////////////////////////////////////////////////////////
    // Below supports the methods above and not part of the example
    /////////////////////////////////////////////////////////////////////
    
    private static URLConnection openConnection(URL url) throws IOException {
        return openConnection(url, null);
    }
    private static URLConnection openConnection(URL url, Boolean caching) throws IOException {
        URLConnection connection = url.openConnection();
        if ( caching != null ) {
            connection.setUseCaches(caching);
        }
        return connection;
    }
    
    private static URL toURL(File dir) {
        return toURL(toURI(dir));
    }
    private static URL toURL(URI uri) {
        try {
            return uri.toURL();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    private static URI toURI(File file) {
        return file.toURI();
    }
    
    /////////////////////////////////////////////////////////////////////
}




