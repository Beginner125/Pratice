package person.liming.test.test49;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liuliming
 * @Description 在五秒之后，使用编译器编译资源文件夹里面的Run.java并用类装载机装载，并运行其中的run()函数
* @Date: Created in 8:272019/10/29
*/
public class Test49 {
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            Test49 test49 = new Test49();
            String path = test49.getpath();
            System.out.println(path);

            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("javac F:\\WorkSpace\\Pratice\\file\\Run.java -d "+path);
            System.out.println("javac F:\\WorkSpace\\Pratice\\file\\Run.java -d "+path);
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String result;
            do {
                result = reader.readLine();
                System.out.println(result);
            }while (result != null);

            Class<?> runClass = classLoader.loadClass("person.liming.test.test49.Run");
            Method method = runClass.getMethod("run", null);
            method.invoke(runClass.newInstance(), null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public String getpath(){
        // 第一种：获取类加载的根路径   D:\git\daotie\daotie\target\classes
        return this.getClass().getResource("/").getPath();
    }
}

