// Last updated: 5/6/2026, 12:02:06 AM
class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        // Build the adjacency list representing connected components
        for (List<Integer> pair : pairs) {
            int u = pair.get(0);
            int v = pair.get(1);
            adj[u].add(v);
            adj[v].add(u);
        }

        char[] sArr = s.toCharArray();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> indices = new ArrayList<>();
                List<Character> chars = new ArrayList<>();
                dfs(i, adj, visited, indices, chars, sArr);
                Collections.sort(indices);
                Collections.sort(chars);
                for (int j = 0; j < indices.size(); j++) {
                    sArr[indices.get(j)] = chars.get(j);
                }
            }
        }

        return new String(sArr);
    }

    private void dfs(int u, List<Integer>[] adj, boolean[] visited, List<Integer> indices, List<Character> chars, char[] sArr) {
        visited[u] = true;
        indices.add(u);
        chars.add(sArr[u]);
        for (int v : adj[u]) {
            if (!visited[v]) {
                dfs(v, adj, visited, indices, chars, sArr);
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        String s1 = "dcab";
        List<List<Integer>> pairs1 = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2));
        String result1 = sol.smallestStringWithSwaps(s1, pairs1);
        System.out.println("Input: s = \"" + s1 + "\", pairs = " + pairs1 + ", Output: \"" + result1 + "\""); // Output: "bacd"

        // Example 2
        String s2 = "dcab";
        List<List<Integer>> pairs2 = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2));
        String result2 = sol.smallestStringWithSwaps(s2, pairs2);
        System.out.println("Input: s = \"" + s2 + "\", pairs = " + pairs2 + ", Output: \"" + result2 + "\""); // Output: "abcd"

        // Example 3
        String s3 = "cba";
        List<List<Integer>> pairs3 = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2));
        String result3 = sol.smallestStringWithSwaps(s3, pairs3);
        System.out.println("Input: s = \"" + s3 + "\", pairs = " + pairs3 + ", Output: \"" + result3 + "\""); // Output: "abc"
    }
}