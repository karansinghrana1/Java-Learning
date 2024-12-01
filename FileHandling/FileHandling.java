package FileHandling;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        // try(InputStreamReader isr = new InputStreamReader(System.in)){
        //     System.out.print("enter some letter");
        //     int letter = isr.read();
        //     while (isr.ready()) {
        //         System.out.println((char) letter);
        //         letter = isr.read();
        //     }
    
        //     isr.close();
        //     System.out.println();
        // }catch (IOException e){
        //     System.out.println(e.getMessage());
        // }
        
        // try(FileReader fr = new FileReader("FileHandling\\n" + //
        //                 "ote.txt")){
        //     // System.out.print("enter some letter");
        //     int letter = fr.read();
        //     while (fr.ready()) {
        //         System.out.print((char) letter);
        //         letter = fr.read();
        //     }
    
        //     fr.close();
        //     // System.out.println();
        // }catch (IOException e){
        //     System.out.println(e.getMessage());
        // }


        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //byte to char stream then reading char stream

        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //     System.out.println("you typed: "+br.readLine());
        // }catch (IOException e){
        //     System.out.println(e.getMessage());
        // }
        
        // try(BufferedReader br = new BufferedReader(new FileReader("FileHandling\\n" + //
        //                 "ote.txt"))){
        //     // while (br.ready()) {
        //     //     br.readLine();
        //     // }
        //     System.out.println(br.readLine());
        // }catch (IOException e){
        //     System.out.println(e.getMessage());
        // }


        //output

        // OutputStream os = System.out;
        // //os.write(😎);//range is exceeded
        // try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
        //     osw.write("😎");
        //     osw.write(97);
        //     osw.write(10);
        //     osw.write('\n');
        //     char[] arr = "hello world".toCharArray();
        //     osw.write(arr);
        //     //osw.write(😎);

            

        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }


        // try(FileWriter fw = new FileWriter("FileHandling\\n" + //
        //                 "ote.txt",true)) {
        //     fw.write("😎");
        //     fw.write(97);
        //     fw.write(10);
        //     fw.write('\n');
        //     char[] arr = "hello world".toCharArray();
        //     fw.write(arr);
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }
        // try(BufferedWriter bw = new BufferedWriter(new FileWriter("FileHandling\\n" + //
        //                 "ote.txt",true))) {
        //     bw.write("😎");
        //     bw.write(97);
        //     bw.write(10);
        //     bw.write('\n');
        //     char[] arr = "hello world".toCharArray();
        //     bw.write(arr);
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

        // creating new files

        // try{
        //     File fo =new File("File.txt");
        //     fo.createNewFile();
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
        // try{
        //     FileWriter fw = new FileWriter("File.txt",true);
        //     char[] arr = "hello world".toCharArray();
        //     fw.write(arr);
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }




    }
    
}
