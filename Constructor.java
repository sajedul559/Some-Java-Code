
package executionsteps;

public class Constructor {
    String name,grade;
    int phone;
    
    
    
   Constructor(String n,String g,int p)
   {
   name = n;
   grade = g;
   phone = p; 
   }
   Constructor()
   {
       System.out.println("no value");
   
   
   
   }
   
   
   
    void displayinformation()
    {
        System.out.println("Name:"+name);
        System.out.println("grade:"+grade);
        System.out.println("phone:"+phone);
        
    
    
    
    
    }
    
}
