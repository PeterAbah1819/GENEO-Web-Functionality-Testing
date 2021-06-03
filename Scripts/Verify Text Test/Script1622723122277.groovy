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

//Scroll to footer
WebUI.scrollToPosition(0, 30)

//Click on Privacy Policy
WebUI.click(findTestObject('Object Repository/a_Privacy Policy'))

//On Privacy Policy Page, Verify that the Text 'Privacy Policy Exists'
WebUI.verifyTextPresent('Privacy Policy', false)

//Click Verify the text 'Types of Data Collected'
WebUI.click(findTestObject('Object Repository/h2_Types of Data collected'))

//Click Verify the text 'Owner Contact Email'
WebUI.click(findTestObject('Object Repository/p_Owner contact email salesgeneo.co.uk'))

//Click Verify the text 'Mode and Place of Processing the Data'
WebUI.click(findTestObject('Object Repository/h2_Mode and place of processing the Data'))

//Click Verify the text 'Methods of Processing'
WebUI.click(findTestObject('Object Repository/h3_Methods of processing'))

//Click Verify the text 'Lega; Basis of Processing'
WebUI.click(findTestObject('Object Repository/h3_Legal basis of processing'))

//Click Verify the text 'Place'
WebUI.click(findTestObject('Object Repository/h3_Place'))

//Click Verify the text 'Retention Time'
WebUI.click(findTestObject('Object Repository/h3_Retention time'))

//Click Verify the text 'Purpose of Processing'
WebUI.click(findTestObject('Object Repository/h2_The purposes of processing'))

//Click Verify the text 'Detailed Information on the Processing'
WebUI.click(findTestObject('Object Repository/h2_Detailed information on the processing o_a7e8a3'))

//Click Verify the text 'Analytics'
WebUI.click(findTestObject('Object Repository/h3_Analytics'))

//Click Verify the text 'Google Analytics'
WebUI.click(findTestObject('Object Repository/h4_Google Analytics (Google LLC)'))

//Click Verify the text 'Displaying Content From External Platforms'
WebUI.click(findTestObject('Object Repository/h3_Displaying content from external platforms'))

//Click Verify the text 'The rights of Users'
WebUI.click(findTestObject('Object Repository/h2_The rights of Users'))

//Click Verify the text 'Details About The Right To Object to Processing'
WebUI.click(findTestObject('Object Repository/h3_Details about the right to object to processing'))

//Click Verify the text 'How to Exercise These Rights'
WebUI.click(findTestObject('Object Repository/h3_How to exercise these rights'))

//Click Verify the text 'Applicability of Broader Protection Standards'
WebUI.click(findTestObject('Object Repository/h2_Applicability of broader protection standards'))

//Click Verify the text 'Additional Information About Data Collection'
WebUI.click(findTestObject('Object Repository/h2_Additional information about Data collec_f8fad0'))

//Click Verify the text 'Location'
WebUI.click(findTestObject('Object Repository/p_GENEO LTD 7 Parade Leamington Spa Warwick_312b76'))

//Click Verify the text 'Contact'
WebUI.click(findTestObject('Object Repository/div_44 (0)1926 423132 salesgeneo.co.uk     _08f454'))

//Click on side bar item
WebUI.click(findTestObject('Object Repository/div_Excelling in excel just makes it more d_0f5ba6'))

//Click on Cookie Policy
WebUI.click(findTestObject('Object Repository/a_Cookie Policy'))

//Click Verify the text 'Google Analytics'
WebUI.verifyTextPresent('Google Analytics', false)

//Click Verify the text 'How to Manage Preference and Provide or Withdraw Consent'
WebUI.verifyTextPresent('How to manage preferences and provide or withdraw consent', false)

//Click Verify the text 'Locating Tracker Settings'
WebUI.click(findTestObject('Object Repository/h4_Locating Tracker Settings'))

//Click Verify the text 'Owner and Data Controller'
WebUI.verifyTextPresent('Owner and Data Controller', false)

//Click Verify the text 'Personal Data'
WebUI.verifyTextPresent('Personal Data', false)

//Click Verify the text 'Usage Data'
WebUI.verifyTextPresent('Usage Data', false)

//Click Verify the text 'Data Processor'
WebUI.verifyTextPresent('Data Processor', false)

//Click Verify the text 'Legal Information'
WebUI.verifyTextPresent('Legal information', false)

//Scroll to the Footer Again
WebUI.scrollToPosition(0, 30)

//Click on Terms and Conditions
WebUI.click(findTestObject('Object Repository/a_Terms and Conditions'))

//Click Verify the text 'Terms of Use'
WebUI.click(findTestObject('Object Repository/h2_TERMS OF USE'))

//Click Verify the text 'Terms and Conditions'
WebUI.verifyTextPresent('Terms and Conditions of GENEO', false)

//Click Verify the text 'What the User Should Know at a Glance'
WebUI.verifyTextPresent('What the User should know at a glance', false)

//Click Verify the text 'Liability and Indemnification'
WebUI.click(findTestObject('Object Repository/h2_Liability and indemnification'))

//Click Verify the text 'Common Provisions'
WebUI.click(findTestObject('Object Repository/h2_Common provisions'))

//Click Verify the text 'Indemnification'
WebUI.verifyTextPresent('Indemnification', false)

//Click Verify the text 'Service Reselling'
WebUI.click(findTestObject('Object Repository/h3_Service reselling'))

//Click Verify the text 'Service Interruption'
WebUI.click(findTestObject('Object Repository/h3_Service interruption'))

//Click Verify the text 'Contacts'
WebUI.click(findTestObject('Object Repository/h3_Contacts'))

//Click Verify the text 'Severability'
WebUI.click(findTestObject('Object Repository/h3_Severability'))

//Click Verify the text 'US Users'
WebUI.click(findTestObject('Object Repository/h4_US Users'))

//Click Verify the text 'EU Users'
WebUI.click(findTestObject('Object Repository/h4_EU Users'))

//Click Verify the text 'Governing Law'
WebUI.click(findTestObject('Object Repository/h3_Governing law'))

//Click Verify the text 'Exception for European Consumers'
WebUI.click(findTestObject('Object Repository/h4_Exception for European Consumers'))

//Click Verify the text 'Venue of Jurisdiction'
WebUI.click(findTestObject('Object Repository/h3_Venue of jurisdiction'))

//Click Verify the text 'Exception for European Consumers'
WebUI.click(findTestObject('Object Repository/h4_Exception for European Consumers'))

//Click Verify the text 'This Application'
WebUI.click(findTestObject('Object Repository/h4_This Application (or this Application)'))

//Click Verify the text 'Agreement'
WebUI.click(findTestObject('Object Repository/h4_Agreement'))

//Click Verify the text 'Business User'
WebUI.click(findTestObject('Object Repository/h4_Business User'))

//Click Verify the text 'European'
WebUI.click(findTestObject('Object Repository/h4_European (or Europe)'))

//Click Verify the text 'Owner'
WebUI.click(findTestObject('Object Repository/h4_Owner (or We)'))

//Close Browser
WebUI.closeBrowser()

