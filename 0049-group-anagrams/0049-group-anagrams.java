class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        List<List<String>> outer = new ArrayList<>();

        for(int i=0;i<strs.length;i++)
        {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(!hm.containsKey(s))
            {
                hm.put(s, new ArrayList<>());

            }


            hm.get(s).add(strs[i]);



        }

        for(List<String> val : hm.values())
        {
            outer.add(val);
        }


        return outer;
        
        
    }
}