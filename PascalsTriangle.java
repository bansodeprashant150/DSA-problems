import java.util.*;

public class PascalsTriangle {

    public static void main(String[] args) {
        int numRows=5;

        PascalsTriangle obj=new PascalsTriangle();
        List<List<Integer>> result=obj.generate(numRows);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
        
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Triangle=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer>rows=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    rows.add(1);
                }

                else{
                    int left=Triangle.get(i-1).get(j-1);
                    int right=Triangle.get(i-1).get(j);
                    rows.add(left+right);
                }
            }

            Triangle.add(rows);
        }

        return Triangle;
    }
}

