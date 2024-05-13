package oops;

public class CharacterCounter {
    public static void main(String[] args) {
        
    	String s="Mississippi";
    	char[] st=s.toCharArray();
    	int count;
    	for(int i=0; i<st.length;i++)
    	{
    		count=1;
    		for(int j=i+1;j<st.length;j++)
    		{
    			if(st[i]==st[j])
    			{
    				count++;
    				st[j]='0';
    			}
    		}
    		if(count>1 &&st[i]!='0') 
    		{
    		System.out.println("repeating character="+st[i]);
    		System.out.println("count="+count);
    		}
    	}
    }
}

