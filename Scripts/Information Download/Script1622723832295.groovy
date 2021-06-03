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

//Scroll down to footer
WebUI.scrollToPosition(0, 30)

//Click on Licensing Information
WebUI.click(findTestObject('Object Repository/a_Licensing information'))

//Click on T&Cs General
WebUI.click(findTestObject('Object Repository/p_TCs General'))

//Go Back to Licensing Page
WebUI.switchToWindowTitle('Licensing information | GENEO')

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/a_Download PDF'))

//Go Back to Licensing Page
WebUI.switchToWindowTitle('Licensing information | GENEO')

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/p_TCs Cloud Hosted SME ANNUAL'))

//Go Back to Licensing Page
WebUI.switchToWindowTitle('Licensing information | GENEO')

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/a_Download PDF_1'))

//Go Back to Licensing Page
WebUI.switchToWindowTitle('Licensing information | GENEO')

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/h4_Service Level Agreements'))

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/p_SLA Customer Hosted'))

//Go Back to Licensing Page
WebUI.switchToWindowTitle('Licensing information | GENEO')

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/a_Download PDF_1_2'))

//Go Back to Licensing Page
WebUI.switchToWindowTitle('Licensing information | GENEO')

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/p_SLA_Geneo Cloud Hosted_Jan_2020'))

//Go Back to Licensing Page
WebUI.switchToWindowTitle('Licensing information | GENEO')

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/a_Download PDF_1_2_3'))

//Go Back to Licensing Page
WebUI.switchToWindowTitle('Licensing information | GENEO')

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/h4_Hosting Agreements'))

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/p_Hosting Policy'))

//Go Back to Licensing Page
WebUI.switchToWindowTitle('Licensing information | GENEO')

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/a_Download PDF_1_2_3_4'))

//Go Back to Licensing Page
WebUI.switchToWindowTitle('Licensing information | GENEO')

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/p_Minimum Requirements for GEN-OPS 1'))

//Go Back to Licensing Page
WebUI.switchToWindowTitle('Licensing information | GENEO')

//Click on PDF to be displayed
WebUI.click(findTestObject('Object Repository/a_Download PDF_1_2_3_4_5'))

//Go Back to Licensing Page
WebUI.switchToWindowTitle('Licensing information | GENEO')

//Close Browser
WebUI.closeBrowser()

