package person.liming.test.test43;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * @author liuliming
 * @Description 将文件夹里面的数据重命名为班级人员的名字
 * @Date: Created in 14:35 2019/10/16
 */
public class RenameTask {

    public static void changeName(String fileName, String[] names) {
        File path = new File(fileName);
        if(!path.exists()){
            info("路径不存在");
            System.exit(0);
        }
        String[] lastName = path.list();
        File[] subPath = path.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isFile()){
                    return true;
                }
                return false;
            }
        });
        info(Arrays.toString(subPath));

        int len = names.length<subPath.length ? names.length : subPath.length;
        for (int i = 0; i < len; i++) {
            String[] temp = subPath[i].getName().split("\\.");
            String tail = temp[temp.length-1];
            subPath[i].renameTo(new File(fileName+"\\"+names[i]+"."+tail));
        }

        info("重命名成功");
        info("曾命名："+Arrays.toString(lastName));
        info("现在命名："+Arrays.toString(path.list()));
    }


    public static void info(String info) {
        System.out.println(info);
    }

    public static void main(String[] args) {
//        String[] name = {"乐柯","任帆","刘力铭","古康","姚梓良","孙明耀","张响鸰","张婷","张舒冉","戴钊",
//                "杜令克","梅馨月","江志康","王晗","贺俊尧","陈啸松","陈洺宏","黄翔宇","龚聪"};
        if(args.length != 2){
            info("参数示例(使用绝对路径修改文件名）： C:\\pic 1,2,3,4,5,6,7");
            info("参数示例(使用相对路径修改文件名）： \\pic 1,2,3,4,5,6,7");
            System.exit(0);
        }
        changeName(args[0], args[1].split(","));
    }
}
