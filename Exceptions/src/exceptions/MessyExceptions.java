package exceptions;

import java.io.*;

public class MessyExceptions {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            in = new FileInputStream(
                    new File("Exceptions/src/exceptions/MessyExceptions.java"));
            int contents = in.read();
            // Process contents
        } catch(IOException e) {
            // Handle errors
        } finally {
            if(in != null) {
                try {
                    in.close();//因为close也可能抛出异常，所以也应在try里面
                } catch(IOException e) {
                    // Handle the close() error
                }
            }
        }
    }
}