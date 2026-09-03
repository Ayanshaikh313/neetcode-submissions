class Solution {
    public boolean isAnagram(String s, String t) {
      int n= s.length();
      int l = t.length();
      if(n != l) return false;
      if (s.equals(t))return true;
      HashMap<Character, Integer> mpp_s = new HashMap<>();
      HashMap<Character, Integer> mpp_t = new HashMap<>();
      for(int i=0; i<n; i++){
        mpp_s.put(s.charAt(i), mpp_s.getOrDefault(s.charAt(i) , 0)+1);
      }
      for(int i=0; i<l; i++){
        mpp_t.put(t.charAt(i), mpp_t.getOrDefault(t.charAt(i) , 0)+1);
      }
      return mpp_s.equals(mpp_t);
    }
}
