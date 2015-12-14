package ch.hearc.ig.odi.moviemanager.exception;

/**
 *
 * @author Loïc Megert <loic.megert@he-arc.ch>
 */
public class UniqueException extends Exception {
    
    public UniqueException() {
        super();
    }

    /**
     * 
     * @param message
     */
    public UniqueException(String message) {
        super(message);
    }

    /**
     * 
     * @param message
     * @param cause
     */
    public UniqueException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
