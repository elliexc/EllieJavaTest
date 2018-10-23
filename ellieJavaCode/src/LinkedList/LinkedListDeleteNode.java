package LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/**
 * author: zhanghongtao
 * date  : 2018-10-22 11:22 AM
 * email : zhtxcster@gmail.com
 */
class SynchronizedHashMapExample {
    public static void main(String []args) {

        Map<String, Integer> cricketTeamScore = Collections.synchronizedMap(new HashMap<>());
        cricketTeamScore.put("Aus", 349);
        cricketTeamScore.put("India", 300);

//        ExecutorService executorService = Executor.newFixedThreadPool(10);

    }
}
