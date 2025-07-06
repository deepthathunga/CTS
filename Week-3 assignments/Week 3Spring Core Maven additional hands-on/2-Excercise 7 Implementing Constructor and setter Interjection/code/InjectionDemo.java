package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        VehicleConstructor vc = (VehicleConstructor) context.getBean("vehicleConstructor");
        vc.showDetails();

        VehicleSetter vs = (VehicleSetter) context.getBean("vehicleSetter");
        vs.showDetails();
    }
}