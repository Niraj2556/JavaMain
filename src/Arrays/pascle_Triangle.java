package Arrays;

import java.util.ArrayList;
import java.util.List;

public class pascle_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            for(int j=1; j<i; j++){
                int sum = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                temp.add(sum);
            }
            if(i!=0){
                temp.add(1);
            }
            list.add(temp);
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(generate(n));
    }
}
