package person.liming.test.test56;

import java.util.Random;

/**
 * @author liuliming
* @Description 昧字怏栽晩囂峠邪兆補竃��僥晩囂喘
 * @Date: Created in 16:172020/3/8
 */
public class Test56 {
    public static void main(String[] args) {
        char[] str = "らりるれろわをん".toCharArray();//あいうえおかきくけこさしすせそたちつてとなにぬねのはひふへほまみむめもやゆよ
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 6; i++) {
            for (int j = random.nextInt(5)+3; j < random.nextInt(5)+8; j++) {
                stringBuilder.append(str[random.nextInt(str.length)]);
            }
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString());
    }
}
