package org.strategy.context;

import org.strategy.strategyInterface.Transport;

public class Context {
    private Transport transportStrategy;

    private Context() {}

    public Context(Transport transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public void execute(String source, String destination) {
        transportStrategy.fetchDestination(source, destination);
    }
}
