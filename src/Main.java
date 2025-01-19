import Array.*;
import Sorting_Algos.BubbleSort;
import Sorting_Algos.InsertionSort;
import Sorting_Algos.SelectionSort;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    int res = evalRPN(new String[]{"2","1","+","3","*"});
    System.out.println(res);
  }
  public static int evalRPN(String[] tokens) {
    if(tokens.length == 1) return Integer.parseInt(tokens[0]);
    if(tokens.length == 1) return Integer.parseInt(tokens[0]);
    Deque<Integer> st = new ArrayDeque<>();
    for(String str : tokens){
      int first=0, second=0;
      int res = 0;
      switch(str){
        case "+" :
          second = st.pop();
          first = st.pop();
          st.push(first+second);
          break;
        case "-" :
          second = st.pop();
          first = st.pop();
          st.push(first-second);
          break;
        case "*" :
          second = st.pop();
          first = st.pop();
          st.push(first*second);
          break;
        case "/" :
          second = st.pop();
          first = st.pop();
          st.push(first/second);
          break;
        default :
          st.push(Integer.parseInt(str));
      }
    }
    return st.pop();
  }
}
