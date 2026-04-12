package model;

public final class Client {

    private static String staticName;


    private Client(){

    }

    public static String getStaticName() {
        return staticName;
    }

    public static void setStaticName(String staticName) {
        Client.staticName = staticName;
    }

}
