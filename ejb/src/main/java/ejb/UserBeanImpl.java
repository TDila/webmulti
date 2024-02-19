package ejb;

import jakarta.ejb.Stateless;

@Stateless
public class UserBeanImpl{
    public String getDetails(){
        return "This is getDetails() method";
    }
}
