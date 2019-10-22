package person.liming.test.test4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author liuliming
 * @Description 有五个学生，每个学生有3门课（语文、数学、英语）的成绩，写一个程序接收从键盘输入学生的信息，
 * @Description 输入格式为：name,30,30,30（姓名，三门课成绩），
 * @Description 把输入的学生信息按总分从高到低的顺序写入到一个名称”stu.txt”文件中。
 * @Description 要求：stu.txt文件的格式要比较直观，打开这个文件，就可以很清楚的看到学生的信息。
 * @Date: forget
 */
public class Test4 {
	
	public static void main(String[] args) {
		Student[] stu = new Student[5];
		Scanner scan = new Scanner(System.in);
		File file = new File("src/file/stu.txt");
		BufferedWriter writer;
		
		// TODO Auto-generated catch block
		try {
			//判断文件是否存在
			if(!file.exists()){
				file.createNewFile();
			}
			
			//writer初始化
			writer = new BufferedWriter(new FileWriter(file));
			
			//输入数据
			for(int i = 0; i < 5; i++){
				String str = scan.next();
				String[] inputData = str.split("#");
				int score1 = Integer.valueOf(inputData[1]);
				int score2 = Integer.valueOf(inputData[2]);
				int score3 = Integer.valueOf(inputData[3]);
				stu[i] = new Student(inputData[0], score1, score2, score3);
			}
			
			//根据学生的成绩总和排序
			Arrays.sort(stu, new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					if(o1.scoreAll()>o2.scoreAll()){
						return 1;
					}else{
						return -1;
					}
				}
				
			});
			
			//将数据存入文件
			for(int i = 0; i < 5; i++){
				writer.write(stu[i].toString());
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
