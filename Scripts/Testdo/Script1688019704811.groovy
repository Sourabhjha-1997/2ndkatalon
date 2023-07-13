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

WebUI.navigateToUrl('https://demo.competethemes.com/')

WebUI.click(findTestObject('Object Repository/Page_Demo Site/a_Women'))

WebUI.rightClick(findTestObject('Object Repository/Page_Demo Site/h1_Women'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site/h1_Women'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Demo Site/h1_Women'), 'Women')

WebUI.click(findTestObject('Object Repository/Page_Demo Site/img__attachment-woocommerce_thumbnail size-_691320'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Demo Site/a_View cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Demo Site/td_79.00'), 0)

WebUI.click(findTestObject('Object Repository/Page_Demo Site/a_Proceed to checkout'))

