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

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/index.htm')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Welcome  Online Banking/input_Username_username'), 'Sourabh1@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Welcome  Online Banking/div_Password_login'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Welcome  Online Banking/div_Password_login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ParaBank  Welcome  Online Banking/input_Password_password'), 
    'HVoQRDdOdYA=')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Welcome  Online Banking/input_Password_button'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/a_About Us'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  About Us/a_Request Loan'))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Loan Request/input_Loan Amount_amount'), '5000')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Loan Request/input_Down Payment_downPayment'), '200')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Loan Request/input_From account_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_ParaBank  Loan Request/p_Congratulations, your loan has been approved'), 
    'Congratulations, your loan has been approved.')

