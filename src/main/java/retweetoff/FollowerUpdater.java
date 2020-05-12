package retweetoff;

import lombok.RequiredArgsConstructor;
import twitter4j.IDs;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class FollowerUpdater {
    private final Twitter twitter;
    private List<Long> followerIds = new ArrayList<>();

    public void Initialize() throws TwitterException {
        getfollowers();
    }

    private void getfollowers() throws TwitterException {
        IDs ids;
        long cursor = -1L;
        do {
            ids = twitter.getFollowersIDs("akiyu33333", cursor);
            for (long id : ids.getIDs()) {
                followerIds.add(id);
            }
            cursor = ids.getNextCursor();
        } while (ids.hasNext());
    }

    public void allRetweetOff() {
        for (long id : followerIds) {
            try {
                twitter.updateFriendship(id, false, false);
            } catch (TwitterException e) {
                //TODO: なぜか更新できないアカウントが何人かいる
//                e.printStackTrace();
                System.out.println("error: " + id);
            }
        }
    }
}
