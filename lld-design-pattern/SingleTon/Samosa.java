package SingleTon;


public class Samosa {

    private volatile static Samosa samosa;

    private Samosa() {
        // private constructor
    }

    public static Samosa getSamosa() {
        //this is is optimization method
        if (samosa == null) {
            //double checking
            synchronized (Samosa.class) {
                if (samosa == null)
                    samosa = new Samosa();
            }
        }
        return samosa;
    }

}