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

WebUI.navigateToUrl('https://vit.ac.in/')

WebUI.click(findTestObject('Object Repository/vit/Page_Vellore Institute of Technology  A Pla_f9d186/a_Menu'))

WebUI.click(findTestObject('Object Repository/vit/Page_Vellore Institute of Technology  A Pla_f9d186/a_Academics'))

WebUI.click(findTestObject('Object Repository/vit/Page_Academics  VIT/i_VIT - Bangalore_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/vit/Page_Academics  VIT/a_Academics'))

WebUI.click(findTestObject('vit/Page_Academics  VIT/a_Academics'))

WebUI.click(findTestObject('Object Repository/vit/Page_Academics  VIT/a_Programmes Offered'))

WebUI.click(findTestObject('Object Repository/vit/Page_Programmes Offered - Vellore Institute_e7ec83/h3_Chennai Campus'))

WebUI.click(findTestObject('Object Repository/vit/Page_Programmes Offered - Vellore Institute_e7ec83/h3_Vellore Campus'))

WebUI.click(findTestObject('Object Repository/vit/Page_Programmes Offered - Vellore Institute_e7ec83/a_Academic Regulations'))

WebUI.click(findTestObject('Object Repository/vit/Page_Programmes Offered - Vellore Institute_e7ec83/a_Postgraduate'))

WebUI.click(findTestObject('Object Repository/vit/Page_VIT PG 2024-25 Admissions  Post Gradua_58b70d/a_Research'))

WebUI.click(findTestObject('Object Repository/vit/Page_Research Organization  Academic Resear_583997/h3_PROGRAMMES OFFERED'))

WebUI.click(findTestObject('Object Repository/vit/Page_Research Organization  Academic Resear_583997/a_To know more details'))

WebUI.click(findTestObject('Object Repository/vit/Page_Research Organization  Academic Resear_583997/h3_FEES STRUCTURE'))

WebUI.click(findTestObject('Object Repository/vit/Page_Research Organization  Academic Resear_583997/h3_SELECTION PROCEDURE'))

WebUI.click(findTestObject('Object Repository/vit/Page_Research Organization  Academic Resear_583997/h3_ELIGIBILITY CRITERIA'))

WebUI.click(findTestObject('Object Repository/vit/Page_Research Organization  Academic Resear_583997/h3_PROGRAMMES OFFERED'))

