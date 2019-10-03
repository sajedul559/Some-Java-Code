
package executionsteps;


public class OverloadingCons {
    String name;
    String gander;
    int phone;
    
 OverloadingCons()
 {
     System.out.println("No information");
 }
 OverloadingCons(String n,String g)
 {
     name = n;
     gander = g;
    
}
 OverloadingCons(String n,String g,int p)
 {
 
     name = n;
     gander = g;
     phone = p;
}
 
 void infromation()
 {
          System.out.println("Name:"+name);

           System.out.println("gander:"+gander);
            System.out.println("phone:"+phone);

 
 
 
 
 }
 
}
