package keyworddriven;

import base.CommonAPI;
import reporting.TestLogger;
import ulta.UltaHomePage;

public class ExcelExecutor extends CommonAPI {


    ExcelFileReader reader = new ExcelFileReader();

    UltaHomePage ultaHomePage = new UltaHomePage(driver);


    String path = "C:\\Users\\Sylvana Rahman\\IntelliJ idea projects\\WebAutomationGroup3\\UltaBeauty\\data\\ultaexcelfile.xls";

    public void runOnexcel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + " -> " +
                convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()) + "using excel to perform tests");

        String[] testSteps = reader.getExcelData(path, 0);
        for (String str : testSteps) {
            switch (str) {
                case "signup":
                    ultaHomePage.signUpForUltaBeauty();
                    break;
                case "search":
                    ultaHomePage.enterInSearchBox("Fragrance");
                    break;
                default:
                    System.out.println("No text found");
                    break;
            }
        }
    }
}

