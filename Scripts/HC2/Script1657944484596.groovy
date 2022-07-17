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

WebUI.navigateToUrl('https://login.microsoftonline.com/te/franchiczar.onmicrosoft.com/b2c_1a_signin_codeninjas/oauth2/v2.0/authorize?client_id=0af8d70e-0159-4497-bf82-7e6498d1cf46&redirect_uri=https%3A%2F%2Fdojo.code.ninja&response_mode=form_post&response_type=code%20id_token&scope=openid%20profile%20offline_access%20https%3A%2F%2Ffranchiczar.onmicrosoft.com%2Ffranchiczar.com%2Fuser.read&state=OpenIdConnect.AuthenticationProperties%3DVxBTMCFfJZ3Rg8tnkB0z_KeH4ab3_JPNHI0U1O9_EeOXmx9fZoeDf6m-JvqPVCqpSw1lCnWD96wN0Q4cXZ9aAYmuqkDMxkwmqXe5WFOvIjif7ADVsemzkpOBZDh9PXIFWI3vz5UCXjtGfdbrTbmo0abDegp-O4m2p3nTw7n15I44zIgN7Z590pTb6tLRjebsSpU7OimW9u81JVHBFJJww984rTSqYtu7KAI10NySqIyPnW-oGl29vVjQDvKcGk_lUNu206kQzL8h6BJclhScaw&nonce=637935411711150245.ZWRlMDk1ZWQtNjE2Ni00NGIxLWJlMzYtNDE5NzdiMDM4MDliMThmMGFlNTItNTQ3YS00MTk0LWFhZDQtZmExODI5MjU2YjU3&x-client-SKU=ID_NET451&x-client-ver=5.2.1.0')

WebUI.click(findTestObject('Object Repository/Page_Code Ninjas Dojo/div_Sign in with your social account       _e5a5ae'))

WebUI.click(findTestObject('Object Repository/Page_Code Ninjas Dojo/button_Staff Account'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/div_Sign-in options'))

WebUI.closeBrowser()

