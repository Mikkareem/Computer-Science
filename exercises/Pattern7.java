class Pattern {
    public void printPattern(int n) {
        int total = 2*n-1;
        int center = total / 2;
        for(int i = 0; i < n; i++) {
            char character = 'A';
            for(int j = 0; j < total; j++) {
                if(j >= center-i && j <= center+i) {
                    System.out.printf("%c ", character);
                    if(j < center) {
                        character++;
                    } else {
                        character--;
                    }
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
Input = 3
   A     
  A B A   
A B C B A 

Input = 6
          A           
        A B A         
      A B C B A       
    A B C D C B A     
  A B C D E D C B A   
A B C D E F E D C B A 

Input = 9
                A                 
              A B A               
            A B C B A             
          A B C D C B A           
        A B C D E D C B A         
      A B C D E F E D C B A       
    A B C D E F G F E D C B A     
  A B C D E F G H G F E D C B A   
A B C D E F G H I H G F E D C B A 

* */
