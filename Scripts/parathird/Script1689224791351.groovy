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

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ParaBank  Welcome  Online Banking/input_Password_password'), 
    'TlUUc/Ntq0oFY6npJlM7mQ==')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Welcome  Online Banking/input_Password_button'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Accounts Overview/a_Bill Pay'))

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Payee Name_payee.name'), 'Nisha')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Address_payee.address.street'), '34-c11')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_City_payee.address.city'), 'Mehrauli')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_State_payee.address.state'), 'Delhi')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Zip Code_payee.address.zipCode'), '110030')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Phone_payee.phoneNumber'), '78553158')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Account_payee.accountNumber'), '1234567899')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Verify Account_verifyAccount'), '1234567899')

WebUI.setText(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_Amount_amount'), '10')

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Bill Pay/input_From account_button'))

WebUI.click(findTestObject('Object Repository/Page_ParaBank  Bill Payment Complete/span_10.00'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_ParaBank  Bill Payment Complete/span_10.00'), '$10.00')

