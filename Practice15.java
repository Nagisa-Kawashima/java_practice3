public class Practice15 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // コマンドライン引数で好きな数字を1つ受け取る
        int receiveNumber = Integer.parseInt(args[0]); // (10行目)アンダーバーに適切な処理を埋めてください

        // 最終的に表示するString型変数（初期値：""（0文字の文字列））
        String display = ""; // (13行目)変更しないでください

        /*
         ** 以下にreceiveNumberの数だけ「＊」を繋げた文字列を
         ** displayに格納する処理を書いてください。
         ** ※必ずfor文を使用してください。
         */

        for (int i = 0; i < receiveNumber; i++) {
            // System.out.println(display + "*");
            // display = display + "*";
            display += "*";
        }
        // 「＊」を繋げた文字列を表示
        System.out.println(display); // (32行目)変更しないでください




        // 出力元の2次元配列
        String[][] animals = {
                { "モコ", "トイプードル", "4歳", "メス" },
                { "ポチ", "シバイヌ　　", "6歳", "オス" },
                { "ムギ", "パピヨン　　", "2歳", "オス" },
                { "ブブ", "ブルドッグ　", "3歳", "メス" },
                { "シロ", "秋田犬　　　", "8歳", "オス" }
        };

        /*
         ** 以下の条件を満たす2次元配列のデータ抽出&表示する処理を書いてください。
         ** - for文を2つ組み合わせる
         ** - 「animals.length」「 animals[i].length」
         ** - 出力結果は以下になる
         ** モコ / トイプードル / 4歳 / メス
         ** ポチ / シバイヌ / 6歳 / オス
         ** ムギ / パピヨン / 2歳 / オス
         ** ブブ / ブルドッグ / 3歳 / メス
         ** シロ / 秋田犬 / 8歳 / オス
         */
        String display2 = "";
         for(int i = 0; i < animals.length; i++) {
            display2 = animals[i][0];
            for(int j = 1; j < animals[i].length; j++) {
                display2 += "/" + animals[i][j];
            }
            System.out.println(display2);
         }


        String display3 = "";
        for(int i = 1; i <= 9; i++) {
            display3 = "";
            for(int j = 1; j <= 9; j++) {
                display3 = display3 + i * j + " ";
            }
            System.out.println(display3);
        }

    }
}
