/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;

/**
 *
 * @author MIX
 */
public class Logic {
     public boolean checkTime(String s,String amPm)
            
    {int x;
        try{
         x=Integer.parseInt(s);}
    catch(NumberFormatException e)
    {
        return false;
    }   if(x<1||x>12)
        return false;
        if((x==11||x==10)&&amPm.equals("PM"))
            return false;
         if((x==12||x<9)&&amPm.equals("AM"))
            return false;
        
    
    return true;
        
    }
     public String format(String s) {
        int i = 0, j = 0;
        char[] newS = new char[2000];
        char[] oldS = s.toCharArray();
        while (i < oldS.length) {
            if (oldS[i] != ']' &&oldS[i] != '[') {
                if( oldS[i] == ',')
                {
                    i++;
                    i++;
                }
                newS[j] = oldS[i];
            }

            i++;
            j++;
        }
        s = String.valueOf(newS);
        return s;

    }
    
}
