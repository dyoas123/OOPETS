
package AbsTract;



public class Main {
    
    public static void main(String []args){
        System.out.println("This is my Pets");
        Pets d = new Dog() ;
        Pets c = new Cat();
       
        d.setName("Brownie, ");
        c.setName("kitty galore, ");
        
        d.showName();
        c.showName();
        
        d.color();
        c.color();
    }
}
