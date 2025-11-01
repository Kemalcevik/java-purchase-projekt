public class purchase {
    static void main() {
        // Preis eines Artikels (z.B. 19.99 Euro)
        double price = 19.99;

        // Anzahl der gekauften Artikel (z.B. 3 Stück)
        int quantity = 3;

        // Rabatt-Satz (z.B. 15% Rabatt → 0.15)
        double discountRate = 0.15;

        // Gesamtkosten berechnen: (price * quantity) - (price * quantity * discountRate)
        double totalCost = (price * quantity) - (price * quantity * discountRate);

        // Ausgabe der Gesamtkosten
        System.out.println("Gesamtkosten: " + totalCost + " Euro");
    }
}