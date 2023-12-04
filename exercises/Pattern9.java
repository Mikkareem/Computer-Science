class Pattern {
    public void printPattern(int n) {
        for(int i = 0; i < n; i++) {
            char character = 'A';
            for(int j = 0; j < n; j++) {
                if(j < n-i) {
                    System.out.printf("%c ", character);
                } else {
                    System.out.print("  ");
                }
                character++;
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
Input = 3
A B C 
A B   
A     

Input = 6
A B C D E F 
A B C D E   
A B C D     
A B C       
A B         
A           

Input = 9
A B C D E F G H I 
A B C D E F G H   
A B C D E F G     
A B C D E F       
A B C D E         
A B C D           
A B C             
A B               
A                 


* */
