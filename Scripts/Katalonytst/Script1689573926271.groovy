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

WebUI.navigateToUrl('https://letcode.in/test')

WebUI.click(findTestObject('Object Repository/Page_LetCode - Testing Hub/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_Interact with Input fields/input_Enter your full Name_fullName'), 'Sourabh')

WebUI.setText(findTestObject('Object Repository/Page_Interact with Input fields/input_Append a text and press keyboard tab_join'), 
    'I am  not good')

WebUI.setText(findTestObject('Object Repository/Page_Interact with Input fields/input_What is inside the text box_getMe'), 
    'Quick')

WebUI.setText(findTestObject('Object Repository/Page_Interact with Input fields/input_Clear the text_clearMe'), 'Lakshay Gudral')

WebUI.setText(findTestObject('Object Repository/Page_Interact with Input fields/input_Confirm edit field is disabled_noEdit'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Interact with Input fields/input_Confirm edit field is disabled_noEdit'))

WebUI.click(findTestObject('Object Repository/Page_Interact with Input fields/input_Confirm text is readonly_dontwrite'))

WebUI.click(findTestObject('Object Repository/Page_Interact with Input fields/input_Confirm text is readonly_dontwrite'))

WebUI.click(findTestObject('Object Repository/Page_Interact with Input fields/input_Confirm text is readonly_dontwrite'))

WebUI.click(findTestObject('Object Repository/Page_Interact with Input fields/input_Confirm text is readonly_dontwrite'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Interact with Input fields/span_On completion of this exercise, you ca_0fe305'), 
    'On completion of this exercise, you can learn the following concepts.')

