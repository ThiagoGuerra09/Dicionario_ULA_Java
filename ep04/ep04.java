import java.io.*;
import java.util.Scanner;

class ep04 {

  public static boolean isFim(String s) {
    return (
      s.length() == 4 &&
      s.charAt(0) == 'f' &&
      s.charAt(1) == 'i' &&
      s.charAt(2) == 'm' &&
      s.charAt(3) == '.'
    );
  }

  // interpreta o valor hexadecimal com base no mnemônico atribuido a W.
  public static char converterMnemonico(String w) {
    //   System.out.println(w + "< - w pra funcao");
    if (w.equals("An;")) {
      return '0';
    }
    if (w.equals("nAoB;")) {
      return '1';
    }
    if (w.equals("AnB;")) {
      return '2';
    }
    if (w.equals("zeroL;")) {
      return '3';
    }
    if (w.equals("nAeB;")) {
      return '4';
    }
    if (w.equals("Bn;")) {
      return '5';
    }
    if (w.equals("Axb;")) {
      return '6';
    }
    if (w.equals("ABn;")) {
      return '7';
    }
    if (w.equals("AnoB;")) {
      return '8';
    }
    if (w.equals("nAxB;")) {
      return '9';
    }
    if (w.equals("copiaB;")) {
      return 'A';
    }
    if (w.equals("AB;")) {
      return 'B';
    }
    if (w.equals("umL;")) {
      return 'C';
    }
    if (w.equals("AoBn;")) {
      return 'D';
    }
    if (w.equals("AoB;")) {
      return 'E';
    }
    if (w.equals("copiaA;")) {
      return 'F';
    }
    // System.out.println(w);
    return 'x';
  }

  public static void main(String[] args) throws FileNotFoundException {
    char x = 'o';
    char y = 'i';
    String w = "";
    String output = "";
    String line = "";
    // entradas etc

    Scanner in = new Scanner(
      new FileReader("C:/Users/DELL/javacurso/sempassado/ep04/testeula.ula")
    );

    do {
      line = in.nextLine();
      if (isFim(line) == true) {
        break;
      } else {
        //armazenar o valor de x
        if (line.startsWith("X=")) {
          x = line.charAt(2);
        //   output += x;
          // System.out.println(x + " < - esse é o x");
        }
        //armazenar o valor y
        if (line.startsWith("Y=")) {
          y = line.charAt(2);
          //output += y;
          //  System.out.println(y + " < - esse é o y");
        }
        //armazenar o valor w
        if (line.startsWith("W=")) {
          for (int i = 2; i < line.length(); i++) {
            w += line.charAt(i);
          }
          //   System.out.println(w + " < - esse é o w");
          output += x;
          output += y;
          output += converterMnemonico(w);
          output += "\n";
          w = "";
        }
      }
    } while (isFim(line) == false);

    System.out.println(output);
    in.close();
  }
}
