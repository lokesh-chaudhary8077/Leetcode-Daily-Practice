// Last updated: 2/2/2026, 10:35:51 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3      List<List<Integer>> result = new ArrayList<>();
4       List<Integer> l2 = new ArrayList<>();
5       if(numRows == 0) return result;
6       l2.add(1);
7       result.add(l2);
8      if(numRows == 1){
9        return result;
10      }
11      for(int i = 1;i < numRows;i++){
12            List<Integer> preRow = result.get(i-1);
13            ArrayList<Integer> row = new ArrayList<>();
14            row.add(1);
15            for(int j = 0;j < i -1 ;j++){
16                row.add(preRow.get(j) + preRow.get(j+1));
17            }
18            row.add(1);
19            result.add(row);
20      }  
21      return result;
22    }
23}