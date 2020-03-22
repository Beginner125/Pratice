package person.liming.test.test52;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 12:492019/11/25
 */
public class StateMachine {
    int state = 0;//一到五
    String[] acceptSet = {"1234567890", "1234567890+-*/", "1234567890>=<", "1234567890","1234567890"};
    Map<Integer, Map<String, Integer>> mapMap = new HashMap<>();
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("123456789", 1);
        mapMap.put(0, map);
        map = new HashMap<>();

        map.put("123456789", 1);
        map.put("+-*/", 2);
        mapMap.put(1, map);
        map = new HashMap<>();

        map.put("123456789", 2);
        map.put(">=<", 3);
        mapMap.put(2, map);
        map = new HashMap<>();

        map.put("123456789", 4);
        mapMap.put(3, map);
        map = new HashMap<>();

        map.put("1234567890", 4);
        mapMap.put(4, map);
    }


    public boolean jugleInput(String s){
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            Map<String, Integer> map = mapMap.get(state);
            if (!acceptSet[state].contains(c)) {
                System.out.println("在该状态该输入值不在接受集中");
                return false;
            }
            for (String key:
                    map.keySet()) {
                if(key.contains(c)){
                    state = map.get(key);
                    break;
                }
            }
        }
        if(state != 4){
            return false;
        }
        return true;
    }

}
