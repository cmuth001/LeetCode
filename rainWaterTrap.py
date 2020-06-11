class Solution(object):
    def trap(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        total_water = 0
        l_max = 0
        r_max = 0
        l = 0
        r = len(height) - 1
        while r > l:
            if height[l]<height[r]:
                if height[l] >= l_max:
                    l_max = height[l]
                else:
                    total_water += l_max - height[l]
                
                l += 1
            else:
                if height[r] >= r_max:
                    r_max = height[r]
                else:
                    total_water += r_max - height[r]
                
                r -= 1
        return total_water
