// Last updated: 5/6/2026, 12:02:58 AM
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solver = new Solution();

        // Example 1
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        String result1 = solver.convert(s1, numRows1);
        System.out.println("Input: s = \"" + s1 + "\", numRows = " + numRows1 + ", Output: \"" + result1 + "\""); // Output: "PAHNAPLSIIGYIR"

        // Example 2
        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        String result2 = solver.convert(s2, numRows2);
        System.out.println("Input: s = \"" + s2 + "\", numRows = " + numRows2 + ", Output: \"" + result2 + "\""); // Output: "PINALSIGYAHRPI"

        // Example 3
        String s3 = "A";
        int numRows3 = 1;
        String result3 = solver.convert(s3, numRows3);
        System.out.println("Input: s = \"" + s3 + "\", numRows = " + numRows3 + ", Output: \"" + result3 + "\""); // Output: "A"
    }
}