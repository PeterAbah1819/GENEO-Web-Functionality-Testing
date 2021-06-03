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

//Open Browser
WebUI.openBrowser('')

//Navigate to url https://www.geneo.co.uk/
WebUI.navigateToUrl('https://www.geneo.co.uk/')

//Click on image
WebUI.click(findTestObject('Object Repository/img'))

//Click on Home
WebUI.click(findTestObject('Object Repository/a_Home'))

//Click on About
WebUI.click(findTestObject('Object Repository/a_About'))

//Click on Software
WebUI.click(findTestObject('Object Repository/a_Software (1)'))

//Click on Consulting
WebUI.click(findTestObject('Object Repository/a_Consulting (1)'))

//Click on The Academy
WebUI.click(findTestObject('Object Repository/a_The Academy (1)'))

//Click on Contact
WebUI.click(findTestObject('Object Repository/a_Contact'))

//Click on Blog
WebUI.click(findTestObject('Object Repository/a_Blog'))

//Delay a bit for the page to load
WebUI.delay(3)

//Click on 5 Guiding Principles
WebUI.click(findTestObject('Object Repository/Page_Latest Lean Management Articles and Blog Posts  GENEO/a_5 Guiding Principles Part Five  Continuous Improvement'))

//Scroll to the Bottom of the Page
WebUI.scrollToPosition(0, 10)

//Click on Teamwork (Continue if failed)
WebUI.click(findTestObject('Object Repository/Page_5 Guiding Principles - Part One Go Look See  GENEO Software/li_Teamwork'),FailureHandling.CONTINUE_ON_FAILURE)

//Click on Continuous Improvement (Continue if failed) 
WebUI.click(findTestObject('Object Repository/Page_5 Guiding Principles - Part One Go Look See  GENEO Software/li_Continuous Improvement'),FailureHandling.CONTINUE_ON_FAILURE)

//Click on Respect Our People (Continue if failed)
WebUI.click(findTestObject('Object Repository/Page_5 Guiding Principles - Part One Go Look See  GENEO Software/li_Respect Our People'),FailureHandling.CONTINUE_ON_FAILURE)

//Close Browser
WebUI.closeBrowser()

