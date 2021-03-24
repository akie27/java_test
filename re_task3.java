public class re_task3 {
    private static void printLine(int lineWidth, int blackWidth) {
        // 最初の □ を出力
        for (int j = 0; j < (lineWidth - blackWidth) / 2; j++) {
            System.out.print("□");
        }
        // 真ん中の ■ を出力
        for (int j = 0; j < blackWidth; j++) {
            System.out.print("■");
        }
        // 最後の □ を出力
        for (int j = 0; j < (lineWidth - blackWidth) / 2; j++) {
            System.out.print("□");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        int n = 9;
        if (n % 2 == 0) {
            // 1行進むごとに段々 ■ が増えてくる部分
            for (int i = 1; i <= n / 2; i++) {
                // i 行目には 2 * i 個の ■ がある。
                printLine(n, 2 * i);
            }
            // 1行進むごとに段々 ■ が減ってくる部分
            for (int i = n / 2; i > 0; i--) {
                printLine(n, 2 * i);
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                printLine(n, 2 * i + 1);
            }
            for (int i = n / 2; i >= 0; i--) {
                printLine(n, 2 * i + 1);
            }
        }
    }
}
