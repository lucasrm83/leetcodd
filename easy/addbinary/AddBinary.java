package addbinary;

public class AddBinary {
    public static void main(String[] args) {
        String a = "11111";
        String b = "111";
        StringBuilder res = new StringBuilder();
        int v1 = a.length()-1;
        int v2 = b.length()-1;
        int p = v1>v2 ? v1 : v2;
        int carry = 0;
        for (int i = p; i > -1; i--) {
            int soma = carry;
            if(v1>=0){
                soma+=a.charAt(v1) -'0';
                v1--;
            }
            if (v2>=0){
                soma+=b.charAt(v2)-'0';
                v2--;
            }
            carry = soma >1 ? 1:0;
            System.out.println(soma);
            res.append(soma%2);

        }
        if (carry !=0) res.append(carry);
        System.out.println(res.reverse());

    }
}
