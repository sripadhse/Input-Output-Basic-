import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class test
{
 public static void main(String[] args) {
  new Thread(null, new Runnable() {
   public void run() {
                solve();
            }
        }, "1", 1 << 26).start();
 }
 static void solve () {
   FastReader fr =new FastReader(); PrintWriter op =new PrintWriter(System.out);

   int t =fr.nextInt() ; long k ,m ,n ,dm ,i ,j ,l ,mn ;
   while (t-->0) {
    k =fr.nextLong() ; m =fr.nextLong() ; n =fr.nextLong() ;
    if (n>1) {
    i =0 ; mn =Integer.MAX_VALUE ;
     if (k<m) {
     while (k<m) { ++i ; k*=n ; }
    }
    else {
     dm =k-m ; mn =dm%2l + dm/2l ;
     k *= n ; ++i ;
    }
     dm =k-m ; l =i ;
     while (dm>0 && l>0) {
      j =dm%n ; dm /= n ;
      j =j%2l + j/2l ; i += j ;
      --l ;
     }
     if (dm>0) i += (dm%2l + dm/2l) ;
     op.println(Math.min(i,mn)) ;
    }
    else {
     k -= m ; op.println((k%2l + k/2l)) ;
    }
   }
  op.flush(); op.close();
 }
 static class FastReader {
  BufferedReader br;
  StringTokenizer st;

  public FastReader() {
   br =new BufferedReader(new InputStreamReader(System.in));
  }

  String next() {
   while (st==null || (!st.hasMoreElements())) 
   {
    try
    {
     st =new StringTokenizer(br.readLine());
    }
    catch(IOException e)
    {
     e.printStackTrace();
    }
    
   }
   return st.nextToken();
  }

  String nextLine() {
   String str ="";

   try
   {
    str =br.readLine();
   }
   catch(IOException e)
   {
    e.printStackTrace();
   }

   return str;
  }

  int nextInt() {
   return Integer.parseInt(next());
  }

  long nextLong() {
   return Long.parseLong(next()) ;
  }
 }
}