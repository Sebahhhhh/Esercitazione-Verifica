import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);

        boolean fine = true;
        String[] nomi = new String[0];

        while (true) {
            System.out.println("------------------------");
            System.out.println("           MENU  ");
            System.out.println("------------------------");

            System.out.println("1 - Aggiungi un nome");
            System.out.println("2 - Cancella un nome singolo");
            System.out.println("3 - Cerca un nome in modo sequenziale");
            System.out.println("4 - Visualizza i nomi ripetuti con il numero delle ripetizioni");
            System.out.println("5 - Modifica un nome");
            System.out.println("6 - Mostra tutti i nomi presenti");
            System.out.println("7 - Trova il nome più lungo e più corto");
            System.out.println("8 - Cancella tutte le occorrenze di un nome");
            System.out.println("0 - Esci");
            System.out.println(" ");
            System.out.println("Scegli un'opzione: ");
            int scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    aggiungiNome(nomi);
                    System.out.println("Nome aggiunto");
                    break;

                case 2:
                    cancellaNomeSingolo(nomi);
                    break;

                case 3:
                    ricercaSequenzialeNome(nomi);
                    break;

                case 4:
                    visualizzaNomiRipetuti(nomi);
                    break;

                case 5:
                    modificaNome(nomi);
                    break;

                case 6:
                    visualizzaNomi(nomi);
                    break;

                case 7:
                    trovaNomiEstremi(nomi);
                    break;

                case 8:
                    cancellaTutteOccorrenzeNome(nomi);
                    break;

                case 0:
                    fine = false;
                    break;

                default:
                    System.out.println("----------------------------------");
                    System.out.println("           ! ERRORE !");
                    System.out.println("        Scelta non valida....");
                    System.out.println("----------------------------------");
                
            }
        }
    }

    private static void aggiungiNome(String[] nomi) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci il nome da aggiungere: ");
        String nome = in.nextLine();
        nomi = aggiungiElementoArray(nomi, nome);
    }

    private static String[] aggiungiElementoArray(String[] array, String elemento) {
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = elemento;
        return newArray;
    }

    private static void cancellaNomeSingolo(String[] nomi) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci il nome da cancellare: ");
        String nomeDaCancellare = in.nextLine();
        nomi = rimuoviElementoArray(nomi, nomeDaCancellare);
    }

    private static String[] rimuoviElementoArray(String[] array, String elemento) {
        int indexElemento = indexOf(array, elemento);
        if (indexElemento == -1) {
            return array;
        }
        String[] newArray = new String[array.length - 1];
        for (int i = 0; i < indexElemento; i++) {
            newArray[i] = array[i];
        }
        for (int i = indexElemento + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        return newArray;
    }

    private static int indexOf(String[] array, String elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    private static void ricercaSequenzialeNome(String[] nomi) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci il nome da cercare: ");
        String nomeDaCercare = in.nextLine();
        boolean trovato = false;
        for (String nome : nomi) {
            if (nome.equals(nomeDaCercare)) {
                System.out.println("Il nome è presente nell'array");
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Il nome non è presente nell'array");
        }
    }

    private static void visualizzaNomiRipetuti(String[] nomi) {
    }
    
  
