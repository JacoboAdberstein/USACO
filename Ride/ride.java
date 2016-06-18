/*
ID: jadbers1
LANG: JAVA
PROG: ride
*/
import java.io.*;
import java.util.*;

public class ride {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

        String comet = f.readLine();
        String group = f.readLine();

        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H","I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        
        int cometNum = 1;
        int groupNum = 1;
        
        
        
        for(int i = 0; i<comet.length(); i++){

        for(int j=0; j<alphabet.length; j++){

                if(comet.substring(i,i+1).equals(alphabet[j])){

                    cometNum *= j+1;
                }
            }
        }

        
       for(int m = 0; m<group.length(); m++){

            for(int n=0; n<alphabet.length; n++){

                if(group.substring(m,m+1).equals(alphabet[n])){

                    groupNum *= n+1;
                }
            }
        }
        
    if((cometNum%47)==(groupNum%47)){
        out.println("GO"); 
    }else{
        out.println("STAY");
    }
        
        out.close();
    }
    
}



