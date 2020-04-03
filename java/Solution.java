import java.math.BigInteger;

class Solution {
    public int myAtoi(String str) {
        if(str==null) return 0;
        String ans=str.trim();
        if(ans.length() == 0) return 0;
        char index=ans.charAt(0);
        if(!(index=='+'||index=='-'||(index>='0'&&index<='9'))) return 0;
        if((index=='+'||index=='-')&&ans.length()==1) return 0;
        StringBuilder sb=new StringBuilder();
        int i=0;
        if(index=='-'||index=='+'){
            i=1;
            if(index=='-') sb.append("-");
        }
        boolean flag=false;
        char[] chars=ans.toCharArray();
        for (;i<chars.length;i++){
            if(chars[i]>='0'&&chars[i]<='9') {
                flag=true;
                sb.append(chars[i]);
            }
            else break;
        }
        if(!flag) return 0;
        String anss=sb.toString();
        BigInteger bans=new BigInteger(anss);
        BigInteger max=new BigInteger(String.valueOf(Integer.MAX_VALUE));
        BigInteger min=new BigInteger(String.valueOf(Integer.MIN_VALUE));
        if(bans.compareTo(max)>0) return Integer.MAX_VALUE;
        else if(bans.compareTo(min)<0) return Integer.MIN_VALUE;
        else return Integer.parseInt(anss);
    }
}
class Main{
    public static void main(String[] args) {
        String[] strings={"42","   -42","4193 with words","words and 987","-91283472332","   +0 123","  0000000000012345678","-000000000000001"};
        for (String s :strings) System.out.println(new Solution().myAtoi(s));
    }

}