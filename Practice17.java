/*-< 演習：Ex1_11_1 >---------------------------------
while文を使用して、6の目がでるまでサイコロを降り続けるプログラムを作成してください。
※1～6までのランダムなint型の値を取得する方法 ： 1 + (int)(Math.random() * 6.0)
※6の目が出たら「6が出たのでを終了します」と表示してください
----------------------------------------------------*/


public  class Practice17 {
    public static void main (String[] args) {
		
		int receiveNumber = 0;
		
		// receiveNumber = 1 +(int)(Math.random() * 6.0); 
        // System.out.println(receiveNumber);
		
		while( receiveNumber != 6 ){
		    receiveNumber = 1 +(int)(Math.random() * 6.0); 
			
			System.out.println(receiveNumber);
			
		} 
        System.out.println("6が出たので終了します");
        // ------------------------------------------------------------------
        int dice = 0;
        do {
            dice = 1 + (int)(Math.random() * 6.0);
            System.out.println(dice);
        }while(dice != 6); 
        System.out.println("6が出たので終了します");

		
		
		
		
		
		
		
	}
}