public class NewMain {
    public static void main(String[] args) {

        GameTicker ticker = new GameTicker();

        ticker.addUpdate("team scored a goal");
        ticker.addUpdate("game is tied");

        System.out.println(ticker.getLatestUpdate());
    }
}
