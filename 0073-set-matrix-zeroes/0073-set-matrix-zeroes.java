class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;       // Number of rows
        int m = matrix[0].length;    // Number of columns

        // We use first row and first column as markers.
        // So first remember whether they originally had a zero.
        boolean firstrowzero = false;
        boolean firstcolzero = false;


        // STEP 1: Check if FIRST ROW contains zero
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                firstrowzero = true;
            }
        }


        // STEP 2: Check if FIRST COLUMN contains zero
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                firstcolzero = true;
            }
        }


        // STEP 3: MARK
        // Ignore first row and first column.
        // If matrix[i][j] is zero,
        // mark its row and column using first column/row.
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (matrix[i][j] == 0) {

                    // Mark this ROW
                    matrix[i][0] = 0;

                    // Mark this COLUMN
                    matrix[0][j] = 0;
                }
            }
        }


        // STEP 4: MAKE ZERO
        // If row OR column is marked,
        // make the current cell zero.
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }


        // STEP 5: ZERO OUT FIRST ROW
        // Do this at the end because first row was used as a marker.
        if (firstrowzero) {

            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }


        // STEP 6: ZERO OUT FIRST COLUMN
        // Do this at the end because first column was used as a marker.
        if (firstcolzero) {

            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
