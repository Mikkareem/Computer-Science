class Pattern {
    public void printPattern(int n) {
        int number = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j <= i) {
                    System.out.printf("%d ", number++);
                } else {
                    System.out.print("  ");
                }
            }
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
1     
2 3   
4 5 6 

1           
2 3         
4 5 6       
7 8 9 10     
11 12 13 14 15   
16 17 18 19 20 21 

1                 
2 3               
4 5 6             
7 8 9 10           
11 12 13 14 15         
16 17 18 19 20 21       
22 23 24 25 26 27 28     
29 30 31 32 33 34 35 36   
37 38 39 40 41 42 43 44 45 

* */
