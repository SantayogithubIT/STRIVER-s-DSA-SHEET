import java.util.Scanner;

public class area1 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

         System.out.println("The base is");
          float base=sc.nextFloat();

        System.out.println("The area is");
        float height=sc.nextFloat();
        


        float area=((base*height)/2);
        System.out.println("The area is " +area);
        sc.close();
        
    }
    
}
