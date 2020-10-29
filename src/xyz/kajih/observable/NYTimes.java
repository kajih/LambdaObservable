package xyz.kajih.observable;

import xyz.kajih.interfaces.Observer;

public class NYTimes implements Observer {
  @Override
  public void inform(String tweet) {
    if (tweet != null && tweet.contains("money")) {
      System.out.println("Breaking news in NY!" + tweet);
    }
  }
}
