
abstract class Content {
    protected String caption;
    protected String datePosted;
    protected int likes;
    protected int comments;
    protected int saves;

    public Content(String caption, String datePosted, int likes, int comments, int saves) {
        this.caption = caption;
        this.datePosted = datePosted;
        this.likes = likes;
        this.comments = comments;
        this.saves = saves;
    }
    public abstract double analyzeEngagement(); /* Formula to analyze how well content is doing. Returns a numeric score that will vary
    dependent on the type of engagement(likes comments, saves), as well as the type of content (Photos, Videos, Lives, etc.)
    */
}
class PhotoPost extends Content {
    public PhotoPost(String caption, String datePosted, int likes, int comments, int saves) {
        super(caption, datePosted, likes, comments, saves);
    }
    @Override
    public double analyzeEngagement() {
        double rawScore = (likes * 0.2) + (comments * 0.4) + (saves * 0.5); //The total engagement a post got, completely unadjusted to be out of 100.
        double maxLikes,maxComments,maxSaves;//Benchmark values for maximum engagement
        maxLikes = 100;
        maxComments = 50;
        maxSaves = 25;
        double maxScore = (maxLikes * 0.2) + (maxComments * 0.4) + (maxSaves * 0.5); //The highest score a post could possibly get.
         /*
         * BenchMark we're setting for maxScore: 100 likes, 50 comments, and 25 saves.
          */
         //We divide the rawScore by the best Score possible, to get an accurate rating.
        return rawScore/maxScore; //Raw Score calculated to a 0-100 range
    }
    @Override
    public String toString() {
        return "Photo Post Engagement Statistics: \n" +
        "Captions: " + caption + "\n" + "Likes: " + likes + "\n" + "Comments: " + comments + "\n" + "Saves: " + saves + "\n" + "Engagement Score:"
                + String.format("%.2f",analyzeEngagement()) + "/100\n";
    }
}
class ReelPost extends Content {
    public ReelPost(String caption, String datePosted, int likes, int comments, int saves) {
        super(caption, datePosted, likes, comments, saves);
    }

    @Override
    public double analyzeEngagement() {
        /*
        * Reel Statistics:
        * Reels get the most value from saves and likes
        * Comments are less frequent.
        * Weight for each type of interaction: Likes = 0.3, Comments = 0.2, Saves = 0.5
        * Benchmark: Comments = 30 Comments | Likes = 150 Likes | Saves = 70 Saves.
         */
        double rawScore = (likes * 0.3) + (comments * 0.2) + (saves * 0.5);
        double maxLikes = 150;
        double maxComments = 30;
        double maxSaves = 70;
        double maxScore = (maxLikes * 0.3) + (maxComments * 0.2) + (maxSaves * 0.5);
        return (rawScore/maxScore) * 100;
    }
    @Override
    public String toString(){
        return "Reel Engagement Statistics: \n" + "Caption: " + caption + "\n" + "Date: " + datePosted + "\n" + "Likes: " + likes + "\n" +
          "Comments: " + comments + "\n" + "Saves: " + saves + "\n" + "Engagement Score:" + String.format("%.2f",analyzeEngagement()) + "/100\n";
    }
}
class StoryPost extends Content {
    private int views;
    private int storyLikes;
    private int replies;

    public StoryPost(String caption, String datePosted, int views, int storyLikes,int replies) {
        super(caption, datePosted, storyLikes, replies, 0);
        this.views = views;
        this.storyLikes = storyLikes;
        this.replies = replies;
    }
    public double analyzeEngagement() {
        double rawScore = (views * 0.2 ) + (storyLikes * 0.3) + (replies * 0.5);
        double maxLikes = 100;
        double maxViews = 200;
        double maxReplies = 40;
        double maxScore = (maxViews * 0.2) + (maxLikes * 0.3) + (maxReplies * 0.5);
        /*
        * views = 20% weight
        * storyLikes = 30% weight
        * replies = 50% weight
        * Benchmark Values:
        * 200 Views
        * 100 Likes
        * 40 Replies
         */
        return (rawScore/maxScore) * 100 ;
    }
    public String toString() {
        return "Story Engagement Statistics:\n " + "Caption: " + caption + "\n" + "Date: " + datePosted + "\n" + "Views: " + views + "\n" +
                "Story Likes: " + storyLikes + "\n" + "Replies: " + replies + "\n" + "Engagement Score:" + String.format("%.2f", analyzeEngagement()) + "/100\n";
    }
}