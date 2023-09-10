package tests.applicationform.apply.bauqa;

import java.io.File;
import java.util.logging.FileHandler;

public class TestClass {


    public static void main(String args[])
    {
        File file = new File("apply/BudgetProposal.pdf");
        System.out.println(file.getAbsolutePath());
    }
}
