public class EvolutionOfTrustApplication {

    public static void main(String[] args){
        CheatPlayer cheatPlayer = new CheatPlayer();
        CooperatePlayer cooperatePlayer = new CooperatePlayer();
        Player player1 = new Player(cheatPlayer);
        Player player2 = new Player(cooperatePlayer);
        GameEngine gameEngine = new GameEngine(player1, player2, 5);
        gameEngine.start();
    }

}
