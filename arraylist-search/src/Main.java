import java.util.*;

class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {

    public static void main(String[] args) {
        Client c1 = new Client("Banana Corp.");
        Client c2 = new Client("Fundamental Strawberry");
        Client c3 = new Client("Pacific Avocado");

        // See https://www.callicoder.com/java-arraylist/
        ArrayList<Client> clients = new ArrayList<Client>();
        clients.add(c1);
        clients.add(c2);
        clients.add(c3);

        // See http://www2.hawaii.edu/~takebaya/ics111/simple_io/simple_io.html
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a client name:");
        String input = keyboard.nextLine();

        for (Client client : clients) {
            // TODO: make search case insensitive
            if (client.getName().contains(input)) {
                System.out.println("Client found: " + client.getName());
            }
        }
    }
}
