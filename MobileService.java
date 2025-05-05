import java.util.*;



/*
chapter 2 : using a meanning full name for class,method and properties
class Name=> nonu
method Name=> verb 

chapter 10 :class

the sequuence of class 
  1: filed,propertise
  2:constractore
  3:public method 
  4: privatte method

  in this small project i dont use constutore and private method becue i dont need it 


*/

class MobileService{ 
              

        /* chapter 11: using depancy injection
          i make the object of MobileDetail Here 

        

        */

        private  MobileDetails[] mobiles;

        private  MobileDetails[] NewArray;

     


        MobileValidatore MobileValidatore_object=new MobileValidatore();

        Scanner scanner=new Scanner(System.in);

       
         public void setMobile(MobileDetails[] mobiles)
         {
                this.mobiles=mobiles;
         }


         public void setNewMobileArray(MobileDetails[] NewArray)
         {
                this.NewArray=NewArray;
         }


       /*
              chapter 3
              the function must be small and perfome only one task
              FUCTION SHOULD DO ONE THING,
              THEY SHOULD DO IT WILL
              THEY SHOULD DO IT ONLY
              we must write a code in oreder of stepdown

              chapter 6: The Law of Demeter => mean one function should perform 
              only the given task

       */

         public void addMobile()
         {

                    
                if(cheackArray())
                {

                     System.out.println();

                     System.out.println( MobileValidatore_object.Message());

                     System.out.println();


                }

               
                
                System.out.println("How Many Data You Want to Enter");
                
                int How_Many_Data_Enter=scanner.nextInt();
                scanner.nextLine();

                MobileDetails[] mobiles=new MobileDetails[How_Many_Data_Enter];

                for(int i=0;i<How_Many_Data_Enter;i++)
                {


                     /*
                     the argument of function must be leas
                     it must be 2 or 3
                     if there are alot of arguemt we should wirie a class for that function
                     a functiom must dosnt have any side effect
                     my this function dont have any  effect to other function
                     */



               
                        mobiles[i]=new MobileDetails();

                        System.out.println("Enter Mobile Name");
                        mobiles[i].setMobileName(scanner.nextLine());
                        System.out.println();
                     
                      
                       
     
                        System.out.println("Mobile Brand");
                        mobiles[i].setMobileBrand(scanner.nextLine());
                        System.out.println();

      

                        System.out.println("Mobile Price");
                        mobiles[i].setmobilePrice(scanner.nextInt());
                        System.out.println();
                        

                        scanner.nextLine();

          


                }
                       
                       setMobile(mobiles);
               
         }


         public void showAllRecord()
         {
                  


                        if(cheackArray())
                        {

                            System.out.println(MobileValidatore_object.Message());

                              
                        }
                        else{

                            System.out.println("===============All Record==========");
                            for(MobileDetails m : mobiles)
                            {
                            
                                   m.showMobileInfo();
                            
                            


                            }


                     }
                       

         }

        // search student Record
        public void Search_Mobile()
        {

                      System.out.println("Enter The Data That you want to search ");

                      String  Search_Data=scanner.nextLine();

                      System.out.println();

                      if(cheackArray())
                      {

                            System.out.println(MobileValidatore_object.Message());
                            //  System.out.println("The Array is empty");                
                               
                      }

                      else{
                                 
                            for(MobileDetails m : mobiles)
                            {

                            if(m.getMobileName().equals(Search_Data) || 
                                   m.getMobileBrand().equals(Search_Data))
                            {

                                   System.out.println("The Data You Are Serach Is ");

                                   m.showMobileInfo();
                                   

                            }
                            
                                   
                            }

                      }
                      

        }

        public boolean cheackArray()
        {

              return mobiles==null;
                  
              

        }



      





}

