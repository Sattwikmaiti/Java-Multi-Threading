package solid.open_closed_principle;

public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker,int quantity)
    {
        this.marker=marker;
        this.quantity=quantity;
    }


    public void price()
    {
        System.out.println("Price is"+ (marker.price*quantity));
    }

    // public void SaveToDB()
    // {
    //     System.out.println("Save to Db");
    // }

      
    // public void printInvoice()
    // {
    //     System.out.println("printInvoice");
    // }

      
      

    
}


