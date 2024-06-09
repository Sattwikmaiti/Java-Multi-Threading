package solid.single_responsibility_principle;

public class InvoiceSave {
    
    Invoice invoice;

    public InvoiceSave(Invoice invoice)
    {
       this.invoice=invoice;
    }
    
        
 public void SaveToDB()
    {
        System.out.println("Save to Db");
    }

}
