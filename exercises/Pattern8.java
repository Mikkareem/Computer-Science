class Pattern {
    public void printPattern(int n) {
        int total = 2*n-1;
        int center = total / 2;
        char character = 'A';
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < total; j++) {
                if(j <= i) {
                    System.out.printf("%c ", character);
                } else {
                    System.out.print("  ");
                }
            }
            character++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern pat = new Pattern();
        pat.printPattern(3);
        System.out.println();
        pat.printPattern(6);
        System.out.println();
        pat.printPattern(9);
    }
}

/*
Input = 3
A         
B B       
C C C     

Input = 6
A                     
B B                   
C C C                 
D D D D               
E E E E E             
F F F F F F           

Input = 9
A                                 
B B                               
C C C                             
D D D D                           
E E E E E                         
F F F F F F                       
G G G G G G G                     
H H H H H H H H                   
I I I I I I I I I                 

* */
