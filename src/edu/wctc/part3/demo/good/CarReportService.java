package edu.wctc.part3.demo.good;

import javax.swing.*;

/**
 * This class is entirely hidden from the Main class and the Car class,
 * therefore, it can be changed without causing harm to other classes.
 *
 * @author Jim Lombardo
 */
public class CarReportService {
    private Car car;

    public CarReportService(Car car) {
        this.car = car;
    }

    public void produceEngineType() {
        System.out.println("Engine Type: " + car.getEngineType());
    }

    public void produceRunningStatus() {
        JOptionPane.showMessageDialog(null, "Car running status: " + car.isRunning());
    }
}
