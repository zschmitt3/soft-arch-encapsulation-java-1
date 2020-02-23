package edu.wctc.clazz.demo.good;

import javax.swing.JOptionPane;

/**
 * This class is entirely hidden from the startup class and the Car class, 
 * therefore, it can be changed without causing harm to other classes.
 * 
 * @author Jim Lombardo
 */
public class CarReportService {
    private Car car;
    
    public CarReportService(Car car) {
        this.car = car;
    }
    
    public void produceRunningStatus() {
        JOptionPane.showMessageDialog(null,"Car running status: " + car.isRunning());
    }
    
    public void produceEngineType() {
        System.out.println("Engine Type: " + car.getEngineType());
    }
}
