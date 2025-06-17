public class NapSack {
    public static void main(String[] args) {
        int[] weights={2,1,4,5};
        int[] profits={20,17,30,11};
        System.out.println(napSack(5, 0,weights, profits));
        
    }
    public static int napSack(int bagweight,int selectedElement,int []weights,int[] profits){
        if(selectedElement>=weights.length || bagweight==0){
            return 0;
        }
        int pick=0;
        if(bagweight>=weights[selectedElement]){
            pick=profits[selectedElement]+napSack(bagweight-weights[selectedElement], selectedElement+1, weights, profits);
        }
        int notpick=napSack(bagweight, selectedElement+1, weights, profits);
        return Math.max(pick,notpick);
    }
    
}
