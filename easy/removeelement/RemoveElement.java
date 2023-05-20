package removeelement;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2};
        int val = 3;
        int k =0;

        for (int i = 0; i <=nums.length-1 ; i++) {
            if (nums[i] !=val){
                nums[k] = nums[i];
                // enquanto o [i] for diferente do var adiciona esse numero na posição k e incrementa k
                // se [i] for val não vai cair nessa condição, mas como k foi incrementado ele vai
                // apontar para o proximo indece da ultima ocorrencia de nums[i] != val, ou seja para val
                // ai quando outro numero diferente de val aparecer vai ser incrementado no indece de val,
                // removendo ele
                k++;
            }

        }
        System.out.println(k);
    }
}
