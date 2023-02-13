public class Practice22 {
    private String nama;
    private int age;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Practice22 user = new Practice22(); // Userクラスを格納する参照型の変数

        // リテラルで整数型の値を書くときは、通常は10進表記で書きますが、接頭辞として0b、0、0xを付与すると、2進数、8進数、16進数表記でも書けます。

        // 例えば、整数の100をそれぞれの進数で表記すると、次のようになります。

        int int2 = 0b1100100;
        System.out.println(int2);
        int int8 = 0144;
        System.out.println(int8);
        int int16 = 0x64;
        System.out.println(int16);
        // int i = 199_199;
        // System.out.println(i);


        // double diff = 0.1;
        // double sum = 0;
        float diff = 0.1F;
        float sum = 0;
        // 2進数で表現できないと、循環小数の場合、適当な値に丸められる

        for(int i = 0; i < 10; i++) {
            sum += diff;
        }
        System.out.println(sum);

    }

}
