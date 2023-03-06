package OOP;
import java.io.File;
import java.io.IOException;

public class FileFolderDemo {

    public static void main(String[] args) {
       /* File file = new File("C:\\Users\\ADMIN\\Desktop\\study\\payilagam\\Raja\\Rani ");
        boolean IsfolderExist = file.exists(); // check whether that folder exists or not
        System.out.println(IsfolderExist);
        if(IsfolderExist == false)
          //  file.mkdir(); // to crate a folder
        file.mkdirs();// create more sub directories

        IsfolderExist = file.exists();
        System.out.println("Folder present:"+IsfolderExist);*/

        /**
         * file creation
         */

        /*File file = new File("C:\\Users\\ADMIN\\Desktop\\study\\payilagam\\Raja\\Rani\\test.txt");
        boolean present = file.exists();
        if(present==false){
            try {
                boolean IsfileCreated = file.createNewFile();
                System.out.println("File is created "+ IsfileCreated);
            } catch (IOException e) {
               // throw new RuntimeException(e);
                e.printStackTrace();
            }*/

        /**
         * file deletion
         */

       /* File file = new File("C:\\Users\\ADMIN\\Desktop\\study\\payilagam\\Raja\\Rani\\test.txt");
        file.delete(); //dlt the file
        boolean present = file.exists();
        System.out.println("File deleted: "+present);*/

        /**
         * rename file
         */

        /*File file = new File("C:\\Users\\ADMIN\\Desktop\\study\\payilagam\\Raja\\Rani\\test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File newName = new File("C:\\Users\\ADMIN\\Desktop\\study\\payilagam\\Raja\\Rani\\Thadsha.txt");//set new name

        boolean renamed = file.renameTo(newName);// rename the file and return boolean
        System.out.println("Rename success "+renamed);

        //get the file name
        System.out.println("File name is : "+file.getName());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());*/

        /**
         * listing all files and folders
         */
        File file = new File("C:\\Users\\ADMIN\\Desktop");
        String[] listOfFiles= file.list();

        for(String s:listOfFiles){

            System.out.println(s);

           /* try {
                FileInputStream fileInputStream = new FileInputStream("myfile.txt");
                int data = fileInputStream.read();
                while(data != -1) {
                    // Do something with the data
                    System.out.print((char)data);
                    data = fileInputStream.read();
                }
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }*/
        }
    }

}
