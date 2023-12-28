package Matrix;

public class search {
      public static void searchNumber(int mat[][], int x)
      {
         for(int i=0;i<3;i++)
         {
            for(int j=0;j<4;j++)
            {
                if(mat[i][j]==x)
                {
                    System.out.print("found at"+ i+","+j);
                    return;
                }  
            } 
        }
        System.out.print("NOT FOUND");
    }
    //efficient solution
    // public static void searchNumber(int mat[][], int x)
    //{
    // int i=0;j=3;
    //while(i<3&& j>=0)
    //{if(mat[i][j]==x)
    //{
        //System.out.print("found at"+i+" "+j);
        //return;
    //}
    //elae if(mat[i][j]>x)
    //j--;
    //else
    //i++;
    //}
    //System.out.print("NOT FOUND");
    //}
      public static void main(String args[])
      {
        int[][] mat= {{10,20,30,40},{15,25,35,45},{27,29,37,48}};
        int x= 29;
        searchNumber(mat,x);
      }
    }

