package leetcode.leetcode03;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

/**
 * @program: algorithm
 * @description:
 *
 * ���û������ڵ�˼�룬���ұߵĳ�����set������ ��������Ҫ���� ����(���ָ���ӦԪ��ȥ�������ұߵĲ��ܼӽ�ȥ����Ҫ�жϺ��ټ���)
 * @author: mengxiangxing
 * @create: 2021-07-18 15:01
 **/
@SpringBootTest
public class lengthOfLongestSubstringTest {

  @Test
  public void lengthOfLongestSubstring() {
    String s= "abcabcbb";
    if(s.length()<=0){
      System.out.println(0);
      return;
    }
    int left=0,right =0,maxLength=0;
    HashSet<Character> set =new HashSet<>();
    while(right<s.length()){
      if(set.contains(s.charAt(right))){
        set.remove(s.charAt(left));
        left++;
      }else{
        set.add(s.charAt(right));
        right++;
        maxLength =Math.max(right-left,maxLength);
      }
    }
    System.out.println(maxLength);
    return;
  }
}
