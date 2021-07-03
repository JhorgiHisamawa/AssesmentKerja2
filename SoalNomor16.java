public class SoalNomor16 {
    public static void main(String[] args) {       
        butterflyPyramid(5);
    }
        
    public static void butterflyPyramid(int input){
        for (int i = 0; i <= input; i++) {
            
            // left digits
            for (int a = 1; a <= i; a++) {
                System.out.print(a);
            }
            // left spaces
            for (int b = input; b > i; b--) {
                System.out.print(" ");
            }

            // right spaces
            for (int c = input - 1; c > i; c--) {
                System.out.print(" ");
            }
            
            // right digits
            for(int d = i; d > 0; d--){
                if(d == input) { d = i - 1;}
                System.out.print(d);
            }

            System.out.println();
        }
        for (int j = input - 1; j >= 0; j--) {
            
            // left digits
            for (int a = 1; a <= j; a++) {
                System.out.print(a);
            }
            // left spaces
            for (int b = input; b > j; b--) {
                System.out.print(" ");
            }

            // right spaces
            for (int c = input - 1; c > j; c--) {
                System.out.print(" ");
            }
            
            // right digits
            for(int d = j; d > 0; d--){
                if(d == input) { d = j - 1;}
                System.out.print(d);
            }

            System.out.println();
        }
    }
}
