class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> list = new ArrayList();
        Set<Integer> set = new HashSet();
        
        while(i < n1 && j < n2 && k < n3) {
            if(A[i] == B[j] && B[j] == C[k]) {
                if(set.add(A[i]))list.add(A[i]);
                i++;
                j++;
                k++;
                continue;
            }
            else if(B[j] < C[k]) {
                j++;
            }
            else if(A[i] < C[k]) {
                i++;
            }
            else {
                k++;
            }
            
            
        }
        return list;
    }
}