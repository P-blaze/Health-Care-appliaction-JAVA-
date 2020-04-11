import java.util.*;
import java.util.jar.Attributes.Name;
import java.lang.*;


class execute{
   static int num_p;
    // array to store patient details upto 10 patient's only
    static patient_details d1[] = new patient_details[10];

    // function to display all patient's record
    public static void displayAll(){
        System.out.println("\n------------------------------------------------------------");
        System.out.println("| Name       Age        Id                                 |");
        for ( int i = 0; i < num_p ; i++){
            d1[i].display_pdetails();
        }
     
    }
    public static void main(String...args){

        Scanner sc = new Scanner(System.in);
System.out.println("------------------------------------------------------------------------------------------------------------------------------");
System.out.println("|                                       <==    Welcome to the hospital.......  ==>                                            | " );
System.out.println("------------------------------------------------------------------------------------------------------------------------------");
    
       
        System.out.print("\n-> How many patient you want to register ( at a time you can only register upto 10 patients ) : ");
      num_p = sc.nextInt();
        
        int a = 0;
        // getting patient details
        System.out.println("\nEnter Patient details :==> \n ");
        while (a < num_p){
            System.out.println(" -> Enter " + (a+1) +" patient's (name ,[space],  age) ==> ");
            d1[a] = new patient_details(sc.next(),sc.nextInt());
            System.out.println("\n >> Please choose among the following doctors for your diagnosis :");
            
            // displaying doctor's details
            for(doctor_details x  : doctor_details.values()){
                System.out.println(" "+x.get_doctor_id() + "   "+x.name() + "   " + x.get_doctor_specialization() + "   " + x.get_fees()   );
                
            }
            System.out.println("\n");
            System.out.print(" -> Enter doctor's id : ");
                int did = sc.nextInt();

                if(did == 1){
                    System.out.println("-------------------APPOINTMENT SLIP-------------------------");
                    System.out.println("| Patient Details :==>                                     |");
                    System.out.println("\n| Name        Age        ID                                |");
                    d1[a].display_pdetails();
                    System.out.println("| >> Corresponding Doctor details :                        |");
                    for (doctor_details y : doctor_details.values()){
                        while (y.get_doctor_id() == 1)
                    {System.out.println("\n|  Name         Specializatipn         Fees                |");
                     System.out.println("\n|  "+y + "         " + y.get_doctor_specialization() + "         "+ y.get_fees()+"                 |");
                     System.out.println("-----------------------------------------------------------");
                            break;
                        }
                    }
                }
                else if(did == 2){
                    System.out.println("-------------------APPOINTMENT SLIP-------------------------");
                    System.out.println("| Patient Details :==>                                     |");
                    System.out.println("\n| Name        Age        ID                                |");
                    d1[a].display_pdetails();
                    System.out.println("| >> Corresponding Doctor details :                        |");
                    for (doctor_details y : doctor_details.values()){
                        while (y.get_doctor_id() == 2)
                    {System.out.println("\n|  Name         Specializatipn         Fees                |");
                     System.out.println("\n|  "+y + "         " + y.get_doctor_specialization() + "         "+ y.get_fees()+"                 |");
                     System.out.println("-----------------------------------------------------------");
                            break;
                        }
                    }
                }
                else if(did == 3){
                    System.out.println("-------------------APPOINTMENT SLIP-------------------------");
                    System.out.println("| Patient Details :==>                                     |");
                    System.out.println("\n| Name        Age        ID                                |");
                    d1[a].display_pdetails();
                    System.out.println("| >> Corresponding Doctor details :                        |");
                    for (doctor_details y : doctor_details.values()){
                        while (y.get_doctor_id() == 3)
                    {System.out.println("\n|  Name         Specializatipn         Fees                |");
                     System.out.println("\n|  "+y + "         " + y.get_doctor_specialization() + "         "+ y.get_fees()+"                 |");
                     System.out.println("-----------------------------------------------------------");
                            break;
                        }
                    }
                }

            
    
            a++;    
        }
        System.out.println("\n-> See the record of entered patient : \n");
     
        System.out.println("# Enter 1 to see, 0 to exit");
        int flag = sc.nextInt();
        if ( flag == 1){
             displayAll();
             System.out.println("|                                                          |");
             System.out.println("------------------------------------------------------------\n");
            }
        else {
            System.out.println("\n**stay safe, Please take care of yourself......exiting ==>.....**");
         }
         System.out.println("------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("|                                                            +                                                               |");
         System.out.println("------------------------------------------------------------------------------------------------------------------------------");
    }
}
    
// class storing all patient's info
class patient_details{

    public static int patient_id_gen(){
     
        Random r = new Random();
        int id  = r.nextInt(1000);
        return id; 
    }  
    private String patient_name;
    private int patient_age;
    private int patient_id = patient_id_gen();
    
    patient_details(String p_name , int p_age){
        this.patient_name = p_name;
        this.patient_age = p_age;
    }
    
    public void display_pdetails(){
        System.out.println("\n  "+patient_name + "       " + patient_age + "        " + patient_id+"                                "+"\n");  
    
    }
}



// enum class storing all doctor's details 
enum doctor_details{
    MUKESH("Pediatrician" , 500 , 1),
    PRIYA("Gynacologist", 1000 , 2),
    AKASH("Dermatologist" , 500 ,  3);
    public String doctor_specialization;
    public int fees;
    public int doctor_id;

    doctor_details(String ds , int f, int n ){
        this.doctor_specialization = ds;
        this.fees = f;
        this.doctor_id = n;

    }
    public String get_doctor_specialization(){
        return doctor_specialization;
    }
    public int get_fees(){
        return fees;
    }
    public int get_doctor_id(){
        return doctor_id;
    }




}

