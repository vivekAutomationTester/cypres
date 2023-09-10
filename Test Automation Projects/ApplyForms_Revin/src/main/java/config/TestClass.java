package config;

import java.util.Arrays;

public class TestClass {

    public static void main(String args[])
    {
        Object[][] data = getData(200);

        for(int i = 0 ; i< data.length; i++)
        {
            System.out.println(Arrays.toString(data[i]));

        }
    }

    static Object[][] getData(int numberOfRows)
    {
        int rowNum = numberOfRows;
        int colNum = 1;

        Object[][] test = new Object[numberOfRows][colNum];
        for(int i=0; i<numberOfRows; i++)
        {

            for(int j=0; j<colNum; j++)
            {
                test[i][j] = i+1;
            }
        }

        return test;
    }
}
