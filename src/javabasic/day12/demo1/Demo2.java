package javabasic.day12.demo1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/8 9:38 星期六
 */
public class Demo2 {
    public static void main(String[] args) {
        /*
        添加：
            append(String str)
            insert(int offset,String str)
         删除
            delete(int start,int end)
            deleteCharAt(int index)

         转换为String
            toString()

         String转换为StringBuffer
            new StringBuffer(String str)

         截取功能
            substring(int start)    // 原来的串没有改变,不直接作用于原串
            substring()
         */
        StringBuffer sb = new StringBuffer();
        sb.append("hellowrod");

        System.out.println(sb);
        // hellowrod
        sb.append("helloworld");
        System.out.println(sb);
        //hellowrodhelloworld

        sb.insert(5,"nihao");
        System.out.println(sb);
        //hellonihaowrodhelloworld

        sb.deleteCharAt(2);
        sb.delete(2,5);
        //删除左闭右开
        System.out.println(sb);


        sb.replace(0,sb.length() - 1,"**");
        System.out.println(sb);

    }
}
