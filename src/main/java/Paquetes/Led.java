package Paquetes;


public class Led {

    /**Transforma un numero en formato String a numero led digital.
     *
     * @param arg
     * 
     */
    public void numeroAled(String arg) {
       
        
        int numberOfChars = arg.length();
        int[][][] chars = new int[numberOfChars][3][3];
        int[][] uno = {{0,0,0}, {0,0,1}, {0,0,1}};
        int[][] dos = {{0,1,0}, {0,1,1}, {1,1,0}};
        int[][] tres = {{0,1,0}, {0,1,1}, {0,1,1}};
        int[][] cuatro = {{0,0,0}, {1,1,1}, {0,0,1}};
        int[][] cinco = {{0,1,0}, {1,1,0}, {0,1,1}};
        int[][] seis = {{0,1,0}, {1,1,0}, {1,1,1}};
        int[][] siete = {{0,1,0}, {0,0,1}, {0,0,1}};
        int[][] ocho = {{0,1,0}, {1,1,1}, {1,1,1}};
        int[][] nueve = {{0,1,0}, {1,1,1}, {0,1,1}};
        int[][] cero = {{0,1,0}, {1,0,1}, {1,1,1}};
        int[][] negativo = {{0,0,0}, {0,1,0}, {0,0,0}};
        int[][] punto = {{0,0,0}, {0,0,0}, {0,0,1}};
        int i, j, k;
         
        for(i=0; i<numberOfChars; i++){
            if(arg.charAt(i)=='1') chars[i] = uno;
            else if(arg.charAt(i)=='2') chars[i] = dos;
            else if(arg.charAt(i)=='3') chars[i] = tres;
            else if(arg.charAt(i)=='4') chars[i] = cuatro;
            else if(arg.charAt(i)=='5') chars[i] = cinco;
            else if(arg.charAt(i)=='6') chars[i] = seis;
            else if(arg.charAt(i)=='7') chars[i] = siete;
            else if(arg.charAt(i)=='8') chars[i] = ocho;
            else if(arg.charAt(i)=='9') chars[i] = nueve;
            else if(arg.charAt(i)=='0') chars[i] = cero;
            else if(arg.charAt(i)=='.') chars[i] = punto;
            else chars[i] = negativo;
        }
         
        for (j = 0; j < 3; j++) {
            for (i = 0; i < numberOfChars; i++) {
                for (k = 0; k < 3; k++) {
                    if (chars[i][j][k] == 1) {
                        if (k == 1) System.out.print("_");
                        else System.out.print("|");
                    }
                    else System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
