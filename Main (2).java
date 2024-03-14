import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomi = new String[0];

        while (true) {
            System.out.println("------------------------");
            System.out.println("           MENU  ");
            System.out.println("------------------------");
      
            System.out.println("1 - Aggiunta di un nome");
            System.out.println("2 - Cancellazione del singolo nome");
            System.out.println("3 - Ricerca sequenziale di un nome");
            System.out.println("4 - Esci");
            System.out.println(" ");  
            System.out.println("Scegli un'opzione: ");
            int scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome da aggiungere: ");
                    String nome = in.next();
                    System.out.println("Nome aggiunto");
                    break;
                
                case 2:
                    System.out.print("Inserisci il nome da cancellare: ");
                    String nomeDaCancellare = in.next();
                   
                   
                    break;
                case 3:
                    System.out.print("Inserisci il nome da cercare: ");
                    String nomeDaCercare = in.next();
                   
                    break;
                case 4:
                    
            }
        }
    }
}