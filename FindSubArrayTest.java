
import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syedshahzad
 */

public class FindSubArrayTest extends TestCase{
    
    private int findSubArray(int []a, int []b)
    {
        
        for(int i=0;i<a.length;i++)
        {
            for(int k=0; (b[0]==a[i] && k<b.length) ;k++)
            {
                if( i+k<a.length && b[k]==a[i+k] )
                {
                    if(k==b.length-1)
                    {
                        return i+1;
                    }
                }
                else
                {
                    break;
                }
            }
        }
        
        return -1;
    }
    
    @Test
    public void testFindSubArrayNotFoundFromEnd()
    {
        int a[] = {1,1,7,1,8,8,50,7,1,1,1,1,7,1,8,7};
        int b[] = {8,7,9};
        
        int expected = -1;
        
        int found = findSubArray(a, b);
        
        Assert.assertEquals(expected,found);
    }
    
    @Test
    public void testFindSubArrayNotFoundFromStart()
    {
        int a[] = {1,1,7,1,8,8,50,7,1,1,1,1,7,1,8,7};
        int b[] = {1,1,7,6};
        
        int expected = -1;
        
        int found = findSubArray(a, b);
        
        Assert.assertEquals(expected,found);
    }
    
    @Test
    public void testFindSubArrayNotFoundFromMid()
    {
        int a[] = {1,1,7,1,8,8,50,7,1,1,1,1,7,1,8,7};
        int b[] = {8,50,7,1,0};
        
        int expected = -1;
        
        int found = findSubArray(a, b);
        
        Assert.assertEquals(expected,found);
    }
    
    @Test
    public void testFindSubArrayFoundFromEnd()
    {
        int a[] = {1,1,7,1,8,8,50,7,1,1,1,1,7,1,8,7};
        int b[] = {1,8,7};
        
        int expected = 14;
        
        int found = findSubArray(a, b);
        
        Assert.assertEquals(expected,found);
    }
    
    @Test
    public void testFindSubArrayFoundFromStart()
    {
        int a[] = {1,1,7,1,8,8,50,7,1,1,1,1,7,1,8,7};
        int b[] = {1,1,7,1};
        
        int expected = 1;
        
        int found = findSubArray(a, b);
        
        Assert.assertEquals(expected,found);
    }
    
    @Test
    public void testFindSubArrayFoundFromMid()
    {
        int a[] = {1,1,7,1,8,8,50,7,1,1,1,1,7,1,8,7};
        int b[] = {8,50,7,1,1};
        
        int expected = 6;
        
        int found = findSubArray(a, b);
        
        Assert.assertEquals(expected,found);
    }
    
}
