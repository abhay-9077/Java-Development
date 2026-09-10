public class Array3D {

    public static void main(String[] args) {
        int[][][] arr3D = new int[2][3][4];

        for(int i = 0; i < arr3D.length; i++) {            
            for(int j = 0; j < arr3D[i].length; j++) {       
                for(int k = 0; k < arr3D[i][j].length; k++) {
                    arr3D[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }

        // TRAVERSING AND PRINTING 
        for(int i = 0; i < arr3D.length; i++) {
            System.out.println("--- Block (Layer) " + i + " ---");
            
            for(int j = 0; j < arr3D[i].length; j++) {
                for(int k = 0; k < arr3D[i][j].length; k++) {
                    
                    // Print the column values side-by-side
                    System.out.print(arr3D[i][j][k] + " ");
                }
                // Move to the next line after a row finishes
                System.out.println(); 
            }
            // Add an extra blank line between the blocks for visual clarity
            System.out.println(); 
        }
    }
}