package com.softlab.khayrul.programmingaccessories;

/**
 * Created by khayrul on 2/13/18.
 */

public class Activity2
{
    //This method is for removing space from a string
    public String removeSpace(String s)
    {
        String str = "";
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != ' ')
            {
                str += s.charAt(i);
            }
        }
        return str;
    }
    //Exit the app
    public void exitApp()
    {
        System.exit(1);
    }

}
