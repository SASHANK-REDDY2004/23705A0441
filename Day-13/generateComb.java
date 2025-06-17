public class generateComb {
    public static void main(String[] args) {
        generateCombinations("abc", 0, " ");
        
    }
    public static void generateCombinations(String str,int index,String result){
        if(index==str.length()){
            System.out.println(result.length()!=0?result:"emptyset");
            return;
        }
        generateCombinations(str, index+1, result+str.charAt(index));
        generateCombinations(str, index+1, result);
    }
}
