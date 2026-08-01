public class AlternatingGroup_I {
    
    public int numberOfAlternatingGroups(int[] colors) {
       int count=0;
       for(int i=0;i<colors.length;i++){
        int first=colors[i];
        int second=colors[(i+1)%colors.length];
        int third=colors[(i+2)%colors.length];

        if(first!=second&&second!=third){
            count++;
        }
       } 
       return count;
    }
}

