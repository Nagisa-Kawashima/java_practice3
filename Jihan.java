public class Jihan {
    public static void main(String[] args) {
        int coinNum = args.length - 1; //投入された硬貨の枚数
        int coinChk = 0;    //チェック対象の硬貨の金額
        int coinSum = 0;   //投入された硬貨の合計金額
        int price = Integer.parseInt(args[args.length - 1]); //購入する商品の価格
        int change = 0; //おつり
    
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
        // System.out.println("ただ今の投入金額は" + String.valueOf(coinSum) + "です");

        // おつり= 合計金額 - 購入する商品の価格
        change = coinSum - price;

        if(change > 0) {
            System.out.println(change + "円のお釣りです。ありがとうございました。");
        } else if(change == 0) {
            System.out.println("ちょうどのお預かりです。ありがとうございました。");
        } else {
            System.out.println("お金が足りないですね・・・");
        }
    }
}

