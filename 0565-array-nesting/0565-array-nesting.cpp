class Solution {
public:
    int arrayNesting(vector<int>& nums) {
        int n = nums.size();
        vector<bool>visited(n,false);

        int ans = 0;
        for(int i = 0; i < n; i++)
        {
            if(visited[i])
            continue;

            int count = 0;
            int current = i;

            while(!visited[current]){
                visited[current] = true;
                current = nums[current];
                count++;
            } 
            ans = max(ans,count);
        }
        return ans;
    }
};