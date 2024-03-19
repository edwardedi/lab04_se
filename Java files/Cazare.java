import java.util.Vector;
import java.util.*;

public abstract class Cazare {

  private String nume;

  private List camereDisponibile;

    /**
   * 
   * @element-type Camera
   */
  public Vector  myCamera;

  public boolean rezervareCamera(int idCamera) {
  return false;
  }

}