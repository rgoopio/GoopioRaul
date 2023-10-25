public class Act1 {

    public static void main(String[] args) {
        ChairsAndTable();
    }

    public static void ChairsAndTable() {
        String[] table = {
            "X                        X",
            "X                        X",
            "X       XXXXXXXXXX       X",
            "XXXXX   X        X   XXXXX",
            "X   X   X        X   X   X",
            "X   X   X        X   X   X"
        };

        for (String line : table) {
            System.out.println(line);
        }
    }
}