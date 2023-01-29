package cord.io.file;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;
import static java.nio.file.FileVisitOption.*;
import java.util.*;

public class filecontrol {
    private boolean ISWORKSPACE = true;
    private boolean ISDRIVER = true;
    private boolean ISDATABASE = true;
    private boolean ISTABLE = true;

    public String workspace;
    public int size;
    public boolean create_workspace(String workspace_name, int size) {
        if(ISWORKSPACE) {
            return ISDATABASE=false;

        } else {
            this.workspace = workspace_name;
            this.size = size;
            return ISDATABASE=true;
        }
       

    } 
    public boolean create_database(String dbname)
    {
        Finder file_find = new Finder();
        file_find.Finder.file_find(dbname);
        if(ISDATABASE){

        }

    }
    public boolean create_table() 
    {

    }

    public boolean create_file(String dirpath, String dname)
    {
        File f = new File(dirpath, dname);
  
        // if directory exists,then
        if (f.exists()) {
            // get the contents into arr[]
            // now arr[i] represent either a File or
            // Directory
            String arr[] = f.list();
  
            // find no. of entries in the directory
            int n = arr.length;
  
            // displaying the entries
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
                // create File object with the entry and
                // test if it is a file or directory
                File f1 = new File(arr[i]);
                if (f1.isFile())
                    System.out.println(": is a file");
                if (f1.isDirectory())
                    System.out.println(": is a directory");
            }
            System.out.println(
                "No of entries in this directory " + n);
        }
        else
            System.out.println("Directory not found");
    }
    
    public String get_workspace() 
    {
        return this.workspace;
    }


}
    

