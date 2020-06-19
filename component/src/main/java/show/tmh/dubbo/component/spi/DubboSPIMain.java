package show.tmh.dubbo.component.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class DubboSPIMain {

    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        System.out.println("Dubbo SPI");
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }
}
