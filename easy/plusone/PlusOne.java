package plusone;

public class PlusOne {
    public static void main(String[] args) {
        int [] digits = {9};
        int pointer =0;
        for (int i = 0; i <digits.length ; i++) {
            if (i == 9){
                pointer++;


            }else {
                pointer=(pointer*10)+digits[i];
            }


        }
        pointer++;
        System.out.println(pointer);

    }
}
