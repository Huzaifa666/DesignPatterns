package org.strategy.concreteStrategies;

import org.strategy.strategyInterface.Transport;

public class Road implements Transport {
    @Override
    public void fetchDestination(String source, String destination) {
        System.out.println("Mapping destination from : " + source + " to " + destination + " via road");
    }
}
