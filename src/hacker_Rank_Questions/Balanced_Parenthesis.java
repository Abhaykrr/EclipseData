package hacker_Rank_Questions;

import java.util.*;

public class Balanced_Parenthesis {

	public static void main(String[] args) {

Stack<Character> st=new Stack<>();
 char add;
 String s="{(([])[])[]]}";
 String ans="";
for(int i=0;i<s.length();i++){
  if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='[')
  st.push(s.charAt(i));
  else if(st.peek()=='{'&&s.charAt(i)=='}'||s.charAt(i)==']'&&st.peek()=='['||s.charAt(i)==')'&&st.peek()=='(')
    {
        if(st.empty()==true) {
        ans="NO" ;
        break ;}
         else
          st.pop();
    }
  else {
	 ans="NO";
			 break;
  }
    }
      
  

if(st.empty()==true)
ans="YES";

System.out.println(ans);
}
}
