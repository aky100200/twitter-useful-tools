package retweetoff;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("run start.");

        Twitter twitter = TwitterFactory.getSingleton();
        FollowerUpdater updater = new FollowerUpdater(twitter);


        try {
            updater.Initialize();
            updater.allRetweetOff();
        } catch (TwitterException e) {
            throw new RuntimeException(e);
        }

        System.out.println("success.");
    }
}
