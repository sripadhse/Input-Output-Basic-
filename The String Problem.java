import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
       
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        
         for(int t=0;t<test;t++){
            
        boolean flageA = false;
        String str = br.readLine();
        boolean arr[]= new boolean[255];
        
       
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)] = true;
        }
        if(arr['a']&&arr['e']&&arr['i']&&arr['o']&&arr['u'] || 
        arr['A']&&arr['E']&&arr['I']&&arr['O']&&arr['U'])
            {
               flageA=true; 
            }
            System.out.println(!flageA?"ugly string":"lovely string");
    
         }
    }
}