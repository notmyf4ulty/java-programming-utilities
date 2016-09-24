package src.example.template.pattern.observer;

public class ObserverPatternDemo {
    public static void main(String [] args) {
        Subject subject = new Subject();

        Observer binaryObserver = new BinaryObserver(subject);
        Observer octalObserver = new OctalObserver(subject);
        Observer hexaObserver = new HexaObserver(subject);

        subject.notifyAllObservers();
        subject.setState(10);
        subject.notifyAllObservers();
    }
}
