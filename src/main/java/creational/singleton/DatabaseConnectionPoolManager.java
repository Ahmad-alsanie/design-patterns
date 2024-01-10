package creational.singleton;

public class DatabaseConnectionPoolManager {

    private DatabaseConnectionPoolManager() {
    }

    private static class Holder {
        private static final DatabaseConnectionPoolManager INSTANCE = new DatabaseConnectionPoolManager();
    }

    public static DatabaseConnectionPoolManager getInstance() {
        return Holder.INSTANCE;
    }

    public void createConnectionPool() {
        System.out.println("Creating database connection pool.");
    }

}
