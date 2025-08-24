package orangehrmtest;

import org.testng.annotations.Test;

public class FirstCase {

    @Test(priority = 1)
    public void Openapp(){

        System.out.println("the app is opened");
    }
    @Test(priority = 2)
    public void Loginapp(){

        System.out.println("got logged in");
    }
    @Test(priority = 3)
    public void Closeappp(){

        System.out.println("got logged off");
    }
}
