public class Print10 {
    public static void main(String[] args) {
        boolean answer1 = 5 == 3 + 2;
        System.out.println(answer1);

        boolean answer2 = 5 >= 3 + 2;
        System.out.println(answer2);

        boolean answer3 = 5 >= 3 + 2 && 10 % 3 != 1;
        System.out.println(answer3);

        boolean answer4 = ( 5 >= 3 + 2 || 2 + 8 != 9 ) && !( 6 == 2 + 4 );
        System.out.println(answer4); 

        int ques1 = 3 + (7 % 4) / 2;
        System.out.println(ques1);

        int calc2 = 10;
        int ques2 = ++calc2;
        System.out.println(calc2); 
        System.out.println(ques2); 

        int calc3 = 10;
        int ques3 = calc3++;
        System.out.println(calc3); 
        System.out.println(ques3); 

        int calc4 = 10;
        int ques4 = calc4 + 1;
        System.out.println(calc4); 
        System.out.println(ques4); 

        System.out.println('1' + '6'); //103
        System.out.println("1" + "6");



    }
    
}
