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

WebUI.navigateToUrl('https://login.microsoftonline.com/te/franchiczar.onmicrosoft.com/b2c_1a_signin_codeninjas/oauth2/v2.0/authorize?client_id=0af8d70e-0159-4497-bf82-7e6498d1cf46&redirect_uri=https%3A%2F%2Fdojo.code.ninja&response_mode=form_post&response_type=code%20id_token&scope=openid%20profile%20offline_access%20https%3A%2F%2Ffranchiczar.onmicrosoft.com%2Ffranchiczar.com%2Fuser.read&state=OpenIdConnect.AuthenticationProperties%3DgO9msoJpRyJmoFyFeef4U8LcH_dEFeV6SKwTXbTNjjoPX87buITYbIPGjQ51arNGM5siE8rWGyaiAgw0rg2hSXdL0JgvbYMaw-AaekcHsnt8ZnjFn1PkuxcYcsZtDjlPOkLAoqsb147_95tCzjZz7MXrqh4dzERcclxGL_GKgkCPzyhirmP0s13OcyPXxcQ2VHgFMCqg-OHvt7fpoyCeGd6qs08Rl60SomyIJlBoYs7XVOmwR45QSJkhIBJj9EZ6opwOzBwCGSKCtTw74MVmvA&nonce=637936188699585284.MGYxNDNjNjgtMjUxNS00YjRiLWIyYjYtN2VlODM2NTlmMDJmOGFjMTZiZmEtODk4YS00ZGI2LWFhYmYtZTFmY2VhMGUzYzMw&x-client-SKU=ID_NET451&x-client-ver=5.2.1.0')

WebUI.click(findTestObject('Object Repository/Page_Code Ninjas Dojo/button_Staff Account'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'elaine.chan@codeninjas.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), 'S38poEdXS1c7UGucEw7XHA==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Code Ninjas Dojo/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Code Ninjas Dojo/a_Customer Lookup'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Lookup - Code Ninjas Dojo/input_Sign Out_ng-pristine ng-untouched ng-_427508'), 
    'hazel chan')

WebUI.click(findTestObject('Object Repository/Page_Customer Lookup - Code Ninjas Dojo/button_Manual Scan-In'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Customer Lookup - Code Ninjas Dojo/select_Code Ninjas CREATE - CNV - Create - _4aa8fb'), 
    'object:247', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Customer Lookup - Code Ninjas Dojo/select_1 Hour                        2 Hours'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Customer Lookup - Code Ninjas Dojo/button_Submit'))

