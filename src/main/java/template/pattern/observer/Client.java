package template.pattern.observer;

public class Client {
    Subject subject = new Subject();
    Observer observer = new ObserverImplementation(subject);

    public void setSubjectAndNotifyObservers() {
        int newState = 0;
        subject.setState(newState);
        subject.notifyAllObservers();
    }
}
