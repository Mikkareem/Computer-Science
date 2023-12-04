class Pattern {
    public void printPattern(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int iDistance = Math.abs(n-i);
                int jDistance = Math.abs(n-j);
                if(iDistance == n || jDistance == n || iDistance == 1 || jDistance == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.printPattern(10);
    }
}

/*
https://bit.ly/3vBpdpy
* Input = 5
*
* Output:
- - - - -
-       -
-       -
-       -
- - - - -
*
*
* Input = 6
*
* Output:
- - - - - -
-         -
-         -
-         -
-         -
- - - - - -
* */
