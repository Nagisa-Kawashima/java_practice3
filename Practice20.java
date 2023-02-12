/*-< 演習：Ex1_13_2 >---------------------------------
コマンドライン引数で受け取った整数（A型：1, B型：2, O型：3, AB型：4）に応じて、
以下の実行結果を表示するプログラムを作成してください。
ただし、switch文を必ず使用してください。

  (A型)が入力された場合 ："あなたは几帳面な性格の方ですね？"
  (B型)が入力された場合 ："あなたはマイペースな性格の方ですね？"
  (O型)が入力された場合 ："あなたは大雑把な性格ですね？"
  (AB型)が入力された場合："あなたは天才肌な方ですね？"
  上記以外              ："数字の1～4で答えてください"

----------------------------------------------------*/
public class Practice20 {
	public static void main (String[] args) {

        final String MESSAGE_A = "あなたは几帳面な性格の方ですね";
        final String MESSAGE_B = "あなたはマイペースな性格の方ですね？";
        final String MESSAGE_C = "あなたは大雑把な性格ですね？";
        final String MESSAGE_D = "あなたは天才肌な方ですね？";
		
		int blood_type = Integer.parseInt(args[0]);

        switch (blood_type) {
            case 1:
                System.out.println(MESSAGE_A);
                break;
            
            case 2:
                System.out.println(MESSAGE_B);
                break;
            
            case 3:
                System.out.println(MESSAGE_C);
                break;
            
            case 4:
                System.out.println(MESSAGE_D);
                break;
            
                
        }
	}
}