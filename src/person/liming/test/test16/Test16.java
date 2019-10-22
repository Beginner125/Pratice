package person.liming.test.test16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * @author liuliming
 * @Description 代码实现c盘某个文件夹复制到D盘中，加上代码，加上注释，加上思路
 */
public class Test16 {
	
	public static void main(String[] args) {
		String sourcePath;
		String aimPath;
		File sourceFile;
		File aimFile;
		Scanner scan = new Scanner(System.in);
		
		//初始化复制的源路径
		System.out.println("输入复制的源地址");
		sourcePath = scan.next();
		sourceFile = new File(sourcePath);
		System.out.println(sourceFile.getAbsolutePath());
		
		//选择复制的源路径
		System.out.println("按ok结束,如果想要更换源文件请输入新的路径");
		while (true) {
			sourcePath = scan.next();
			if(sourcePath.equals("ok")){
				break;
			}
			sourceFile = new File(sourcePath);
			System.out.println(sourceFile.getAbsolutePath());
		}
		
		//获得复制的目的路径
		System.out.println("请输入目的文件");
		aimPath = scan.next();
		aimFile = new File(aimPath);
		System.out.println(aimFile.getAbsolutePath());
		if(aimFile.exists()){
			System.out.println("目的地已存在文件");
			System.exit(0);
		}
		
		//执行复制操作
		try {
			Files.copy(sourceFile.toPath(), new FileOutputStream(aimFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
