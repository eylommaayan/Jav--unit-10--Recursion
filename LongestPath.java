public class LongestPath {
    public static int longestPath(int[][] mat, int x, int y) {
        return longestPath(mat, x, y, 0, 0);
    }

    private static int longestPath(int[][] mat, int x, int y, int i, int j) {
        // תנאי עצירה במקרה של יציאה מגבולות המטריצה או על תא שכבר ביקרנו בו
        if (i < 0 || i >= mat.length || j < 0 || j >= mat[0].length || mat[i][j] == 0) {
            return Integer.MIN_VALUE;
        }
        // תנאי עצירה כשהגענו לתא היעד
        if (i == x && j == y) {
            return 0;
        }

        // שמירת הערך המקורי של התא
        int temp = mat[i][j];
        // סימון התא כדי למנוע ביקורים חוזרים
        mat[i][j] = 0;

        // חישוב השבילים האפשריים בארבעה כיוונים
        int up = 1 + longestPath(mat, x, y, i - 1, j);
        int down = 1 + longestPath(mat, x, y, i + 1, j);
        int right = 1 + longestPath(mat, x, y, i, j + 1);
        int left = 1 + longestPath(mat, x, y, i, j - 1);

        // החזרת הערך המקורי של התא
        mat[i][j] = temp;

        // החזרת הערך המקסימלי מבין כל הכיוונים
        return Math.max(Math.max(up, down), Math.max(right, left));
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 1, 1},
            {0, 1, 0, 1},
            {1, 1, 1, 1},
            {1, 0, 1, 1}
        };
        System.out.println("The longest path is: " + longestPath(mat, 3, 3));
    }
}
