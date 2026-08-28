public class NewMain {
    public static void main(String[] args) {

        GameTicker ticker = new GameTicker();

       MobilePushNotification phone = new MobilePushNotification();
       StadiumDisplay stadium = new StadiumDisplay();
       SocialMediaBot socialMedia = new SocialMediaBot();

       ticker.register(phone);
       ticker.register(stadium);
       ticker.register(socialMedia);

       ticker.addUpdate("team scored a goal");
    }
}
