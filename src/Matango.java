public class Matango {

    int hp;
    final int LEVEL = 10;
    char suffix;
    Matango(char suffix, int hp) {
        this.suffix = suffix;
        this.hp = hp;
    }
    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}
