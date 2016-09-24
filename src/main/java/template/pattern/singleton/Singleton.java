package template.pattern.singleton;

public class Singleton {

    private Singleton instance = null;

    private Singleton() {}

    public Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
