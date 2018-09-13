import java.io.*;
class q1{
      public static void main(String args[]){
                 File fi = new File("C:/Users/Denny/Desktop/New Text Document.txt");
                 File gi = new File("C:/Users/Denny/Desktop/New Text Document (2).txt");
                 char c[]=new char[10000];
                      int i,k=0;
                 try{
                     FileInputStream fin=new FileInputStream(fi);
                      i=fin.read();
                     while(i!=-1){
                      c[k]=(char)i;
                     k++;
                     i=fin.read();
                   }
                  }
                 catch(IOException e){
                   System.out.println(e);
                 }
                  try{
                   FileOutputStream fout=new FileOutputStream(gi);
                   for(i=0;i<k;i++)
                    fout.write(c[i]);
                   System.out.println("File copied");
                 }
                 catch(IOException e){
                   System.out.println(e);
                  }
                 try{
            FileInputStream fin=new FileInputStream(gi);
        int i2;
        i2 = fin.read();
        while(i2 != -1){
            c[k++] = (char)i2;
            System.out.print((char)i2);
            i2 = fin.read();
        }
    }
    catch(IOException e){
        System.out.println(e);
    }
      }
}