import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://dojo.code.ninja/employees/cn-vaughan-on-ca/")
selenium.click("link=Services")
selenium.click("link=Customer Lookup")
selenium.click("xpath=//input[@type='text']")
selenium.type("xpath=//input[@type='text']", ("hazel Chan").toString())
selenium.sendKeys("xpath=//input[@type='text']", Keys.ENTER)
selenium.click("xpath=//div[@id='accordiongroup-342-4376-panel']/div/div[2]/div/button[4]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Choose Program:'])[1]/following::select[1]")
selenium.select("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Choose Program:'])[1]/following::select[1]", "label=Code Ninjas CREATE - CNV - Create - Reactivate | Expires: July 25, 2022")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Choose Session Length:'])[1]/following::select[1]")
selenium.select("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Choose Session Length:'])[1]/following::select[1]", "label=1 Hour")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")
