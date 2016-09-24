package template.pattern.observer;

import example.template.pattern.observer.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
