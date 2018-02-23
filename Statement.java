import java.util.Scanner;

   public class Statement
   {
      public static void main(String[] args)
      {
         int age;
         String name;
         String college;
         String petname; 
         
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Enter your name.");         
         name = scan.nextLine();
         
         System.out.println("Enter your age.");         
         age = scan.nextInt();
         
         college = scan.nextLine();

         System.out.println("Enter the college you are currently attending."); 
         college = scan.nextLine();
         
         System.out.println("Enter your pet's name.");         
         petname = scan.nextLine();


                  
         System.out.println("Hello, my name is " + name + " and I am " + age + " years old.  I'm enjoying my time at " + college + ", though I miss my pet " + petname + " very much!");
         
        
         
         
                }
    }
