import java.sql.*;
import java.time.*;
import java.util.*;
public class Start extends A
{
    public static void main(String args[]) throws Exception{
            new Start();
            } 
       Start(){  
               try{ 
       Class.forName("com.mysql.jdbc.Driver");

       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","root");
       PreparedStatement r=null;
       PreparedStatement q=null;
       PreparedStatement z=null;
       Statement d=null;
       //int i=1;        
       Scanner s=new Scanner(System.in);
       int[] a=new int[10];
       //String nn = new String();//line 71
       
       //int dg=5;
       //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","root");
       System.out.println();
       System.out.println("***************************");
       System.out.println("Welcome to ABC Hotel");
       System.out.println("*********************");
       System.out.println("Menu : 1.Register a room \n 2.Avail Services \n 3.Exciting the Hotel ");
       System.out.println("Enter the number against the options to proceed ");
       int t=s.nextInt();
       switch(t)
       {
           case 1: System.out.println("You are a step closer to regiser the room ");
                   register();
                   //int i=1;
                   //a[i]=1;
                   //System.out.println(i);
                   double y=Math.random() * 999;
                   int x=(int)y;
                   //System.out.println("Room no is "+i);
                   System.out.println("Following are your credentials for any support inside our premises");
                   System.out.println("name : "+name);
                   System.out.println("UniqueReference "+x);
                   LocalDate ld=LocalDate.now();
                   String xj=ld.toString();
                   r=con.prepareStatement("insert into sample values(?,?,?,?,?)");
                   r.setInt(1,x);
                   r.setString(2,name);
                   r.setString(3,xj);
                   r.setInt(4,0);
                   r.setInt(5,0);
                   //System.out.println("Entering");
                   int n=r.executeUpdate();
                   if(r==null)
                   {
                           System.out.println("Lol");
                   }
                   //con.close();
                   //System.out.println(n);
                   //catch(Exception e){}
           //We need to call registration function here
                   break;
           case 2: System.out.println("Its glad that you wish to avail our services ");
           /* We need to call the services function here */
                   System.out.print("Enter your name : ");
                   String nn=s.next();
                   System.out.println("Enter your ur");
                   int c=s.nextInt();
                   System.out.println();
                   ///CONTINUE FROM HERE
                 //  System.out.println("Enter your name");
                  // String nn=s.nextLine();
                  // int hg=s.nextInt();
                   //System.out.println(hg);
                   d=con.createStatement();
                   int tpr=0;
                   //IMPLEMENTING 2FA AUTHENTICATION
                   System.out.println("******** \n Validating your credentials \n ********* ");
                   ResultSet rs=d.executeQuery("select name,bill from sample where roll = "+c);
                   if(rs.next()){
                   //System.out.println(rs.getString(1)+" "+rs.getInt(2));
                   String dn=rs.getString(1);
                   if(rs.getInt(2)==0)
                           tpr=0;      //temporary price
                   else{
                           tpr+=rs.getInt(2);
                   }
                   System.out.println("******** \n Please wait.. \n ********* ");
                   if(dn.equals(nn)){
                   System.out.println("Successfully Validated ");     
                   service();
                   //System.out.println(pr);
                   q=con.prepareStatement("update sample set bill = ? where roll = ? ");
                   tpr+=pr;
                   q.setInt(1,tpr);
                   q.setInt(2,c);
                   int yj=q.executeUpdate();
                   System.out.println(yj);
                   }
                   else
                     System.out.println("Enter correctly your credentials ");
                   }
                   else
                   System.out.println("You've entered something wrong ");
                 /*  }
                   else{
                           System.out.println("You've entered something wrong ");
                   } */
                   break;
           case 3: System.out.println("Thanks for spending your time in our Hotel ");
           //We need to call Billing function here
                   System.out.print("Enter your name : ");
                   String vb=s.next();
                   System.out.println("Enter your ur");
                   int h=s.nextInt();
                   ///CONTINUE FROM HERE
                   d=con.createStatement();
                   ResultSet ds=d.executeQuery("select name,bill from sample where roll = "+h);
                   System.out.println("  ******** \nValidating your credentials\n********* ");
                   if(ds.next()){
                   System.out.println(ds.getString(1));
                   int pay=ds.getInt(2);
                   System.out.println("Your bill is "+pay+" \n Pay the bill ");
                   System.out.println("*******************   \n ***************** \n If paid click 1 ");
                   int fg=s.nextInt();
                   if(fg==1){
                   System.out.println("Yess you've completed billing.\n Please provide your valuable feedback");
                   System.out.println("Rate us on a scale of 3 : 1/2/3 ");
                   int fb=s.nextInt();
                   z=con.prepareStatement("update sample set feedback = ? where roll = ? ");
                   z.setInt(1,fb);
                   z.setInt(2,h);
                   int df=z.executeUpdate();
                   System.out.println(df);
                   System.out.println("THANK YOU WE LOOK FORWARD TO SEE YOU AGAIN");
                   }}
                   else
                   System.out.println("You,ve entered something wrong ");
                   break;
          default:System.out.println("Please Enter a correct option :) ");                       
       }
       }
       catch(Exception e){}
}}  
class A{
        //try{
        Scanner Sc=new Scanner(System.in);
        String name=new String();
        int days;
        int amt=1000;
        int s=0;
        int pr=0;
           //Class.forName("com.mysql.jdbc.Driver");
           //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","root");
           //Statement stmt=con.createStatement();
           //PreparedStatement r;
        public void register(){
                System.out.println("We are having sufficient number of rooms to facilitate Customers ");
                System.out.print("To proceed,we need certain details.\n Please enter your name(CAPITAL LETTERS): ");
                name=Sc.nextLine();
                System.out.print(" Hello "+name+" how many days do you want to stay : ");
                days=Sc.nextInt();
                //s++;
                System.out.println("Your have registered successfully...");
                //int h=getinc();
               /* System.out.println("Following are your credentials for any support inside our premises");
                System.out.println("name : "+name);
                System.out.println("UniqueReference "); */
                amt=amt*days;
                System.out.println("Your bill is "+amt);
                System.out.println("Please pay this amount in advance as we dont charge for any other services till your exit.If paid enter 1 ");
                //String x=new String();
                int check =Sc.nextInt();
                if(check==1){
                System.out.println("Yess,you've are almost done ,Dont forget to ping us for any services/support ");
                //r=con.prepareStatement("insert into sample values(ur,name,'BCoM')");
                //r.executeUpdate();
                //con.close();
                }
                else
                 {
                        System.out.println("You are redirecting to main page");
                        //should implement
                 }
        } 
      public void service(){
              System.out.println("********************************* \n And Welcome to Services Department");
              System.out.println("Menu of Services : \n 1.Doctor Consultation Rs:100 \n 2.Rent for a car Rs:300\n"+ 
              "3.Laundry and Cleaning Rs:400 \n 4.Misc ");
              System.out.println("Enter number against wished Service ");
              int ch=Sc.nextInt();
              //int pr=0;
              switch(ch)
              {
                case 1: System.out.println("Doctor is on the way :) ");
                        pr+=100;
                        break;
                case 2: System.out.println("Your Cab is booked ");
                        pr+=300;
                        break;
                case 3: System.out.println("Cleaning staff will be coming for cleaning");
                        pr+=400;
                        break;
                case 4: System.out.println("Please call our staff for other services assistance ");
                        break;
                default: System.out.println("Please enter correct choice ");                        
              }
      }
}        /* public static void main(String ar[]){
              new Start().regiser(); */
