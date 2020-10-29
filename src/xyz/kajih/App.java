package xyz.kajih;


import xyz.kajih.observable.Guardian;
import xyz.kajih.observable.LeMonde;
import xyz.kajih.observable.NYTimes;

class App {
  public static void main(String[] args) {
    Feed f = new Feed();

    f.registerObserver(new NYTimes());
    f.registerObserver(new Guardian());
    f.registerObserver(new LeMonde());

    f.notifyObservers("The queen said her favourite book is Java 8 in Action!");
  }
}
