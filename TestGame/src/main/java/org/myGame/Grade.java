package org.myGame;

public class Grade
{
    public float mod1, mod2, mod3;

    public void setGrade(float mod1, float mod2, float mod3) {
        this.mod1 = mod1;
        this.mod2 = mod2;
        this.mod3 = mod3;
    }

    public float Average()
    {
        return (mod1 + mod2 + mod3) / 3;
    }

    public String getUniGrade()
    {

        if (Average() < 29.99)
        {
            System.out.println("5.00");
        }
        else if (Average() <= 59.99)
        {
            System.out.println("IP");
        }
        else if (Average() <= 60.00)
        {
            System.out.println("3.00");
        }
        else if(Average() <= 67.99)
        {
            System.out.println("2.75");
        }
        else if(Average() <= 71.99)
        {
            System.out.println("2.50");
        }
        else if(Average() <= 75.99)
        {
            System.out.println("2.25");
        }
        else if(Average() <= 80.99)
        {
            System.out.println("2.00");
        }
        else if(Average() <= 85.99)
        {
            System.out.println("1.75");
        }
        else if(Average() <= 90.99)
        {
            System.out.println("1.50");
        }
        else if(Average() <= 95.99)
        {
            System.out.println("1.25");
        }
        else if(Average() <= 100.0)
        {
            System.out.println("1.00");
        }
        else if(Average() == 0)
        {
            System.out.println("Grade not valid");
        }
        else if(Average() >= 59.99)
        {
            System.out.println("Passed! ");
        }
        return "Done! ";
    }
}
