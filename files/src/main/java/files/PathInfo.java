package files;


import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;

public class PathInfo {
    static void show(String id, Object p) {
        System.out.println(id + p);
    }
    static void info(Path p) {
        show("toString:\n ", p);//打印路径名称。
        show("Exists: ", Files.exists(p));//是否存在“文件or路径”？
        show("RegularFile: ", Files.isRegularFile(p));//是否是普通的文本文件
        show("Directory: ", Files.isDirectory(p));//是否是路径
        show("Absolute: ", p.isAbsolute());//是否是绝对路径
        show("FileName: ", p.getFileName());//文件名称
        show("Parent: ", p.getParent());//父目录
        show("Root: ", p.getRoot());//获取根目录，相对路径可能没有
        System.out.println("******************");
    }
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));//打印系统名称
        info(Paths.get(
                "C:", "path", "to", "nowhere", "NoFile.txt"));
        Path p = Paths.get("files","src","main","java","files","PathInfo.java");//E:\Javastudy\GitHub\JAVABASE\files\src\main\java\files\PathInfo.java
        info(p);
        Path ap = p.toAbsolutePath();//转化为绝对路径
        info(ap);
        info(ap.getParent());//父路径
        try {
            info(p.toRealPath());
        } catch(IOException e) {
            System.out.println(e);
        }
        URI u = p.toUri();//唯一资源标识符
        System.out.println("URI:\n" + u);
        Path puri = Paths.get(u);
        System.out.println(Files.exists(puri));
        File f = ap.toFile(); // Don't be fooled
    }
}
/* Output:
Windows 10
toString:
 C:\path\to\nowhere\NoFile.txt
Exists: false
RegularFile: false
Directory: false
Absolute: true
FileName: NoFile.txt
Parent: C:\path\to\nowhere
Root: C:\
******************
toString:
 PathInfo.java
Exists: true
RegularFile: true
Directory: false
Absolute: false
FileName: PathInfo.java
Parent: null
Root: null
******************
toString:
 C:\Git\OnJava8\ExtractedExamples\files\PathInfo.java
Exists: true
RegularFile: true
Directory: false
Absolute: true
FileName: PathInfo.java
Parent: C:\Git\OnJava8\ExtractedExamples\files
Root: C:\
******************
toString:
 C:\Git\OnJava8\ExtractedExamples\files
Exists: true
RegularFile: false
Directory: true
Absolute: true
FileName: files
Parent: C:\Git\OnJava8\ExtractedExamples
Root: C:\
******************
toString:
 C:\Git\OnJava8\ExtractedExamples\files\PathInfo.java
Exists: true
RegularFile: true
Directory: false
Absolute: true
FileName: PathInfo.java
Parent: C:\Git\OnJava8\ExtractedExamples\files
Root: C:\
******************
URI:
file:///C:/Git/OnJava8/ExtractedExamples/files/PathInfo.java
true
*/
