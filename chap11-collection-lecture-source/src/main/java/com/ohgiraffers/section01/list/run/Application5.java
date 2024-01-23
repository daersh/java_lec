package com.ohgiraffers.section01.list.run;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 목표<br><br>
 * 큐(queue)에 대해 이해하고 사용할 수 있다. <br><br>
 *
 * @queue: 선형 메모리 공간에 데이터를 저장하여 순서를 유지하기 위한 선입선출 방식의 자료구조이다. 대부분 LinkedList 를 많이 사용한다.
 * @priorty_queue: 큐이면서 정렬을 위한 최우선 가치에 있는 요소의 순서를 최앞단으로 바꿔주는 기능이 있는 자료구조
 */

public class Application5 {
    public static void main(String[] args) {
        //Queue<String> que = new Queue<String>(); 중요,err 이렇게 하면 안됨
        Queue<String> que = new LinkedList<>();
        PriorityQueue<String> que2 = new PriorityQueue<>();

        init(que);
        System.out.println("que = " + que);
        //목차 1. 가장 먼저 들어온 값 확인 peek()
        System.out.println(que.peek());
        /*목차 2. 가장 먼저 들어온 값 확인 후 제거*/
        queuePoll(que);

        /*목차 3. 우선순위 큐 사용*/
        // 확인하면 전부 정렬되어 있지는 않음. 최우선 값만 맨 앞으로 가고 poll과 같이 요소가 바뀔 떄마다 다음 최우선 값을 앞으로 보냄
        init(que2);
        System.out.println("que2 = " + que2);
        que2.poll();
        System.out.println("que2 = " + que2);
        que2.poll();
        System.out.println("que2 = " + que2);
        que2.poll();
        System.out.println("que2 = " + que2);
        que2.poll();
        System.out.println("que2 = " + que2);
    }

    private static void queuePoll(Queue<String> que) {
        System.out.println("poll: " + que.poll());
        System.out.println("poll: " + que.poll());
        System.out.println("poll: " + que.poll());
        System.out.println("poll: " + que.poll());
        System.out.println("poll: " + que.poll());
    }

    private static void init(Queue<String> que) {
        que.add("first");
        que.add("second");
        que.add("third");
        que.add("fourth");
        que.add("fifth");
    }
}
