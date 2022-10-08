public class App {
    public static void main(String[] args) throws Exception {
        //creating star patterns with looping

        //00. Pyramid with Number
        System.out.println("\nPyramid with number");
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //     System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //1. right angle triangle
        // System.out.println("Right angle triangle");
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //2. inverted right angle triangle
        // System.out.println("\nInverted right angle triangle");
        // for(int i=1; i<=5; i++){
        //     for(int j=5; j>=i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //3. equilateral triangle
        // System.out.println("\nEquilateral triangle");
        // for(int i=1; i<=5; i++){
        //     for(int j=5; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //4. inverted equilateral triangle
        // System.out.println("\nInverted equilateral triangle");
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=5; k>=i; k--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //5. diamond
        // System.out.println("\nDiamond");
        // for(int i=1; i<=5; i++){
        //     for(int j=5; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //6. inverted diamond
        // System.out.println("\nInverted diamond");
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=5; k>=i; k--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //7. hollow right angle triangle
        // System.out.println("\nHollow right angle triangle");
        // for(int i=1; i<=10; i++){
        //     for(int j=1; j<=i; j++){
        //         if(i==1 || i==10 || j==1 || j==i){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // //8. hollow inverted right angle triangle
        // System.out.println("\nHollow inverted right angle triangle");
        // for(int i=1; i<=10; i++){
        //     for(int j=10; j>=i; j--){
        //         if(i==1 || i==10 || j==1 || j==i){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // //9. hollow equilateral triangle
        // System.out.println("\nHollow equilateral triangle");
        // for(int i=1; i<=5; i++){
        //     for(int j=5; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         if(i==1 || i==5 || k==1 || k==i){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // //10. hollow inverted equilateral triangle
        // System.out.println("\nHollow inverted equilateral triangle");
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=5; k>=i; k--){
        //         if(i==1 || i==5 || k==1 || k==i){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // //11. hollow diamond
        // System.out.println("\nHollow diamond");
        // for(int i=1; i<=5; i++){
        //     for(int j=5; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         if(i==1 || i==5 || k==1 || k==i){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // //12. hollow inverted diamond
        // System.out.println("\nHollow inverted diamond");
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=5; k>=i; k--){
        //         if(i==1 || i==5 || k==1 || k==i){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // //13. pyramid
        // System.out.println("\nPyramid");
        // for(int i=1; i<=5; i++){
        //     for(int j=5; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("* ");
        //     }
        //     for(int l=2; l<=i; l++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //14. inverted pyramid
        // System.out.println("\nInverted pyramid");
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=5; k>=i; k--){
        //         System.out.print("* ");
        //     }
        //     for(int l=4; l>=i; l--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //15. hollow pyramid
        // System.out.println("\nHollow pyramid");
        // for(int i=1; i<=5; i++){
        //     for(int j=5; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         if(i==1 || i==5 || k==1 || k==i){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     for(int l=2; l<=i; l++){
        //         if(i==1 || i==5 || l==1 || l==i){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // //16. hollow inverted pyramid
        // System.out.println("\nHollow inverted pyramid");
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=5; k>=i; k--){
        //         if(i==1 || i==5 || k==1 || k==i){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     for(int l=4; l>=i; l--){
        //         if(i==1 || i==5 || l==1 || l==i){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        // //17. half diamond
        // System.out.println("\nHalf diamond");
        // for(int i=1; i<=5; i++){
        //     for(int j=5; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=5; k>=i; k--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //18. half diamond with number
        // System.out.println("\nHalf diamond with number");
        // for(int i=1; i<=5; i++){
        //     for(int j=5; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print(k+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=5; k>=i; k--){
        //         System.out.print(k+" ");
        //     }
        //     System.out.println();
        // }

        // //19. half diamond with alphabet
        // System.out.println("\nHalf diamond with alphabet");
        // for(int i=1; i<=5; i++){
        //     for(int j=5; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print((char)(k+64)+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=5; k>=i; k--){
        //         System.out.print((char)(k+64)+" ");
        //     }
        //     System.out.println();
        // }
        }
    }
}
