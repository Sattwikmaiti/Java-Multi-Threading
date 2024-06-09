package solid.open_closed_principle;

public class SaveToDb implements InterfaceInvoice {
    @Override 
    public void save(Invoice invoice)
      {
        System.out.println("SaveToDb");
      }
    
}
