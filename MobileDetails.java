import java.util.*;
class MobileDetails{

            private String Mbile_Name;
            private String Mobile_brand;
            private int Mobile_Price;

           
        // Contstrutore   
        // public MobileDetails(String Mbile_Name,String Mobile_brand,int Mobile_Price)
        // {
           
        //    this.Mbile_Name=Mbile_Name;
        //    this.Mobile_brand=Mobile_brand;
        //    this.Mobile_Price=Mobile_Price;
            
        // }
        
        // Getter 
        public String getMobileName()
        {
                
                return Mbile_Name;

        }

        public int getMobilePrice()
        {

              return Mobile_Price;

        }

        public String getMobileBrand()
        {
 
                return Mobile_brand;

        }

        // setters
        public void  setMobileName(String mobileName)
        {

            this.Mbile_Name=mobileName;

        }

        public void  setMobileBrand(String mobileBrand)
        {

            this.Mobile_brand=mobileBrand;

        }

        public void  setmobilePrice(int mobilePrice)
        {

                this.Mobile_Price=mobilePrice;

        }

        // Show All Student Record
        public void showMobileInfo()
        {

                System.out.println();

                System.out.println("Mobile Name  :  "+getMobileName());
                System.out.println("Mobile Brand :  "+getMobileBrand());
                System.out.println("Mobile price :  "+getMobilePrice());

                System.out.println();


        }




}