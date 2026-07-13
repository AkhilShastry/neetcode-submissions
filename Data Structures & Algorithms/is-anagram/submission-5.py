class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_map = {}
        t_map = {}
        for c_s in s:
            s_map[c_s] = s_map.get(c_s, 0) + 1
        for c_t in t:
            t_map[c_t] = t_map.get(c_t, 0) + 1
        return s_map == t_map
