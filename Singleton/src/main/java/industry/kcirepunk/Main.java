package industry.kcirepunk;

import industry.kcirepunk.singleton.ConfiguracionSingleton;

public class Main {

    public static void main(String[] args) {
        ConfiguracionSingleton singletonA = ConfiguracionSingleton.getInstance();
        ConfiguracionSingleton singletonB = ConfiguracionSingleton.getInstance();

        System.out.println(singletonA);
        System.out.println("Misma referecia ==>" + ( singletonA == singletonB ));


        singletonA.setAppName("Singleton Pattern");
        singletonB.setAppVersion("v5");

        System.out.println("SingletonA ==>" + singletonA.getAppName());
        System.out.println("SingletonB ==>" + singletonB.getAppName());

        singletonA = null;
        singletonB = null;

        singletonA = ConfiguracionSingleton.getInstance();
        System.out.println("SingletonA ==>" + singletonA);

    }
}
