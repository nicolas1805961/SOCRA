package com.epita.socra.app.tools;

import java.util.ArrayList;

public class Morseconverter
{
    public String toMorse(int i)
    {
        StringBuilder s = new StringBuilder("");
        int tmp = 0;
        while(i > 0)
        {
            tmp = i % 10;
            switch (tmp)
            {
                case 0:
                    s.insert(0, "_ _ _ _ _");
                    s.insert(0, " ");
                    break;
                case 1:
                    s.insert(0, ". _ _ _ _");
                    s.insert(0, " ");
                    break;
                case 2:
                    s.insert(0, ". . _ _ _");
                    s.insert(0, " ");
                    break;
                case 3:
                    s.insert(0, ". . . _ _");
                    s.insert(0, " ");
                    break;
                case 4:
                    s.insert(0, ". . . . _");
                    s.insert(0, " ");
                    break;
                case 5:
                    s.insert(0, ". . . . .");
                    s.insert(0, " ");
                    break;
                case 6:
                    s.insert(0, "_ . . . .");
                    s.insert(0, " ");
                    break;
                case 7:
                    s.insert(0, "_ _ . . .");
                    s.insert(0, " ");
                    break;
                case 8:
                    s.insert(0, "_ _ _ . .");
                    s.insert(0, " ");
                    break;
                case 9:
                    s.insert(0, "_ _ _ _ .");
                    s.insert(0, " ");
                    break;
            }
            i /= 10;
        }
        s = s.deleteCharAt(0);
        return s.toString();
    }
    public int toValue(String s)
    {
        String s1 = "";
        String s2 = "";
        int i = 0;
        int j = 8;
        while (j < s.length())
        {
            s1 = s.subSequence(i, j).toString();
            switch(s1)
            {
                case "_ _ _ _ _":
                    s2.concat("0");
                    break;
                case ". _ _ _ _":
                    s2.concat("1");
                    break;
                case ". . _ _ _":
                    s2.concat("2");
                    break;
                case ". . . _ _":
                    s2.concat("3");
                    break;
                case ". . . . _":
                    s2.concat("4");
                    break;
                case ". . . . .":
                    s2.concat("5");
                    break;
                case "_ . . . .":
                    s2.concat("6");
                    break;
                case "_ _ . . .":
                    s2.concat("7");
                    break;
                case "_ _ _ . .":
                    s2.concat("8");
                    break;
                case "_ _ _ _ .":
                    s2.concat("9");
                    break;
            }
            i += 8;
            j += 8;
        }
        return Integer.parseInt(s2);
    }
}
