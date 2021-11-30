package com.charuniverse.javareflection;

import com.charuniverse.javareflection.data.Car;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    void testProxy() {
        InvocationHandler invocationHandler = (proxy, method, args) -> {
            switch (method.getName()) {
                case "getName":
                    return "Car Proxy";
                case "run":
                    System.out.println("Car is running");
            }
            return null;
        };

        Car car = (Car) Proxy.newProxyInstance(
                Car.class.getClassLoader(),
                new Class[]{Car.class},
                invocationHandler
        );

        System.out.println(car.getName());
        car.run();
    }
}
