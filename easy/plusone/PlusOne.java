package plusone;

public class PlusOne {
    public static void main(String[] args) {
        int [] digits = {1,2,3};
        int pointer =0;
        for (int i = 0; i <digits.length ; i++) {
            if (i == 9){
                pointer=(pointer+i)+i*10;


            }

        }

    }
}
