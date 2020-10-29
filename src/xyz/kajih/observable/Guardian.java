package xyz.kajih.observable;

import xyz.kajih.interfaces.Observer;

public class Guardian implements Observer {
  @Override
  public void inform(String tweet) {
    if (tweet != null && tweet.contains("queen")) {
      System.out.println("Yet another news in London... " + tweet);
    }
  }
}
