package solid.open_closed_principle;

public class SaveToFile implements InterfaceInvoice {
    @Override 
    public void save(Invoice invoice)
      {
        System.out.println("SaveToFile");
      }
    
}
