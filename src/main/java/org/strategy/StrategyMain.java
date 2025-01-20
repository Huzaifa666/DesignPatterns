package org.strategy;

import org.strategy.concreteStrategies.Airport;
import org.strategy.concreteStrategies.Road;
import org.strategy.concreteStrategies.Sea;
import org.strategy.context.Context;

import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class StrategyMain {
    public static void main(String[] args) {
        // We can use setter instead of constructor
        Context airport = new Context(new Airport());
        Context sea = new Context(new Sea());
        Context road = new Context(new Road());

        airport.execute("Mumbai", "Bangalore");
        sea.execute("Mumbai", "Alibaug");
        road.execute("Bandra", "Kalyan");

        List<Double> list = new ArrayList<>();
        list.add(1d);
        list.add(2d);
        list.add(3d);
        list.add(4d);
        List<Double> result = new ArrayList<>();
        try (ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors())) {
            result = forkJoinPool.submit(() -> {
                return list.stream().parallel().map(x -> {
                    System.out.println(Thread.currentThread().getName());
                    return Math.pow(x, 2);
                });
            }).get().toList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (double a: result) {
            System.out.println(a);
        }

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);

//        Map<Character, Double> result1 = map.entrySet()
//                .stream()
//                .map(entry -> new AbstractMap.SimpleEntry<>(entry.getKey(), Map.pow(entry.getValue())))
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (e1, e2) -> e1,
//                        HashMap::new
//                ));
        Map<Character, Double> result1 = map.entrySet()
                .stream()
                .map(entry -> new AbstractMap.SimpleEntry<>(entry.getKey(), Double.valueOf(entry.getValue())))
                .sorted(Map.Entry.comparingByValue())
                .limit(2)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        HashMap::new
                ));
        for (Map.Entry entry: result1.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }
    }
}