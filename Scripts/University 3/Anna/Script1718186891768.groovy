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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.annauniv.edu/')

WebUI.click(findTestObject('Object Repository/Anna/Page_Anna University, Chennai/a_Core Values'))

WebUI.click(findTestObject('Object Repository/Anna/Page_Anna University, Chennai/a_Computer Technology'))

WebUI.switchToWindowTitle('Computer Technology')

WebUI.click(findTestObject('Object Repository/Anna/Page_Computer Technology/a_Courses Offered'))

WebUI.click(findTestObject('Object Repository/Anna/Page_Computer Technology/a_Academic Schedule'))

WebUI.click(findTestObject('Object Repository/Anna/Page_Anna University, Chennai/a_Centre for Admissions'))

WebUI.switchToWindowTitle('Anna University, Chennai')

WebUI.click(findTestObject('Object Repository/Anna/Page_Anna University, Chennai/a_International Admissions (UGPG)'))

WebUI.click(findTestObject('Object Repository/Anna/Page_Anna University, Chennai/a_Electrical and Electronics Engineering'))

