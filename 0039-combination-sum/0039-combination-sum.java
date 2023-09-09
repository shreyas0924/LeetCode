class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        dfs(res,candidates,0,new ArrayList<Integer>(),0,target);
        return res;

    }
    public void dfs(List<List<Integer>> res,int[] candidates,int i,List<Integer> curr,int total,int target){
        if(total==target){
            res.add(new ArrayList(curr));
            return;
        }
        if(i>=candidates.length || total>target){
            return;
        }
        curr.add(candidates[i]);
        dfs(res,candidates,i,curr,total+candidates[i],target);
        if(curr.size()>0) curr.remove(curr.size()-1);
        dfs(res,candidates,i+1,curr,total,target);
    }
    
}