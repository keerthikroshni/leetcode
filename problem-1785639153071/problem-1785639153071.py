# Last updated: 8/2/2026, 8:22:33 AM
1
2class Solution(object):
3    def gcd(self,a,b):
4        while b:
5            a,b=b,a%b
6        return a
7    def maxPairStrength(self, nums):
8        ans=0
9        n=len(nums)
10        for i in range(n):
11            for j in range(i+1,n):
12                g=self.gcd(nums[i],nums[j])
13                strength=(nums[i]*nums[j])//(g*g)
14                ans=max(ans,strength)
15        return ans
16        