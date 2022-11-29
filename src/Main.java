import java.io.FileNotFoundException;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void wpisanie() throws IOException {
        FileWriter file = new FileWriter("Slowka.txt", true);
        BufferedWriter out = new BufferedWriter(file);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Słowo po polsku: ");
        String polski = scanner.nextLine();
        System.out.print("Słowo po angielsku: ");
        String angielski = scanner.nextLine();
        out.write(angielski + " - " + polski + '\n');
        out.close();
    }

    public static void wypisanie(){
        String polski, angielski;
        String wiersz_tekstu = null;
        String[] separator;
        File plik = new File("Slowka.txt");

        try (BufferedReader breader = new BufferedReader(new FileReader(plik))) {
            while( (wiersz_tekstu = breader.readLine() ) != null )
            {
                separator = wiersz_tekstu.split(" - ");
                angielski = separator[0];
                polski = separator[1];

                System.out.println(angielski + " - " + polski);
                Thread.sleep(10);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void losoweSlowko(){
        Random random = new Random();
        int howManyLines = 0;
        int randomLine = 0, licznik = 0;
        String polski = "", angielski = "";
        String wiersz_tekstu = null;
        String[] separator;
        File plik = new File("Slowka.txt");

        try (BufferedReader breader = new BufferedReader(new FileReader(plik))) {
            while( breader.readLine() != null )
            {
                howManyLines++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        randomLine = random.nextInt(howManyLines)+1;
        System.out.println(randomLine);

        try (BufferedReader breader = new BufferedReader(new FileReader(plik))) {
            while( (wiersz_tekstu = breader.readLine() ) != null  && licznik != randomLine)
            {
                separator = wiersz_tekstu.split(" - ");
                angielski = separator[0];
                polski = separator[1];

                Thread.sleep(10);
                licznik++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(angielski + " - " + polski);
    }


    public static void losoweSlowkoPol(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int howManyLines = 0;
        int randomLine = 0, licznik = 0;
        String polski = "", angielski = "";
        String wiersz_tekstu = null;
        String[] separator;
        File plik = new File("Slowka.txt");

        try (BufferedReader breader = new BufferedReader(new FileReader(plik))) {
            while( breader.readLine() != null )
            {
                howManyLines++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        randomLine = random.nextInt(howManyLines)+1;

        try (BufferedReader breader = new BufferedReader(new FileReader(plik))) {
            while( (wiersz_tekstu = breader.readLine() ) != null  && licznik != randomLine)
            {
                separator = wiersz_tekstu.split(" - ");
                angielski = separator[0];
                polski = separator[1];

                Thread.sleep(10);
                licznik++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(polski);
        String odpowiedz = "";
        odpowiedz = scanner.nextLine();
        if(angielski.equals(odpowiedz)){
            System.out.println("Dobrze!");
        }
        else{
            System.out.println("Źle, poprawna odpowiedź: " + angielski);
        }

    }


    public static void losoweSlowkoAng(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int howManyLines = 0;
        int randomLine = 0, licznik = 0;
        String polski = "", angielski = "";
        String wiersz_tekstu = null;
        String[] separator;
        File plik = new File("Slowka.txt");

        try (BufferedReader breader = new BufferedReader(new FileReader(plik))) {
            while( breader.readLine() != null )
            {
                howManyLines++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        randomLine = random.nextInt(howManyLines)+1;

        try (BufferedReader breader = new BufferedReader(new FileReader(plik))) {
            while( (wiersz_tekstu = breader.readLine() ) != null  && licznik != randomLine)
            {
                separator = wiersz_tekstu.split(" - ");
                angielski = separator[0];
                polski = separator[1];

                Thread.sleep(10);
                licznik++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(angielski);
        String odpowiedz = "";
        odpowiedz = scanner.nextLine();
        if(polski.equals(odpowiedz)){
            System.out.println("Dobrze!");
        }
        else{
            System.out.println("Źle, poprawna odpowiedź: " + polski);
        }

    }
    public static void main(String[] args) throws IOException {
        //wypisanie();
        //losoweSlowkoPol();
        losoweSlowkoAng();
    }
}