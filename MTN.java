import java.util.Scanner;
public class MTN {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data;
        int choice;
        //creating array
        String[] detail = new String[6];
        detail[0] = "1. Data";
        detail[1] = "2. Voice Bundles";
        detail[2] = "3. Special Offers";
        detail[3] = "4. MTN Business";
        detail[4] = "5. MTN Momo";
        detail[5] = "6. MTN Xtra Time";
        
        String[] dataBundles = new String[6];
        dataBundles[0] = "1. 10MB  @100SSPs";
        dataBundles[1] = "2. 50MB  @500SSPs";
        dataBundles[2] = "3. 80MB  @800SSPs";
        dataBundles[3] = "4. 700MB  @7000SSPs";
        dataBundles[4] = "5. 1.8GB  @8000SSPs";
        dataBundles[5] = "6. 10GB  @9000SSPs";
        
        String[] voiceBundles = new String[5];
        voiceBundles[0] = "1. 10Mins  @50SSPs";
        voiceBundles[1] = "2. 100Mins  @500SSPs";
        voiceBundles[2] = "3. 200Mins  @1000SSPs";
        voiceBundles[3] = "4. 3hrs  @2000SSPs";
        voiceBundles[4] = "5. 4hrs  @3000SSPs";
       
        
        String[] specialOffer = new String[3];
        specialOffer[0] = "1. 300MB Yello Sunday";
        specialOffer[1] = "2. 1GB Weekend Bundles";
        specialOffer[2] = "3. 90GB Monthly Bundles";
        
        String[] mtnBusiness = new String[6];
        //underdevelopment
        
        String[] mtnMomo = new String[6];
        //under development
        
        String[] mtnXtra = new String[6];
        //underdevelopment
 while(true){
        System.out.println("MTN DATA PROGRAM");
        for(int i=0; i<detail.length; i++){
            System.out.println(detail[i]);
        }
     //exit clause
     System.out.println("0. Exit");
        System.out.println();
        System.out.print("Input option here: ");
        data = input.nextInt();
        //switch cases
        switch(data){
            case 1:
            for(int i=0; i<dataBundles.length; i++){
                System.out.println(dataBundles[i]);
            }
                System.out.println();
                System.out.print("Enter choice here: ");
                choice = input.nextInt();
                switch(choice){
                    case 1:
                    System.out.println("Your 10MBs Data Bundles is successfully activated. Thanks for using MTN");
                    break;
                    case 2:
                    System.out.println("Your 50MBs Data Bundles is successfully activated. Thanks for using MTN");
                    break;
                    case 3:
                    System.out.println("Your 80MBs Data Bundles is successfully activated. Thanks for using MTN");
                    break;
                    case 4:
                    System.out.println("Your 700MBs Data Bundles is successfully activated. Thanks for using MTN");
                    break;
                    case 5:
                    System.out.println("Your 1.8GBs Data Bundles is successfully activated. Thanks for using MTN");
                    break;
                    case 6:
                    System.out.println("Your 10GBs Data Bundles is successfully activated. Thanks for using MTN");
                    break;
                    default:
                    System.out.println("Incorrect Input");
                    break;
                    
                }
            
            break;
            
            case 2:
            for(int i=0; i<voiceBundles.length; i++){
                System.out.println(voiceBundles[i]);
            }
                System.out.println();
                System.out.print("Enter choice here: ");
                choice = input.nextInt();
                switch(choice){
                    case 1:
                    System.out.println("Your 10Mins Voice Bundles is successfully activated. Thanks for using MTN");
                    break;
                    case 2:
                    System.out.println("Your 100Mins Voice Bundles is successfully activated. Thanks for using MTN");
                    break;
                    case 3:
                    System.out.println("Your 200Mins Voice Bundles is successfully activated. Thanks for using MTN");
                    break;
                    case 4:
                    System.out.println("Your 3hrs Voice Bundles is successfully activated. Thanks for using MTN");
                    break;
                    case 5:
                    System.out.println("Your 4hrs Voice Bundles is successfully activated. Thanks for using MTN");
                    break;
                }
            break;
            
            case 3:
            for(int i=0; i<specialOffer.length; i++){
                System.out.println(specialOffer[i]);
            }
            System.out.println();
            System.out.print("Enter choice here: ");
            choice = input.nextInt();
            switch(choice){
                case 1:
                System.out.println("Your 300MBs Yello Sunday Offer has been successfully activated. Thanks for using MTN!");
                break;
                case 2:
                System.out.println("Your 1GB Weekend bundles uas successfully been activated. Thanks for using MTN!");
                break;
                case 3:
                System.out.println("Your 90GB Monthly bundles have been successfully activated. Thanks for using MTN!");
                break;
            }
            break;
            
            case 4:
            System.out.println("MTN Business still under development, try other options please.");
            break;
            
            case 5:
            System.out.println("MTN MoMo still under development, try other options please.");
            break;
            
            case 6:
            System.out.println("MTN Xtra Time still under development, try other options please.");
            break;
        }
     if(data>6){
         System.out.println("Invalid Option, Try again please");
     }
     if(data==0){
         System.out.println("Program Exited!");
         break;
     }
  }
        
        
    }
}