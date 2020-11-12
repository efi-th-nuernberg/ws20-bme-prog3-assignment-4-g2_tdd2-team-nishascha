import java.util.Scanner;

public class TriangleChecker {
  
  public enum TriangleType {
    NONE, 
    NORMAL,
    ISOSCELES,  // Gleichschenklig
    EQUILATERAL // Gleichseitig
  }


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Geben Sie die Seitenlängen ein.");
    float a = enterFloat(s, "a: ");
    float b = enterFloat(s, "b: ");
    float c = enterFloat(s, "c: ");
    s.close();
    printAnalysis(a, b, c);
  }

  // Eingabe einer Seitenlänge
  private static float enterFloat(Scanner s, String prompt) {
    System.out.print(prompt);
    return s.nextFloat();
  }

  // Ausgabe der ermittelten Dreiecksart
  private static void printAnalysis(float a, float b, float c) {
    TriangleType type = checkTriangle(a, b, c);
    switch (type) {
      case NONE:
        System.out.println("Kein Dreieck");
        break;        
      case NORMAL:
        System.out.println("Dreieck");
        break;        
      case ISOSCELES:
        System.out.println("Gleichschenkliges Dreieck");
        break;        
      case EQUILATERAL:
        System.out.println("Gleichseitiges Dreieck");
        break;        
    }
  }

  // Analyse der Dreiecksart
 

public static TriangleType checkTriangle(float a, float b, float c) {

  boolean basicTri = ((a+b>c) && (a+c>b) && (b+c>a)) && (a>0 && b>0 && c>0);
	boolean equiLateral = (a == b) && (b == c);
	boolean	isosceles = (a == b) || (b==c) || (a==c);


    if(equiLateral && basicTri)
    {
      return TriangleType.EQUILATERAL;
    }
	  else if (basicTri && isosceles)
	  {
		  return TriangleType.ISOSCELES;
	  }
	  else if(basicTri)
	  {
		  return TriangleType.NORMAL;
	  }
    return TriangleType.NONE;
  }
}