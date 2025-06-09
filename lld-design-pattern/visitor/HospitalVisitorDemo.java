package visitor;

public class HospitalVisitorDemo {
    public static void main(String[] args) {
        // Create an array of patients
        patient[] patients = {
                new ChildPatient(), new AdultPatient(), new SeniorPatient()};
        // Create visitors for different operations
        Visitor diagnosisVisitor = new DiagnosisVisitor();
        Visitor billingVisitor = new BillingVisitor();
        // Each patient accepts the visitors to perform the operations
        for (patient patient : patients) {
            patient.accept(diagnosisVisitor);
            patient.accept(billingVisitor);
        }
    }
}