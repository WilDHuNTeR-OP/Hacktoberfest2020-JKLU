import java.util.Scanner;

public class menu {
   
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);        
        System.out.println("Queue Test\n");
        System.out.println("Enter Size of Integer queue ");
        int Max = scan.nextInt();
       
        char ch;
        do{
            System.out.println("\n Queue Operations");
            System.out.println("1. enque");
            System.out.println("2. deque");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. no of element in queue");
            System.out.println("7. Traversal");
            int choice = scan.nextInt();
           switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to enque");
               // val;
               // enque (val)                      
                break;                         
            case 2 : 
                
                    System.out.println("deque Element = " );
                
              
                break;                         
            case 3 :         
                
                    System.out.println("Peek Element = ");
                
             
                break;                         
            case 4 : 
                System.out.println("Empty status = " );
                break;                
            case 5 :
                System.out.println("Full status = " );
                break;                 
            case 6 : 
                System.out.println("Size = " );
                break;                         
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            /* display stack */
                     
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0); 
 
        } while (ch == 'Y'|| ch == 'y');                 
    }
}
    

