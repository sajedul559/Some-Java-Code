
package user;

/**
 *
 * @author lab 201
 */
public class customer implements payment{
    private String name;
    String Address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doIAmount(double amount) {
    }

    @Override
    public void doAmount(double amount) {
    }

    
}
