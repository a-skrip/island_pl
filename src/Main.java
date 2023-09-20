public class Main {
    public static void main(String[] args) {
        GameMap map = new GameMap();
        map.printGameMap();
        for (int i = 0; i < Config.NUMBER_OF_ITERATION; i++) {
            try {
                map.iterate();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.printGameMap();
        }
    }
}
