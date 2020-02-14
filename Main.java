import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner Read = new Scanner(System.in);
    boolean Comp = false;
    System.out.println("Monita...");
    String Hola = "";
    String Mo = Read.next();
    if (Mo.equals("Monito")||Mo.equals("monito")){
      Comp = true;
      Hola = Main.Hola(Comp);
    } else {
      Comp = false;
      Hola = Main.Hola(Comp);
    }
    System.out.println(Hola);
  }
  public static String Hola(boolean Comp){
    String Hola = "";
    if (Comp == true){
     Hola = "Hola Morita, ya ha pasado muchisimo tiempo desde la ultima ves que hablamos por aqui...";
     Hola += " Quiero decirle que le amo muchisimo...";
     Hola += " y que estoy muy pero muy feliz de estar a su lado.";
     Hola += " Ahora... las cosas suenan dificiles.";
     Hola += " Tanto tu como yo... nos es dificil todo esto... yo lo se. ";
     Hola += "Hoy en este dia... solo quiero que sepas que tu realmente me has hecho sentir diferente en la vida...";
     Hola += " ¿Recuerdas los momentos? ";
     Hola += " Yo aun recuerdo esa maldita y preciosa sonrisa... puede haber significado algo... diferente pero... no puedo dejar de adorarla... esta clavada en mi mente como lo unico que deseo repetir en mi vida.";
     Hola += " Eres poderosa y yo se que en este momento no se encuentra del todo bien.";
    } else {
      Hola = "";
    }
    return Hola;
  }
}