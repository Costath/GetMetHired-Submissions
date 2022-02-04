package Assignment4;

//2. What is the output of the following program:
public class Test  
{  
    private String function(float i, int f)  
    {  
        return ("gfg");  
    } 
    private String function(double i, double f)  
    {  
        return ("GFG");  
    }  
    public static void main(String[] args)  
    {  
        Test obj = new Test();  
        System.out.println(obj.function(1., 20));      
    }  
}

// Answer: The output is "GFG", since double accepts numbers ending in . while float requires an f at the end 