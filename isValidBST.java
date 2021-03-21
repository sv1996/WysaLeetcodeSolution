// OptimizedVersion


class Solution {
        public  boolean isValidBST(TreeNode root) {
			return isValidBST(root,Integer.MIN_VALUE , Integer.MAX_VALUE);
    }

		public  boolean isValidBST(TreeNode root , int  lowerLimit, int  upperLimit) {
			if(root == null)
            {
              return true;

            }
            
            
			if(root.val <= lowerLimit || root.val >= upperLimit ) 
            {
                 return false ;

            }
            
    return isValidBST(root.right , root.val , upperLimit) && isValidBST(root.left , lowerLimit , root.val);
    }
    
// Another Solution

public static int maximum( TreeNode root){
		if(root==null){
			return Integer.MIN_VALUE;
		}
	return Math.max(root.val,Math.max(maximum(root.left),maximum(root.right)));	
	}
	public static int   minimum( TreeNode root){
		if(root==null){
			return Integer.MAX_VALUE;
		}
return Math.min(root.val, Math.min(minimum(root.left), minimum(root.left)));		
		}
	
	
	public static boolean  isValidBST( TreeNode root) {
		if(root==null){
			return true;
		}
		
	int leftMax=maximum(root.left);
	int rightMin=minimum(root.right);
		if(root.val<=leftMax){
			return false;
		}
		if(root.val>rightMin){
			return false;
		}
		boolean isLeftBST =  isValidBST(root.left);
		boolean isRightBST =  isValidBST(root.right);
		
		if(isLeftBST &&isRightBST ){
			return true;
		}
		else{
			return false;
		}
		
}


