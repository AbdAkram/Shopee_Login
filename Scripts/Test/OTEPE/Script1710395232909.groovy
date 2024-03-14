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

Mobile.startExistingApplication('com.shopee.id')

Mobile.openNotifications()

Mobile.tap(findTestObject('Object Repository/OTEPE/android.widget.ImageView'), 0)

Mobile.getText(findTestObject('OTEPE/XXX'), 0)

otp = Mobile.getText(findTestObject('OTEPE/XXX'), 0)
//TestObject notification = findTestObject('OTEPE/XXX')

//String notificationText = Mobile.getText(notification, 10)
String code = otp.substring(57, 63)
//String otp = notification

Mobile.closeNotifications()

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/TEST/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/TEST/android.widget.TextView - Login'), 0)

Mobile.tap(findTestObject('Object Repository/TEST/android.widget.EditText - No. HandphoneEmailUsername'), 0)

Mobile.setText(findTestObject('Object Repository/TEST/android.widget.EditText - No. HandphoneEmailUsername (1)'), code, 0)

Mobile.closeApplication()

