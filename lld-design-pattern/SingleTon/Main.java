package SingleTon;


public class Main {

    public static void main(String[] args) {
        Samosa s1 = Samosa.getSamosa();
        Samosa s2 = Samosa.getSamosa();
        Samosa s3 = Samosa.getSamosa();
        System.out.println("s1 =>"+s1);
        System.out.println("s2 =>"+s2);
        System.out.println("s3 =>"+s3);
        // s1.hashCode();
        /*
         * s1 =>SingleTonDesignPattern.Samosa@7ad041f3
s2 =>SingleTonDesignPattern.Samosa@7ad041f3
s3 =>SingleTonDesignPattern.Samosa@7ad041f3

hashCode is same
         * 
         */


         System.out.println(Jalebi.getJalebi());
         System.out.println(Jalebi.getJalebi());
         // SingleTonDesignPattern.Jalebi@6b95977
//SingleTonDesignPattern.Jalebi@6b95977
         // hashCode is same

    }
    
}