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

WebUI.delay(5)

Mobile.tap(findTestObject('TEST/btn_profile'), 0)

Mobile.tap(findTestObject('Object Repository/OTP/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/OTP/android.widget.TextView - Log in dengan no. handphone'), 0)

Mobile.tap(findTestObject('Object Repository/OTP/android.widget.EditText - Telepon'), 0)

Mobile.setText(findTestObject('Object Repository/OTP/android.widget.EditText - Telepon (1)'), '082211551528', 0)

Mobile.tap(findTestObject('Object Repository/OTP/android.widget.TextView - Lanjut'), 0)

WebUI.delay(30)

Mobile.openNotifications()

Mobile.tap(findTestObject('Object Repository/OTP Notif/android.widget.Button - Salin kode'), 0)

Mobile.closeNotifications()

Mobile.tap(findTestObject('Object Repository/OTP/android.widget.EditText'), 0)

Mobile.sendKeys(findTestObject('OTP/otp isi'), Keys.chord(Keys.CONTROL, 'v'))

Mobile.setText(findTestObject('OTP/otp isi'), Keys.chord(Keys.LEFT_CONTROL, 'v'), 0)

Mobile.closeApplication()

