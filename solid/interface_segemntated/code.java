// Base interface for common restaurant methods
interface BaseRestaurant {
    void serveWater(); // Common method shared by all restaurant staff
}

// Chef-specific interface
interface ChefInterface extends BaseRestaurant {
    void cookFood();
    void manageKitchen();
}

// Waiter-specific interface
interface WaiterInterface extends BaseRestaurant {
    void serveFood();
    void takeOrders();
}

// Chef class implementing ChefInterface
class Chef implements ChefInterface {
    @Override
    public void serveWater() {
        System.out.println("Chef serves water when needed.");
    }

    @Override
    public void cookFood() {
        System.out.println("Chef is cooking food.");
    }

    @Override
    public void manageKitchen() {
        System.out.println("Chef is managing the kitchen.");
    }
}

// Waiter class implementing WaiterInterface
class Waiter implements WaiterInterface {
    @Override
    public void serveWater() {
        System.out.println("Waiter serves water to customers.");
    }

    @Override
    public void serveFood() {
        System.out.println("Waiter serves food to customers.");
    }

    @Override
    public void takeOrders() {
        System.out.println("Waiter takes orders from customers.");
    }
}

// Main class for testing
public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        // Testing common method
        chef.serveWater();
        waiter.serveWater();

        // Testing role-specific methods
        chef.cookFood();
        chef.manageKitchen();

        waiter.serveFood();
        waiter.takeOrders();
    }
}
