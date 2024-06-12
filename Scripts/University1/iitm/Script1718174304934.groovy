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

WebUI.navigateToUrl('https://www.iitm.ac.in/')

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Indian Institute of Technology Madras/a_Students'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Indian Institute of Technology Madras _a6bf05/a_Campus Amenities'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Indian Institute of Technology Madras _02704f/a_Toggle Menu'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Indian Institute of Technology Madras _02704f/a_Academics'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Indian Institute of Technology Madras _02704f/a_Study  IITM'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Indian Institute of Technology Madras _02704f/a_Non-campus BS programmes'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Non-campus BS programmes  Indian Insti_386f0a/a_Toggle Menu'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Non-campus BS programmes  Indian Insti_386f0a/a_Academics'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Non-campus BS programmes  Indian Insti_386f0a/a_Departments'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Non-campus BS programmes  Indian Insti_386f0a/a_Aerospace Engineering'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Department of Aerospace Engineering  I_ae481f/a_Toggle Menu'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Department of Aerospace Engineering  I_ae481f/a_Academics'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Department of Aerospace Engineering  I_ae481f/a_Study  IITM'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Department of Aerospace Engineering  I_ae481f/a_Joint Degree Programmes'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Joint Degree Programmes  IIT Madras/div_Toggle Menu'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Joint Degree Programmes  IIT Madras/a_Toggle Menu'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Joint Degree Programmes  IIT Madras/a_Academics'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Joint Degree Programmes  IIT Madras/a_Academic Facilities'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Joint Degree Programmes  IIT Madras/a_Central Library'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Central Library  Indian Institute of T_a5a702/a_Toggle Menu'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Central Library  Indian Institute of T_a5a702/a_Research'))

WebUI.click(findTestObject('Object Repository/iitm-object/Page_Central Library  Indian Institute of T_a5a702/a_Research Areas'))

