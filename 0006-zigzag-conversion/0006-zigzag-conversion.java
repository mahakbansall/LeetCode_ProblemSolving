class Solution {

    public String convert(String s, int numRows) {

        // Edge case
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        String[] rows = new String[numRows];

        // Initialize
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int currentRow = 0;
        boolean goingDown = true;

        for (int i = 0; i < s.length(); i++) {

            rows[currentRow] += s.charAt(i);

            // Direction change
            if (currentRow == numRows - 1) {
                goingDown = false;
            } else if (currentRow == 0) {
                goingDown = true;
            }

            // Move
            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }

        // Combine all rows
        String result = "";
        for (int i = 0; i < numRows; i++) {
            result += rows[i];
        }

        return result;
    }
}