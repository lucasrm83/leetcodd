package removeduplicates;

public class RemoveDuplicatesAlt {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,3,5};
        if(nums.length == 0)
            System.out.println(0);

        int addIndex = 1;

        for(int i = 0; i < nums.length - 1; i++) {
            //Verifica se o i do array é menor que o proximo, se não é repetido
            if(nums[i] < nums[i + 1]){
                nums[addIndex] = nums[i + 1];
                //Conta caso o arrat nao seja zero o número de intens únicos e adiciona naquele index
                //Já que não importa o que vai apos o indice k do array
                addIndex++;
            }
        }
        //System.out.println(addIndex);
        for (int n:nums) {
            System.out.println(n);

        }
    }
}


