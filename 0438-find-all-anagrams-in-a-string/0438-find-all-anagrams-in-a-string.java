class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        // Frequency of p
        for (char ch : p.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int count = p.length();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Character is needed
            if (hm.containsKey(ch)) {

                if (hm.get(ch) > 0) {
                    count--;
                }

                hm.put(ch, hm.get(ch) - 1);
            }

            // Window size becomes p.length()
            if (right - left + 1 > p.length()) {

                char remove = s.charAt(left);

                if (hm.containsKey(remove)) {

                    hm.put(remove, hm.get(remove) + 1);

                    if (hm.get(remove) > 0) {
                        count++;
                    }
                }

                left++;
            }

            // All characters matched
            if (count == 0) {
                ans.add(left);
            }
        }

        return ans;
    }
}