package javabasic.day14.demo1;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/11 10:22 星期二
 */
public class MyStack {
    private LinkedList<Object> ll;
    public MyStack() {
        ll = new LinkedList<>();
    }

    /**
     * 栈的添加操作
     * @param obj   输入参数
     */
    public void save(Object obj) {
        ll.addFirst(obj);
    }

    public Object delete() {
        if (ll != null) {
            return ll.removeFirst();
        } else {
            return null;
        }
    }

    public int count() {
        return ll.size();
    }

    public boolean hasNext() {
        return ll.size() == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();


        sb.append("[");

        Iterator<Object> it = ll.iterator();
        while (it.hasNext()) {
            sb.append(it.next()).append(", ");
        }

        sb.replace(sb.length() - 2,sb.length(),"");
        sb.append("]");

        return sb.toString();
    }
}
