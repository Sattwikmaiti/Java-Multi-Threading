package solid.open_closed_principle;

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


    /*
     * public void SaveToFile()
     * {
     * Not Allowed here , as it modifies the already running InvoiceSave Class
     * }
     * 
     */
}
