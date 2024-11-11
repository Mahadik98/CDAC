package lib;

public class Inhouse extends Patient {
    public double discount;


    public Inhouse(int patientId,String patientName,int noOfDays,BedType bed,double discount){
          super(patientId,noOfDays,patientName,bed);
          

         this.discount = discount;

    }

    @Override
    public int GetAmount() {
        double amount = super.GetAmount();
        double discount = amount >= 5000 ? amount * 0.05 : 0;
        System.out.println("discount amoutnt:"+discount);
        
        return(int) (amount - discount);

    
    }

}