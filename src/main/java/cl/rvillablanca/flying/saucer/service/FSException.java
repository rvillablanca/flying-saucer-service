package cl.rvillablanca.flying.saucer.service;

/**
 * Thrown in case of any error when creating pdf from html
 *
 * @author Rodrigo Villablanca
 */
public class FSException extends Exception {

    public FSException(String message) {
        super(message);
    }

    public FSException(Throwable cause) {
        super(cause);
    }

}
