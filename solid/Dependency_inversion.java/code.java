// Mouse interface
interface Mouse {
    void click();
    void scroll();
}

// Concrete WiredMouse class implementing Mouse
class WiredMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Wired mouse click.");
    }

    @Override
    public void scroll() {
        System.out.println("Wired mouse scroll.");
    }
}

// Concrete BluetoothMouse class implementing Mouse
class BluetoothMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Bluetooth mouse click.");
    }

    @Override
    public void scroll() {
        System.out.println("Bluetooth mouse scroll.");
    }
}

// Keyboard interface
interface Keyboard {
    void type();
    void backspace();
}

// Concrete WiredKeyboard class implementing Keyboard
class WiredKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Wired keyboard typing.");
    }

    @Override
    public void backspace() {
        System.out.println("Wired keyboard backspace.");
    }
}

// Concrete BluetoothKeyboard class implementing Keyboard
class BluetoothKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Bluetooth keyboard typing.");
    }

    @Override
    public void backspace() {
        System.out.println("Bluetooth keyboard backspace.");
    }
}

// MacBook class that depends on abstractions (interfaces)
class MacBook {
    private Mouse mouse;
    public Keyboard keyboard;

    // Constructor accepting interfaces instead of specific implementations
    public MacBook(Mouse mouse, Keyboard keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public void useMouse() {
        mouse.click();
        mouse.scroll();
    }

    public void useKeyboard() {
        keyboard.type();
        keyboard.backspace();
    }
}

// Main class for testing
public class Main {
    public static void main(String[] args) {
        // Use wired mouse and keyboard
        Mouse wiredMouse = new WiredMouse();
        Keyboard wiredKeyboard = new WiredKeyboard();
        MacBook macBookWithWired = new MacBook(wiredMouse, wiredKeyboard);

        System.out.println("Using MacBook with wired peripherals:");
        macBookWithWired.useMouse();
        macBookWithWired.keyboard.type();

        // Use Bluetooth mouse and keyboard
        Mouse bluetoothMouse = new BluetoothMouse();
        Keyboard bluetoothKeyboard = new BluetoothKeyboard();
        MacBook macBookWithBluetooth = new MacBook(bluetoothMouse, bluetoothKeyboard);

        System.out.println("\nUsing MacBook with Bluetooth peripherals:");
        macBookWithBluetooth.useMouse();
        macBookWithBluetooth.useKeyboard();
    }
}
