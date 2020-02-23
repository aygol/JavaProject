package aTekrar;

public class GitIgnore {
    ///target
    //.idea 	.idea
    //test-output
    // 4  src/test/java/tests/TestBase.java
    //@@ -67,14 +67,16 @@ public void teardown(ITestResult result){
    //            extentTest.fail(result.getThrowable());	            extentTest.fail(result.getThrowable());
    //            try {	            try {
    //                //BrowserUtils.getScreenshot(result.getName()) - takes screenshot and returns location of that screenshot	                //BrowserUtils.getScreenshot(result.getName()) - takes screenshot and returns location of that screenshot
    //                //this method throws IOException (which is checked exception)
    //                //any checked exception must be handled
    //                extentTest.addScreenCaptureFromPath(BrowserUtils.getScreenshot(result.getName()));	                extentTest.addScreenCaptureFromPath(BrowserUtils.getScreenshot(result.getName()));
    //            } catch (IOException e) {	            } catch (IOException e) {
    //                //print error info
    //                e.printStackTrace();	                e.printStackTrace();
    //            }	            }
    //        }else if(result.getStatus() == ITestResult.SKIP){	        }else if(result.getStatus() == ITestResult.SKIP){
    //            extentTest.skip("Test case was skipped : "+result.getName());	            extentTest.skip("Test case was skipped : "+result.getName());
    //        }	        }
    //
    //        Driver.close();	        Driver.close();
    //    }	    }
}
