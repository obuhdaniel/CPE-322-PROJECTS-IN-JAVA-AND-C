import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t Welcome to the Student Management Interface    \n \n \t  \t Use Enter Key to enter data");
        System.out.print("\n \tEnter the First Name: \t");
        String first = input.next();
        System.out.print("\n\tEnter the Middle Name: \t");
         String mid = input.next();
        System.out.print("\n\tEnter the Last Name: \t");
         String last = input.next();
        
        System.out.println("\n \n \t \t Welcome  User 1");
        System.out.println("-----------------------------------------------");
       
        System.out.println("|                                              |");
        System.out.println("|    First Name    " + first + "              ");
        
        System.out.println("|                                              |");
         System.out.println("|    Middle Name    " + mid + "              ");
         System.out.println("|                                              |");
         System.out.println("|    Last Name    " + last + "              ");
         System.out.println("|                                              |");
        
        System.out.println("-----------------------------------------------");
        
    }
    
}
