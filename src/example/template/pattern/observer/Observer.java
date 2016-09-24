package src.example.template.pattern.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}