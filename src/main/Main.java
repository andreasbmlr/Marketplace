//Andreas Beimler

package main;

import main.de.uni_hannover.task2.Marketplace;
import main.de.uni_hannover.task2.auth.User;
import main.de.uni_hannover.task2.offerings.Item;

public class Main {
    public static void main(String[] args) {
        
        //Initialize user 1 and offerings
        User user1 = new User("Julia", "123test");
        user1.addItem(new Item("Auto", 10000.00f, user1, "Gebrauchter Golf"));
        user1.addItem(new Item("Hosen", 150.00f, user1, "Designer Hosen"));

        //Initialize user 2 and offerings
        User user2 = new User("Andreas", "846912008");
        user2.addItem(new Item("PC", 1337.00f, user2, "Pc mit GT 730 und Intel Pentium Chip (Perfekt für Gamer geeignet)"));
        user2.addItem(new Item("Maus", 5.00f, user2, "Computermaus ohne Gebrauchsspuren"));

        //Add user 1 and user 2 to the marketplace
        Marketplace marketplace = new Marketplace();
        marketplace.addUser(user1);
        marketplace.addUser(user2);

        //Prints the current marketplace
        System.out.println("Marktplatz:");
        System.out.println(marketplace.str());

        //User 1 changes the price of item 1
        user1.getItems()[0].setPrice(1.00f);

        //User 2 gets removed from the marketplace
        marketplace.removeUser(user2);

        //Prints the changed marketplace
        System.out.println("Marktplatz:");
        System.out.println(marketplace.str());
    }
}
