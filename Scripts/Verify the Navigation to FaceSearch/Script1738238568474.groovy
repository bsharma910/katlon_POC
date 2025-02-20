import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\Downloads\\app-debug_v23_NFW.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText'), 'neeraj.sharma2@technossus.com')

Mobile.tap(findTestObject('Object Repository/Technossus/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Object Repository/Technossus/android.widget.EditText - Password'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Technossus/android.widget.EditText - Password'), 'Jaky@1471')

Mobile.tap(findTestObject('Object Repository/Technossus/android.widget.Button - Sign in'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/android.view.View - Declaration'), 'Declaration')

Mobile.verifyElementText(findTestObject('Object Repository/android.view.View - Reason for Processing'), 'Reason for Processing')

Mobile.verifyElementText(findTestObject('Object Repository/android.view.View - Additional Information'), 'Additional Information')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Proceed'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/android.view.View - Face Search'), 0)

Mobile.closeApplication()

