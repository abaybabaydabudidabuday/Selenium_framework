package kz.beeline.test.dataproviders;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class TestDataProvider {


    @DataProvider(name="LoginDataProvider")
    public static Object[][] getDataFromDataProvider(){
        Object[][] groupArray = null;
//        for (String group : context.getIncludedGroups()) {
//            if (group.equalsIgnoreCase("logintests")) {
                groupArray = new Object[][]{
                        {"87086441271", "India"},
                        {"ibrayevabay1@gmail.com", "UK"},
                        {"abay_babay", "USA"}
                };
//                break;
//            }else{
//                System.out.println("Not provided yet");
//            }
//        }
        return groupArray;
    }

}


















