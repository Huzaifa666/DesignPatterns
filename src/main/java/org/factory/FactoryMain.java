package org.factory;

import org.factory.phone.OS;
import org.factory.phone.OSFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS windows = osFactory.fetchInstance("linux");
        windows.spec();
    }
}