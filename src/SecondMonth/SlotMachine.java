package SecondMonth;

public class SlotMachine {
    String[] symbols = new String[]{"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};
    int cnt = 0;
    int[] v = new int[4];

    public SlotMachine() {
    }

    public void pullLever() {
            for (int i = 0; i < 3; i++) {
                v[i] = (int) (Math.random() * 5);
                //System.out.print(v + " ");
                if (v[i] == 0) {
                    System.out.println("🍒");
                } else if (v[i] == 1) {
                    System.out.println("🍋");
                } else if (v[i] == 2) {
                    System.out.println("🍊");
                } else if (v[i] == 3) {
                    System.out.println("🔔");
                } else if (v[i] == 4) {
                    System.out.println("🍉");
                } else if (v[i] == 5) {
                    System.out.println("🍇");
                }
                if (i > 0 && v[i] == v[i - 1]) {
                    cnt++;
                } else{
                    cnt=0;
                }
            }
            if (cnt >=2) {
                System.out.println("You win");
            } else {
                System.out.println("you lose");
            }

    }
        public static void main (String[]args){
            SlotMachine a = new SlotMachine();
            a.pullLever();
        }
}