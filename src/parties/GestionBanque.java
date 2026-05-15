package parties;

import java.util.LinkedList;

public class GestionBanque {

    public static void main(String[] args) {

        LinkedList<Client> file = new LinkedList<>();
        file.add(new Client(1, "Amal"));
        file.add(new Client(2, "Douaa"));
        file.add(new Client(3, "Omar"));
        System.out.println("File d'attente :");
        for (Client c : file) {
            System.out.println(c);
        }
        Client premier = file.removeFirst();
        System.out.println("Client servi est :");
        System.out.println(premier);
        file.addLast(new Client(4, "Hiba"));
        System.out.println("Client en tête est :");
        System.out.println(file.getFirst());
    }
}