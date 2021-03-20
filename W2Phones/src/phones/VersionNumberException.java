package phones;

/**
 * A custom Exception that will tell you information
 * about unsupported SmartPhone versions
 * @author Liz Dancy, 2021
 *
 */
public class VersionNumberException extends Exception {

 private static final long serialVersionUID = 1L;

 public VersionNumberException() 
 {
  // TODO Auto-generated constructor stub
 }

 public VersionNumberException(String arg0) 
 {
  super( "The following version number is unsupported at this time: " +arg0);
  
 }


}
