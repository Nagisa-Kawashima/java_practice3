public class Practice21 {
    public static void main(String[] args) {
        // int total = Integer.parseInt(args.length);
        // int money = total;

        // if(money == 1) {
        //     System.out.println("１円玉は使えません");
        // } else if(money == 5) {
        //     System.out.println("５円玉は使えません");
        // } else if(money == 777) {
        //     System.out.println("777は硬貨として適切な値ではありません");
        // }

            int coinNum = args.length; //投入された硬貨の枚数
            int coinChk = 0;    //チェック対象の硬貨の金額
            int coinSum = 0;   //投入された硬貨の合計金額

            for(int i = 0; i < coinNum; i++) {
                coinChk = Integer.parseInt(args[i]);

                if(coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500) {
                    coinSum += coinChk;
                } else if(coinChk == 1 || coinChk == 5) {
                    System.out.println("警告:" + String.valueOf(coinChk) + "円玉は使えません");
                } else {
                    System.out.println("警告:" + String.valueOf(coinChk) + "は硬貨として適切な値ではありません");
                }
            }
            System.out.println("ただ今の投入金額は" + String.valueOf(coinSum) + "です");

    }   
}
