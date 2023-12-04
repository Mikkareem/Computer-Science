class Pattern {
    public void printPattern(int n) {
        int total = 2*n-1;
        int center = total / 2;
        for(int i = 0; i < total; i++) {
            for(int j = 0; j < total; j++) {
                if(i <= center) {
                    // Conditions also symmetry
                    if(j <= i || j >= total-i-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    // Conditions also symmetry
                    if(j <= total-i-1 || j >= i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.printPattern(3);
        System.out.println();
        pattern.printPattern(4);
        System.out.println();
        pattern.printPattern(5);
        System.out.println();
    }
}

/*
Input = 3
*       *
* *   * *
* * * * *
* *   * *
*       *

Input = 4
*           *
* *       * *
* * *   * * *
* * * * * * *
* * *   * * *
* *       * *
*           *

Input = 5
*               *
* *           * *
* * *       * * *
* * * *   * * * *
* * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*               *

* */
