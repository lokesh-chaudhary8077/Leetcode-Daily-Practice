// Last updated: 3/18/2026, 9:20:47 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> result = new ArrayList<>();
4        List<Integer> ls = new ArrayList<>();
5        if(numRows == 0) return result;
6        ls.add(1);
7        result.add(ls);
8        if(numRows == 1) return result;
9        for(int i = 1;i < numRows;i++){
10            List<Integer> preRow = result.get(i-1);
11            ArrayList<Integer> row = new ArrayList<>();
12            row.add(1);
13            for(int j = 0;j < i-1;j++){
14                row.add(preRow.get(j) + preRow.get(j+1));
15            }
16            row.add(1);
17            result.add(row);
18        }
19        return result;
20    }
21}