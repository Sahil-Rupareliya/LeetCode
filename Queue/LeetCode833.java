package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode833 {
    public static void main(String[] args) {
        RecentCounter rc=  new RecentCounter();
        System.out.println(rc.ping(1));
        System.out.println(rc.ping(100));
        System.out.println(rc.ping(3001));
        System.out.println(rc.ping(3002));
    }

    static class RecentCounter {
        Queue<Integer> queue = new LinkedList<>();

        public RecentCounter() {

        }

        public int ping(int t) {
            queue.add(t);
            while((t - queue.peek()) > 3000){
                queue.remove();
            }
            return queue.size();
        }
    }


//    class RecentCounter {
//        List<Integer> list = new ArrayList<>();
//
//        public RecentCounter() {
//
//        }
//
//        public int ping(int t) {
//            list.add(t);
//            while(t-list.get(0) > 3000){
//                list.remove(0);
//            }
//            return list.size();
//        }
//    }

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

}

