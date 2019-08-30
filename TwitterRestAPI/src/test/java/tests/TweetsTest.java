package tests;

import client.tweets.TweetsClient;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasValue;
import static org.hamcrest.Matchers.not;

public class TweetsTest {

    protected TweetsClient tweetsClient;
    protected long tweetId;
    protected List<Long> tweetIdList;

    //@Test
    public void test() throws Exception {
//        for (int i = 0; i < 10; i++) {
//            testGetUserTimeline();
//            testUserCanTweet();
//            testUserCanTweet();
//            cleanUp();
//        }
    }

    @BeforeClass
    public void setUp() {
        this.tweetsClient = new TweetsClient();
        // List for all the tweet ids which will be used for cleanup
        this.tweetIdList = new ArrayList<Long>();
    }

    @Test(description = "Retrieves the user's tweets from their timeline")
    public void testGetUserTimeline() throws Exception {
        this.tweetsClient.getUserTimeline();
    }

    @Test(description = "User can successfully tweet")
    public void testUserCanTweet() throws Exception {
        String tweet = "Test from My domain " + UUID.randomUUID();
        ValidatableResponse response = this.tweetsClient.createTweet(tweet);
        response.statusCode(HttpStatus.SC_OK);
        this.tweetId = response.extract().body().path("id");
        this.tweetIdList.add(this.tweetId);
        System.out.println(this.tweetIdList.get(0));
    }

    @Test(description = "User unsuccessfully tweets the same tweet twice")
    public void testUserCannotTweetTheSameTweetTwiceInARow() throws Exception {
        String tweet = "Todays   -- Test " + UUID.randomUUID();
        ValidatableResponse response = this.tweetsClient.createTweet(tweet);
        response.statusCode(HttpStatus.SC_OK);
        this.tweetId = response.extract().body().path("id");
        this.tweetIdList.add(this.tweetId);
        response = this.tweetsClient.createTweet(tweet);
        response.statusCode(HttpStatus.SC_FORBIDDEN);
    }

    @Test(dependsOnMethods = {"testUserCanTweet"}, description = "User can successfully delete a tweet", enabled = false)
    public void testUserCanDeleteTweet() throws Exception {
        ValidatableResponse response = this.tweetsClient.deleteTweet(this.tweetId);
        response.statusCode(HttpStatus.SC_OK)
                .and()
                .body("$", not(hasValue(this.tweetId)));
    }


    @Test
    public void delet() {
//        apiKey=ysmfKarWZAZzPoiNeRzaQ5ydw
//        apiSecretKey=QyumFUoVkKalFRzFvhOOHJ1Z6zn6vRncrY86hMcP3CIBWbyG1y
//        accessToken=1109971036387360771-s1clUaOhVLQNQy5zakNF25I90Qy9qG
//        accessTokenSecret=e7phCNeqhnVyPS6ToMEvra6aQNvGJYzbi2bDtIV67JV5J

        RestAssured.baseURI = "https://api.twitter.com/1.1";

        given()
                .auth()
                .oauth("ysmfKarWZAZzPoiNeRzaQ5ydw", "QyumFUoVkKalFRzFvhOOHJ1Z6zn6vRncrY86hMcP3CIBWbyG1y",
                        "1109971036387360771-s1clUaOhVLQNQy5zakNF25I90Qy9qG", "e7phCNeqhnVyPS6ToMEvra6aQNvGJYzbi2bDtIV67JV5J")
                .queryParam("status", "Today 16 June 10:30AM i am sending tweet from my IntelliJ")
                .when()
                .post("/statuses/update.json")
                .then()
                .statusCode(200);
    }

    // @AfterClass(description = "Deletes all the tweets created by the tests", enabled = true)
    public void cleanUp() {
        if (this.tweetIdList != null) {
            for (Long tweetId : this.tweetIdList) {
                this.tweetsClient.deleteTweet(tweetId);
            }
        }
    }

}
