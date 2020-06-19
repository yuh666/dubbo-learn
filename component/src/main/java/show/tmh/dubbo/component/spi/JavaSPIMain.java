package show.tmh.dubbo.component.spi;

import java.util.ServiceLoader;

public class JavaSPIMain {

    public static void main(String[] args) {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }
}
