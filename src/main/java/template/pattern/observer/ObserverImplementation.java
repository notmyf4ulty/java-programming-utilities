package template.pattern.observer;

public class ObserverImplementation extends Observer {

    Subject subject;

    public ObserverImplementation(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("State changed.");
    }
}
