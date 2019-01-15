public class Aufgabe1 {

    static int zähler3=1;
    static int c=0;

    public static void main(String[] args) {


        try {

            for (int i=0; i<10; i++) {
                for (int j = 1; j < 6; j++) {
                    System.out.println(j);
                }
            }

            int x=1;
            while (x<11) {
                int y=1;
                while (y<6) {
                    System.out.print(y);
                    y++;
                }
                System.out.println();
                x++;
            }


        }catch (Exception e){
            System.err.println("Fehler");
        }finally {
            System.out.println("");
            System.err.println("finally Anweisung");
        }

        addieren(5);

    }

    public static void addieren(int a){
        c = c+zähler3++;
        System.out.println(c);

        if (a==1){
            System.out.println(c);
        }
        else {
            addieren(a-1);
        }
    }
}
