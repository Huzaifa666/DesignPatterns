package org.factory.phone;

// Creator Factory Returning product
public class OSFactory {
    public OS fetchInstance(String str) {
        // CreatorA
        if (str.equals("android")) {
            // ConcreteProductA
            return new Android();
        } else if (str.equals("windows")) {
            return new Windows();
        } else if (str.equals("ios")) {
            return new IOS();
        }
        return new Linux();
    }
}
