class Solution {
    public boolean isAnagram(String s, String t) {

        char[] arr = new char[s.length()];

        arr = s.toCharArray();


         char[] arr1 = new char[t.length()];

        arr1 = t.toCharArray();

        Arrays.sort(arr);

        Arrays.sort(arr1);

        if(Arrays.equals(arr,arr1))
        {
            return true;
        }

        return false;

        
    }
}