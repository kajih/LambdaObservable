package xyz.kajih.observable;

import xyz.kajih.interfaces.Observer;

public class LeMonde implements Observer {
  @Override
  public void inform(String tweet) {
    if (tweet != null && tweet.contains("wine")) {
      System.out.println("Today cheese, wine and news! " + tweet);
    }
  }
}
