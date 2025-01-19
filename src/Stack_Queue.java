import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Stack_Queue {

  public static void dqStackImpl(){
    Deque<Integer> dqStack = new ArrayDeque<>();
      //  for implementing Stack using ArrayDeque
      //  .push(val) method to push to top
      //  .pop() method to remove top element
      //  .peek() to peek top element
    dqStack.push(1);
    dqStack.push(2);
    dqStack.push(3);
    System.out.println("Stack right now : " + dqStack);
    System.out.println("top of the stack that just got removed : " + dqStack.pop());
    dqStack.push(4);
    dqStack.push(5);
    System.out.println("stack after new additions : " + dqStack);
    System.out.println("top of the stack now : " + dqStack.peek());
  }

  public static void dqQueueImpl(){
    Deque<Integer> dqQueue = new ArrayDeque<>();
      //  for implementing Stack using ArrayDeque
      //  .push(val) method to push to top
      //  .pop() method to remove top element
      //  .peek() to peek top element
    dqQueue.add(1);
    dqQueue.add(2);
    dqQueue.add(3);
    System.out.println("Queue : " + dqQueue);
    System.out.println("Top of the queue element that got removed : " + dqQueue.pop());
    dqQueue.add(4);
    dqQueue.add(5);
    System.out.println("Queue now : " + dqQueue);
    System.out.println("top of the queue now : " + dqQueue.peek());
  }

  public static void llStackImpl(){
    LinkedList<Integer> llStack = new LinkedList<>();
    llStack.push(1);
    llStack.push(2);
    llStack.push(3);
    System.out.println("stack right now : " + llStack);
    System.out.println("top element removed : " + llStack.pop());
    System.out.println("stack right now : " + llStack);
    llStack.addFirst(4);
    System.out.println("stack after new addition : " + llStack);
    System.out.println("top of the stack : " + llStack.peek());
  }
  public static void llQueueImpl(){
    LinkedList<Integer> llQueue = new LinkedList<>();
    llQueue.add(1);
    llQueue.add(2);
    llQueue.add(3);
    System.out.println("Queue right now : " + llQueue);
    System.out.println("front element removed : " + llQueue.pop());
    System.out.println("Queue right now : " + llQueue);
    llQueue.addLast(4);
    System.out.println("Queue after new addition : " + llQueue);
    System.out.println("front of the Queue : " + llQueue.peek());
  }

}
