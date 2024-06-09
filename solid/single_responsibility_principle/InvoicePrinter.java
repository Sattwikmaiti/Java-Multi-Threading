package solid.single_responsibility_principle;


public class InvoicePrinter
{
     Invoice invoice;

     public InvoicePrinter(Invoice invoice)
     {
        this.invoice=invoice;
     }
     
         
    public void printInvoice()
    {
        System.out.println("printInvoice");
    }

     
      
}