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

//Open Browser
WebUI.openBrowser('')

//Navigate to url https://www.geneo.co.uk/
WebUI.navigateToUrl('https://www.geneo.co.uk/')

//Click on Image
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

//Click on Blog
WebUI.click(findTestObject('Object Repository/a_Blog'))

//Click on Contact
WebUI.click(findTestObject('Object Repository/a_Contact'))

//Go back Home
WebUI.click(findTestObject('Object Repository/a_Home'))

//Click on Create a digital twin of your organisation
WebUI.click(findTestObject('Object Repository/p_Create a digital twin of your organisation'))

//Click on Software
WebUI.click(findTestObject('Object Repository/a_Software'))

//Click on Find out More
WebUI.click(findTestObject('Object Repository/a_Find Out More'))
//Scroll Down to the Middle of the Page
WebUI.scrollToPosition(0, 10)

//Click on Book My Free Software Demo
WebUI.click(findTestObject('Object Repository/a_Book My Free Software Demo'))


//Fill in Forms ----->>

WebUI.setText(findTestObject('Object Repository/input__nf-field-8'), 'Peter Abah')

WebUI.setText(findTestObject('Object Repository/input__nf-field-11'), 'GENEO Software')

WebUI.setText(findTestObject('Object Repository/input__email (1)'), 'peterabah@hotels.ng')

WebUI.setText(findTestObject('Object Repository/input__phone (1)'), '08127738594')

WebUI.setText(findTestObject('Object Repository/textarea__nf-field-9'), 'This is me trying to test the website')

//WebUI.click(findTestObject('Object Repository/input__nf-field-11'))


//Go back Home
WebUI.click(findTestObject('Object Repository/a_Home'))

//Click on Consulting
WebUI.click(findTestObject('Object Repository/a_Consulting'))

//Click on Book a Free First Consultation Call
WebUI.click(findTestObject('Object Repository/a_Book a Free First Consultation Call'))


//Fill in Forms ----->>

WebUI.setText(findTestObject('Object Repository/input__nf-field-14'), 'Peter Abah')

WebUI.setText(findTestObject('Object Repository/input__nf-field-17'), 'ZZZZ Software')

WebUI.setText(findTestObject('Object Repository/input__email (2)'), 'peterabah1819@gmail.com')

WebUI.setText(findTestObject('Object Repository/input__phone (2)'), '08127738594')

WebUI.setText(findTestObject('Object Repository/textarea__nf-field-15'), 'Testing the website')

//WebUI.click(findTestObject('Object Repository/input__nf-field-16'))


//Go back Home
WebUI.click(findTestObject('Object Repository/a_Home'))

//Click on The Academy
WebUI.click(findTestObject('Object Repository/a_The Academy'))

//Click on Signup Now
WebUI.click(findTestObject('Object Repository/a_Sign up now'))



//Fill in Forms ----->>

WebUI.click(findTestObject('Object Repository/input__nf-field-26'))

WebUI.setText(findTestObject('Object Repository/input__nf-field-26'), 'Peter Abah')

WebUI.setText(findTestObject('Object Repository/input__nf-field-29'), 'YYYY Software')

WebUI.setText(findTestObject('Object Repository/input__email (3)'), 'peterabah1819@gmail.com')

WebUI.setText(findTestObject('Object Repository/input__phone (3)'), '08127738594')

WebUI.setText(findTestObject('Object Repository/textarea__nf-field-27'), 'Testing this module')

//WebUI.click(findTestObject('Object Repository/input__nf-field-28'))


//Go back Home
WebUI.click(findTestObject('Object Repository/a_Home (4)'))

//Click on The Academy
WebUI.click(findTestObject('Object Repository/a_The Academy'))

//Click on Find out How
WebUI.click(findTestObject('Object Repository/a_Find out how'))



//Fill in Forms


WebUI.setText(findTestObject('Object Repository/input__nf-field-32'), 'Peter Abah')

WebUI.setText(findTestObject('Object Repository/input__nf-field-35'), 'GGG Software')

WebUI.setText(findTestObject('Object Repository/input__email (4)'), 'peterabah1819@gmail.com')

WebUI.setText(findTestObject('Object Repository/input__phone (4)'), '08127738594')

WebUI.setText(findTestObject('Object Repository/textarea__nf-field-33'), 'Testing this module')

//WebUI.click(findTestObject('Object Repository/input__nf-field-34'))


//Click on Problem Solving Technology Dumbing Us Down
WebUI.click(findTestObject('Object Repository/a_Problem Solving  Technology dumbing us down'))

//Click on Back to Blogs Breadcrumb
WebUI.click(findTestObject('Object Repository/a_Back to blogs'))

//Click on 5 Guiding Principles Part Four Teamwork
WebUI.click(findTestObject('a_5 Guiding Principles Part Four  Teamwork'))

//Scroll to footer
WebUI.scrollToPosition(0, 30)

//Click on Challenge the Status Quo
WebUI.click(findTestObject('a_Challenge the Status Quo'))

//Scroll to Position
WebUI.scrollToPosition(0, 30)

//Click on Go look See
WebUI.click(findTestObject('a_Go Look See'))

//Click on Search Icon
WebUI.click(findTestObject('Object Repository/div_Back to blogs_search-icon'))

//Click on Search Icon Again to Show that Text is Retained
WebUI.click(findTestObject('Object Repository/input_Contact_search-button'))

//Click on Contact
WebUI.click(findTestObject('Object Repository/a_Contact (1)'))



//Fill in Forms


WebUI.setText(findTestObject('Object Repository/input__nf-field-1'), 'Peter Abah')

WebUI.setText(findTestObject('Object Repository/input__nf-field-5'), 'DDDD Software')

WebUI.setText(findTestObject('Object Repository/input__email'), 'peterabah1819@gmail.com')

WebUI.setText(findTestObject('Object Repository/input__phone'), '08127738594')

WebUI.setText(findTestObject('Object Repository/textarea__nf-field-3'), 'Testing the contact module')

//WebUI.click(findTestObject('Object Repository/input__nf-field-4'))



//Click on Cookie Policy
WebUI.click(findTestObject('Object Repository/a_Cookie Policy'))

//Click on Locating Tracker Settings
WebUI.click(findTestObject('Object Repository/h4_Locating Tracker Settings'))

//Click on Google Chrome
WebUI.click(findTestObject('Object Repository/a_Google Chrome'))

//Go back to Cookie Policy
WebUI.switchToWindowTitle('Cookie Policy | GENEO')

//Click on Mozilla Firefox
WebUI.click(findTestObject('Object Repository/a_Mozilla Firefox'))

//Go back to Cookie Policy
WebUI.switchToWindowTitle('Cookie Policy | GENEO')

//Click on Apple Safari
WebUI.click(findTestObject('Object Repository/a_Apple Safari'))

//Go back to Cookie Policy
WebUI.switchToWindowTitle('Cookie Policy | GENEO')

//Click on Microsoft Internet Explorer
WebUI.click(findTestObject('Object Repository/a_Microsoft Internet Explorer'))

//Go Back to Cookie Policy 
WebUI.switchToWindowTitle('Cookie Policy | GENEO')

//Click on Microsoft Edge
WebUI.click(findTestObject('Object Repository/a_Microsoft Edge'))

//Go Back to Cookie Policy Page
WebUI.switchToWindowTitle('Cookie Policy | GENEO')

//Click on Brave
WebUI.click(findTestObject('Object Repository/a_Brave'))

//Go Back to Cookie Policy
WebUI.switchToWindowTitle('Cookie Policy | GENEO')

//Click on Opera
WebUI.click(findTestObject('Object Repository/a_Opera'))

//Click on Cookie Policy
WebUI.switchToWindowTitle('Cookie Policy | GENEO')

//Click on Terms and Conditions
WebUI.click(findTestObject('Object Repository/a_Terms and Conditions'))

//Scroll to the Footer
WebUI.scrollToPosition(0, 30)

//Click on Licensing Information
WebUI.click(findTestObject('Object Repository/a_Licensing information'))

//Click on Software
WebUI.click(findTestObject('Object Repository/a_Software (2)'))

//Click on Find out More
WebUI.click(findTestObject('Object Repository/a_Find Out More_1'))

//Click on Blog Img
WebUI.click(findTestObject('Object Repository/img (3)'))

//Click on BLog Img
WebUI.click(findTestObject('Object Repository/img_1 (1)'))

//Click on Contact Us to Find Out More
WebUI.click(findTestObject('Object Repository/a_Contact us to find out more'))

//Close Browser
WebUI.closeBrowser()

