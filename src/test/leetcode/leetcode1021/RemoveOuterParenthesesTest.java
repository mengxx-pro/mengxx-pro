package leetcode.leetcode1021;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

/**
 * @program: algorithm
 * @description: leetcode��1021�� ɾ������������
 * // ����һ���ǿ���Ч�ַ��� s�����ǽ������ԭ�ﻯ�ֽ⣬ʹ�ã�s = P_1 + P_2 + ... + P_k������ P_i ����Ч�����ַ���ԭ�
 * // �� s ����ԭ�ﻯ�ֽ⣬ɾ���ֽ���ÿ��ԭ���ַ�������������ţ����� s ��
 * // ʾ�� 1��
 * //���룺s = "(()())(())"  �����"()()()"
 * //���ͣ������ַ���Ϊ "(()())(())"��ԭ�ﻯ�ֽ�õ� "(()())" + "(())"��ɾ��ÿ�������е���������ź�õ� "()()" + "()" = "()()()"��
 * // ʾ�� 2��
 * //���룺s = "(()())(())(()(()))" �����"()()()()(())"
 * //���ͣ������ַ���Ϊ "(()())(())(()(()))"��ԭ�ﻯ�ֽ�õ� "(()())" + "(())" + "(()(()))"��ɾ��ÿ�������е���������ź�õ� "()()" + "()" + "()(())" = "()()()()(())"��
 * // ʾ�� 3��
 * //���룺s = "()()" �����""
 * //���ͣ������ַ���Ϊ "()()"��ԭ�ﻯ�ֽ�õ� "()" + "()"��
 * //ɾ��ÿ�������е���������ź�õ� "" + "" = ""��
 * // ��ʾ��
 * // 1 <= s.length <= 105
 * // s[i] Ϊ '(' �� ')'
 * // s ��һ����Ч�����ַ���
 * //
 * // Related Topics ջ �ַ���
 *
 * @author: mengxiangxing
 * @create: 2021-07-14 13:38
 **/
@SpringBootTest
public class RemoveOuterParenthesesTest {

  @Test
  public void removeOuterParentheses() {
    System.out.println(System.getProperty("file.encoding"));


    String[] parenthesesArray = {"(()())(())", "(()())(())(()(()))", "()()"};
    String parentheses = parenthesesArray[new Random().nextInt(parenthesesArray.length)];
    System.out.println("����" + parentheses);

    char[] parenthesesChar = parentheses.toCharArray();
    //��ʼ��һ��������������������ӵ�ֵ��������+1��������-1���ܵļ���Ϊ0ʱ������ַ�����Ϊ��Ч�����ַ���ԭ��
    //ѭ����ֻ�ѳ���һ�������һ�����ż��뵽�µ��ַ����м��ɣ��ж�allCount����0ʱ������Ҫ������
    int allCount = 0;//��ʼ������������ӵ�ֵ
    StringBuilder parenthesesBuilder = new StringBuilder();
    char leftChar = "(".charAt(0);
    char rightChar = ")".charAt(0);
    for (char word : parenthesesChar) {
      if (leftChar == word) {
        if (allCount != 0) {
          parenthesesBuilder.append(word);
        }
        allCount++;
      } else if (rightChar == word) {
        allCount--;
        if (allCount != 0) {
          parenthesesBuilder.append(word);
        }
      }
    }
    System.out.println("���" + parenthesesBuilder.toString());
    return;
  }
}
