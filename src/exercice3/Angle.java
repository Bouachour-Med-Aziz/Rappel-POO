package exercice3;

public class Angle {
      int mesure = 0;
      
      public Angle(int m) {
    	  mesure = m;
      }
      
      public boolean check(int m) {
    	  if (m > 360 || m < 0) {
    		  System.out.println("Il faut s'assurer que la mesure de l'angle reste dans l'intervalle [0..360]");
    		  return false;
    	  }
    	  else {
    		  return true;
    	  }
      }
      public void addition(int aux) {
    	  if (check(aux+mesure)) {
    		  mesure += aux;
    	  }
      }
      
      public void soustraction(int aux) {
    	  if (check(aux+mesure)) {
    		  mesure -= aux;
    	  }
      }
      
      public void multiplication(int aux) {
    	  if (check(aux+mesure)) {
    		  mesure *= aux;
    	  }
      }
      
      public double conversion_rad() {
    	  return Math.toRadians(mesure);
      }
      
      public double tan() {
    	  return  Math.tan(mesure);
      }
      
      public double cos() {
    	  return  Math.cos(mesure);
      }
      
      public double sin() {
    	  return  Math.sin(mesure);
      }
}
