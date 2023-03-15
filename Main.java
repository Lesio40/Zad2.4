import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1.Pole prostokąta 2.Pole trójkąta prostokątnego");
    int num = scanner.nextInt();
   switch(num){
     case 1:
       System.out.println("Podaj a: ");
       int a = scanner.nextInt();
       System.out.println("Podaj b: ");
       int b = scanner.nextInt();
       int wynik=(a*b);
       System.out.println("Pole prostokąta: " + wynik);
       break;
     case 2:
       System.out.println("Podaj a: ");
       int c = scanner.nextInt();
       System.out.println("Podaj h: ");
       int h = scanner.nextInt();
       int wynik2 = (c*h)/2;
       System.out.println("Pole trójkata prostokątnego to: " + wynik2);
       break;
   }
  }
}