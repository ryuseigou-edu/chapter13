public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setHp(40);
        h.setName("ミナト");

        nowHp(h);
        King k = new King();
        k.talk(h);
        h.bye();

        Inn i = new Inn();
        i.checkIn(h);
        nowHp(h);
        h.sleep();

        Matango m = new Matango('A',100);
        h.attack(m);
    }
    static void nowHp(Hero h){
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());
    }
}
