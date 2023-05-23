package firstocurrenceinastring;

public class FirstString {
    public static void main(String[] args) {
        String haystack = "xlasun";
        String needle="sun";
        int hay = haystack.length();
        int need = needle.length();

        if(hay < need){
            //se for menor não contem
            System.out.println("menor");

        }

        for (int i = 0; i <=hay-need ; i++) {
            int j =0;
            while(j<need && haystack.charAt(i+j)== needle.charAt(j)){
                j++;
                //conta a ocorrencia daquele char

            }
            if (j==need){
                //compara se os tamanhos sao iguais
                System.out.println(i);
            }
        }
        System.out.println("nao tem");



    }
}
