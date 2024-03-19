import java.time.LocalDate;
import java.util.Vector;
import java.util.*;
public abstract class Oaspete extends Persoana {

  public int idCamera;

  public String numeCazare;

  public LocalDate dataCazare;

  public int numarNopti;

    /**
   * 
   * @element-type Camera
   */
  public Vector  myCamera;

  public void filtrareRezultate(int numarCamere, LocalDate dataRezervare, int numarNopti) {
  }

  public List vizualizareOferte() {
  return null;
  }

  public boolean rezervareCamera() {
  return false;
  }

  public List vizualizareRezervari() {
  return null;
  }

  public void oferireRating(int valoare) {
  }

  public List recomandariCazari() {
  return null;
  }

  public void vizitareVIrtuala() {
  }

}