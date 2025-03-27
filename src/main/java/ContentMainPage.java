import java.util.ArrayList;
import java.util.Scanner;

public class ContentMainPage {
    public static void main(String[] args) {
        ArrayList<Content> contentCalendar = new ArrayList<>();
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        while (isRunning) {
            System.out.println("InstaTracker Menu: ");
            System.out.println("[1] Add Photo Post:");
            System.out.println("[2] Add Reel Post:");
            System.out.println("[3] Add Reel Photo:");
            System.out.println("[4] View All Posts: ");
            System.out.println("[5] Exit Program");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Caption: ");
                    String caption = scanner.nextLine();
                    System.out.println("Enter Date Posted (YYYY-MM-DD): ");
                    String datePosted = scanner.nextLine();
                    System.out.println("Enter Number of Likes: ");
                    int likes = scanner.nextInt();
                    System.out.println("Enter Number of Comments: ");
                    int comments = scanner.nextInt();
                    System.out.println("Enter Number of Saves: ");
                    int saves = scanner.nextInt();
                    scanner.nextLine();

                    PhotoPost photoPost = new PhotoPost(caption, datePosted, likes, comments, saves);
                    contentCalendar.add(photoPost);
                    System.out.println("Photo Post Added :D!");
                    break;
                case 2:
                    System.out.println("Enter Caption: ");
                    caption = scanner.nextLine();

                    System.out.println("Enter Date Posted (YYYY-MM-DD): ");
                    datePosted = scanner.nextLine();

                    System.out.println("Enter Number of Likes: ");
                    likes = scanner.nextInt();

                    System.out.println("Enter Number of Comments: ");
                    comments = scanner.nextInt();

                    System.out.println("Enter Number of Saves: ");
                    saves = scanner.nextInt();
                    scanner.nextLine();

                    ReelPost reelPost = new ReelPost(caption, datePosted, likes, comments, saves);
                    contentCalendar.add(reelPost);
                    System.out.println("Reel Post Added :D!");
                    break;

                case 3:
                    System.out.println("Enter Caption: ");
                    caption = scanner.nextLine();

                    System.out.println("Enter Date Posted (YYYY-MM-DD): ");
                    datePosted = scanner.nextLine();

                    System.out.println("Enter Number of Views: ");
                     int views = scanner.nextInt();

                    System.out.println("Enter Number of Story Likes: ");
                    int  storyLikes = scanner.nextInt();

                    System.out.println("Enter Number of Replies: ");
                    int replies = scanner.nextInt();
                    scanner.nextLine();

                    StoryPost storyPost = new StoryPost(caption,datePosted, views,storyLikes,replies);
                    contentCalendar.add(storyPost);
                    System.out.println("Story Post Added :D!");
                    break;
                case 4:
                    if(contentCalendar.isEmpty()) {
                        System.out.println("No posts yet");
                    } else{
                        for(Content content : contentCalendar) {
                            System.out.println(content.toString());
                        }
                    }
                    break;
                case 5:
                    //
                    isRunning = false;
                    System.out.println("Exiting Program...Bye!");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
        scanner.close();
    }
}
