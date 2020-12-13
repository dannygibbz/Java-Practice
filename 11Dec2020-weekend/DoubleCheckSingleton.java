package hw.ss.weekend;

/*This file is for the creation of a Singleton with double-checked locking*/

public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance;
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton .class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    
}
