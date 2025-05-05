import java.util.*;
import java.util.Scanner;


class Main{

            
       public static void main(String arg[])
       {

           
           
            MobileService Mobile_Service_object=new MobileService();

            MobileApp MobileApp_object=new MobileApp();


        


          while(true)
          {

             System.out.println();

             System.out.println("==========WELCOME TO SHERZAD MOBILE STORE==========");
           
             System.out.println();

             MobileApp_object.Menue();

             Scanner scanner=new Scanner(System.in);

             System.out.println();     

             System.out.println("Enter Your Choice By Typeing Number");

             int choice_meneu=scanner.nextInt();

          switch(choice_meneu)
          {

                    case 1->Mobile_Service_object.addMobile();
                     
                    case 2->Mobile_Service_object.showAllRecord();

                    case 3->Mobile_Service_object.Search_Mobile();

                  

                    case 4->System.exit(0);
                       

                    default->System.out.println("something went wrong");      




          }
          }


        











         
       }







}