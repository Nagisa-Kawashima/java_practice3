public class Cake {
    public static void main(String[] args) {
        //定数を定義する
        final String CAKE_NAME_SHT = "ショートケーキ";
        final int CAKE_PRICE_SHT = 320;
        
        final String CAKE_NAME_MNB = "モンブラン";
        final int CAKE_PRICE_MNB = 350;

        final String CAKE_NAME_CHO = "チョコレートケーキ";
        final int CAKE_PRICE_CHO = 370;

        final String CAKE_NAME_ICH = "イチゴのタルト";
        final int CAKE_PRICE_ICH = 400 ;

        final String CAKE_NAME_CHZ = "チーズケーキ";
        final int CAKE_PRICE_CHZ = 300 ;

        final int DISCOUNT_APPLYING_PRICE = 1000; //割引が適用される金額
        final double DISCOUNT_RATE = 0.8; //割引率
        final double TAX = 1.08;  //消費税


        String checkCakeName = ""; //処理対象のケーキ名
        int checkCakeCount = 0; //処理対象のケーキの個数
        int totalPrice = 0; // 合計金額
        int payment = 0;    //支払い金額　　割引後の金額になるので、合計金額と湧けて考えないといけない


        for(int i = 0; i < args.length; i+= 2) {
            checkCakeName = args[i];
            checkCakeCount = Integer.parseInt(args[i + 1]);//全角でも入力出来るようにする為

            switch(checkCakeName) {
                case CAKE_NAME_SHT:
                totalPrice += CAKE_PRICE_SHT * checkCakeCount;
                break;
                case CAKE_NAME_MNB:
                totalPrice += CAKE_PRICE_MNB * checkCakeCount;
                break;
                case CAKE_NAME_CHO:
                totalPrice += CAKE_PRICE_CHO * checkCakeCount;
                break;
                case CAKE_NAME_ICH:
                totalPrice += CAKE_PRICE_ICH * checkCakeCount;
                break;
                case CAKE_NAME_CHZ:
                totalPrice += CAKE_PRICE_CHZ * checkCakeCount;
                break;

                
            }
        }

        if(totalPrice >DISCOUNT_APPLYING_PRICE) {
            payment = (int)(totalPrice * DISCOUNT_RATE * TAX);
        } else {
            payment = (int)(totalPrice * TAX);
        }

        System.out.println("合計金額は" + payment + "円です");



    }
}
