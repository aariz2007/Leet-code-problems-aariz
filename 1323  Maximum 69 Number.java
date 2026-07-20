class Solution {
    public int maximum69Number (int num) {
    
        String numStr = Integer.toString(num);
        
       
        int index = numStr.indexOf('6');
        
      
        if (index != -1) {
            numStr = numStr.substring(0, index) + '9' + numStr.substring(index + 1);
        }
        
      
        return Integer.parseInt(numStr);
    }
}
