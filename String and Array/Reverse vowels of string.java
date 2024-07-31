class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        String vowels="AEIOUaeiou";
        while(start<end){
        if((vowels.indexOf(ch[start])>=0) && (vowels.indexOf(ch[end])>=0))
        {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
        }
            else if(vowels.indexOf(ch[start])<0)
                    start++;
            else if(vowels.indexOf(ch[end])<0)
                    end--;
        }
            return new String(ch);
    }
}