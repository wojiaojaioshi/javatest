//import org.apache.hadoop.fs.FSDataInputStream;
//import org.apache.commons.io.IOUtils;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.fs.FileSystem;
//import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
//import org.apache.hadoop.fs.Path;
//
//public class MyFSDataInputStream extends FSDataInputStream {
//    private static Configuration conf ;
//    static{
//        URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
//    }
//    MyFSDataInputStream(InputStream in)
//    {
//        super(in);
//    }
//    public static void Config(){
//        conf= new Configuration();
//        conf.set("fs.defaultFS","hdfs://localhost:9000");
//        conf.set("fs.hdfs.impl","org.apache.hadoop.hdfs.DistributedFileSystem");
//    }
//
//    public static int ReadLine(String path) throws IOException{
//
//        FileSystem fs = FileSystem.get(conf);
//        Path file = new Path(path);
//        FSDataInputStream getIt = fs.open(file);
//        BufferedReader d = new BufferedReader(newokoko InputStreamReader(getIt));
//
//        String content;// = d.readLine(); //读取文件一行
//        if((content=d.readLine())!=null){
//            System.out.println(content);
//        }
//        //  System.out.println(content);
//        d.close(); //关闭文件
//        fs.close(); //关闭hdfs
//        return 0;
//    }
//
//    public static void PrintFile() throws MalformedURLException, IOException{
//        String FilePath="hdfs://localhost:9000/user/hadoop/test2.txt";
//        InputStream in=null;
//        in=new URL(FilePath).openStream();
//        IOUtils.copy(in,System.out);
//
//    }
//
//
//    public static void main(String[] arg) throws IOException{
//        MyFSDataInputStream.Config();
//        MyFSDataInputStream.ReadLine("test2.txt");
//        MyFSDataInputStream.PrintFile();
//    }
//}
//
