package xyz.kajih;

import xyz.kajih.interfaces.Observer;
import xyz.kajih.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subject {
  private final List<Observer> observers = new ArrayList<>();

  public void registerObserver(Observer o) {
    this.observers.add(o);
  }

  public void notifyObservers(String tweet) {
    observers.forEach(o -> o.inform(tweet));
  }
}
