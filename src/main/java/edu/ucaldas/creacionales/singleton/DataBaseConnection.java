package edu.ucaldas.creacionales.singleton;

public class DataBaseConnection {
    private static volatile DataBaseConnection instance;

    private DataBaseConnection() {}

    public static DataBaseConnection getInstance() {
        if (instance == null) {
            synchronized (DataBaseConnection.class) {
                if (instance == null) {
                    instance = new DataBaseConnection();
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conectado a la base de datos");
    }

    public void disconnect() {
        System.out.println("Desconectado de la base de datos");
    }
}
