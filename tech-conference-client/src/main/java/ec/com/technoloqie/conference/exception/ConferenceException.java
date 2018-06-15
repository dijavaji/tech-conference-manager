package ec.com.technoloqie.conference.exception;

/**
 * Clase para el tratamiento de los errores que pueden ocurrir en la ejecucion del codigo
 * @author root
 *
 */
@SuppressWarnings("serial")
public class ConferenceException extends RuntimeException{
	
	public ConferenceException() {
        super();
    }
    
	public ConferenceException(String msg, Throwable nested) {
        super(msg, nested);
    }
    
	public ConferenceException(String message) {
        super(message);
    }
    
	public ConferenceException(Throwable nested) {
        super(nested);
    }

}
