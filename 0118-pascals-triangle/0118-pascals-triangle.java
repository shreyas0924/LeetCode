class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();

		for(int i=0; i<numRows; i++){
			ArrayList<Integer> temp = new ArrayList<>();

			for(int j=0; j<=i; j++){
				if(j==0 || j==i) temp.add(1); // means the start and end of a row
				// else go to the previous row and add both of the upper elements and put in the temp row.
				else{
					temp.add(list.get(i-1).get(j-1) + list.get(i-1).get(j)); 
				}
			}
			list.add(temp);
		}
		return list;
	}
}