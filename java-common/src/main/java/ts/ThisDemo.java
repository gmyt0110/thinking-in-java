package ts;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author yitian
 * @date 2020/6/12 10:03
 */
public class ThisDemo {

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
//        userInfo.setAge(1);
//        userInfo.setName("xxxx");

        System.out.println(userInfo);
//        System.out.println(userInfo.getName() +"_"+userInfo.getAge());
//        System.out.println(userInfo.getx());

        String s = "2.75";
        System.out.println(Float.valueOf(s));

        int i = 1;
        i+=1;
        i = i+1;
        System.out.println(i);

    }

}
