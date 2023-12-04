class Pattern {
    public void printPattern(int n) {
        int totalRows = 2*n-1;
        int center = (totalRows) / 2;

        for(int i = 0; i < totalRows; i++) {
            for(int j = 0; j < totalRows; j++) {
                int maxDistanceFromCenter = Math.max(Math.abs(center-i), Math.abs(center-j));
                System.out.print((1 + maxDistanceFromCenter) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.printPattern(6);
    }
}

/*
https://bit.ly/3vtRNJJ
* Input = 5
*
* Output:
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
*
*
* Input = 6
*
* Output:
6 6 6 6 6 6 6 6 6 6 6
6 5 5 5 5 5 5 5 5 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 2 1 2 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 5 5 5 5 5 5 5 5 6
6 6 6 6 6 6 6 6 6 6 6 
* */
