class Marker {
    private String name;
    private double price;

    public Marker(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Invoice {
    private Marker marker;
    private double totalPrice;

    public Invoice(Marker marker) {
        this.marker = marker;
        this.totalPrice = calculatePrice();
    }

    private double calculatePrice() {
        // Price calculation logic, e.g., applying discounts, taxes, etc.
        return marker.getPrice() * 0.9; // Simplified for this example.
    }

    public Marker getMarker() {
        return marker;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

class InvoicePersistence {
    public void saveToDb(Invoice invoice) {
        System.out.println("Saving the invoice with marker: " + invoice.getMarker().getName() + " to the database");
        // Database saving logic here.
    }
}

class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Printing invoice for marker: " + invoice.getMarker().getName() + " with total price: " + invoice.getTotalPrice());
        // Printing logic here.
    }
}

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("Red Marker", 50.0);
        Invoice invoice = new Invoice(marker);

        InvoicePersistence persistence = new InvoicePersistence();
        persistence.saveToDb(invoice);

        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice);

        System.out.println("Total Price: " + invoice.getTotalPrice());
    }
}
