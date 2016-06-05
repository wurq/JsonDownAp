import com.intellij.openapi.project.Project;

import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * Created by wurongqiu on 16-6-3.
 */
public class Fio {

    public static void writeStringFile(Project aProject,String aId, String json)  {
        try {
            String output = aProject.getBasePath();
            System.out.println("file output = " + output);
            String filepath = output+"//nei."+aId+"//JSON//";
            System.out.println("file filepath = " + filepath);
            File filep = new File(filepath);
            filep.mkdirs();

            SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");//定义格式，不显示毫秒
            Timestamp now = new Timestamp(System.currentTimeMillis());//获取系统当前时间
            String str = df.format(now);
            File file = new File(filepath+"nei."+str+".txt");

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(json);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
