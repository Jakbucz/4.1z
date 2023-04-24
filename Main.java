/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner imie = new Scanner(System.in);
      Scanner wiek = new Scanner(System.in);
      Scanner choice = new Scanner(System.in);
      System.out.println("1. DODAJ NOWEGO STUDENTA\n2. \n0. WYJŚCIE Z PROGRAMU");
      
      int wybor=choice.nextInt();
      
      switch(wybor){
        case 0:
          break;
        case 1:
          System.out.println("Podaj imie: ");
          String i=imie.nextLine();
          System.out.println("Podaj wiek: ");
          int w=wiek.nextInt();
          s.addStudent(new Student(i,w));
          break;
      }
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {

    }
  }
}
