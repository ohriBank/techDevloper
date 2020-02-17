package algo;
import java.io.*;
import java.util.*;

public class Main {

   
   static int map[][] = new int [25][25];
   static int vistedMap[][] =new int [25][25];
   static int input_count =0;
   static String mapValue ="";
   static int result_count =0;
   static int addRow [] = {-1, 0, 1, 0};
   static int addCol [] = {0,-1,0,1};
   
   static LinkedList<Integer> scale = new LinkedList<>();
   static    Queue<String> q = new LinkedList<>();
   
   
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
      
      input_count = Integer.parseInt(br.readLine()); // N*N 
      
      for(int i =0; i <input_count ; i++){
         mapValue = br.readLine();
         for(int j =0; j < input_count; j++){
            map[i][j] = mapValue.charAt(j)-'0';
            vistedMap[i][j] =0;
         }
         
      }
      
      
      
      
      for(int i =0; i <input_count ; i++){
         for(int j =0; j < input_count; j++){
            if(map[i][j] ==1 && vistedMap[i][j] ==0){ // 전단지 값이 있는곳 방문하지 않는곳
               
               scale.add(1);
               vistedMap[i][j]=1;
               
               q.add(i + ";" +j );
               
               bfs();
               
            }
         }
         
      }
      

      

   }



   private static void bfs() {
      // TODO Auto-generated method stub
      
      while (!q.isEmpty()){
         String poll = q.poll();
         int row = Integer.parseInt(poll.split(";")[0]);
         int col = Integer.parseInt(poll.split(";")[0]);
         
         for(int i = 0; i <4; i++){
            
            int row1 = row+ addRow[i];
            int co1 = col = addCol[i];
            
            if( row1<0 || row1 >input_count || co1 <0 || co1 > input_count){
               
               continue;
            }
            
            if(map[row1][co1] == 1){
               
               
            }
            
         }
         
      }
      
      
   }



}