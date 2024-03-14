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

Mobile.tap(findTestObject('Object Repository/Password salah/android.widget.Button - MULAI'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Search/android.widget.FrameLayout'), 0)

WebUI.sendKeys(findTestObject('Search/android.widget.EditText - HP Rp 1 Rupiah Cod'), Keys.chord(Keys.CONTROL, ‘v’))

Mobile.setText(findTestObject('Object Repository/Search/android.widget.EditText - HP Rp 1 Rupiah Cod'), 'aaaa', 0)

Mobile.tap(findTestObject('Object Repository/Password salah/android.widget.FrameLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Password salah/android.widget.TextView - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Password salah/android.widget.EditText - No. HandphoneEmailUsername'), 0)

Mobile.setText(findTestObject('Object Repository/Password salah/android.widget.EditText - No. HandphoneEmailUsername (1)'), 
    '082211551528', 0)

Mobile.tap(findTestObject('Object Repository/Password salah/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Password salah/android.widget.EditText - Password (1)'), 'akram123', 0)

Mobile.tap(findTestObject('Object Repository/Password salah/android.widget.TextView - Log In'), 0)

Mobile.closeApplication()

