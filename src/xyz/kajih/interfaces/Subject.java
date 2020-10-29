package xyz.kajih.interfaces;

public interface Subject {
  void registerObserver(Observer o);

  void notifyObservers(String tweet);
}
