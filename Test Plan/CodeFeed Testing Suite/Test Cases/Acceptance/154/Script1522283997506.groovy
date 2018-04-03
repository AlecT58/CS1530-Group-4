import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:5000/')

WebUI.click(findTestObject('AlbertObjFolder/AcceptanceObj/a_Login (4)'))

WebUI.setText(findTestObject('AlbertObjFolder/AcceptanceObj/input_username (5)'), 'q')

WebUI.setText(findTestObject('AlbertObjFolder/AcceptanceObj/input_password (5)'), '12345678')

WebUI.click(findTestObject('AlbertObjFolder/AcceptanceObj/input_login (4)'))

WebUI.click(findTestObject('AlbertObjFolder/AcceptanceObj/button_Edit Profile'))

WebUI.setText(findTestObject('AlbertObjFolder/AcceptanceObj/input_txtName'), 'o')

WebUI.setText(findTestObject('AlbertObjFolder/AcceptanceObj/input_txtEmail'), 'a@b')

WebUI.setText(findTestObject('AlbertObjFolder/AcceptanceObj/input_txtPass1'), '23456789')

WebUI.click(findTestObject('AlbertObjFolder/AcceptanceObj/div_Name'))

WebUI.setText(findTestObject('AlbertObjFolder/AcceptanceObj/input_txtPass2'), '23456789')

WebUI.setText(findTestObject('AlbertObjFolder/AcceptanceObj/textarea_txtBio'), 'hha')

WebUI.click(findTestObject('AlbertObjFolder/AcceptanceObj/button_Update Profile'))

WebUI.click(findTestObject('AlbertObjFolder/AcceptanceObj/div_Your profile was updated'))

WebUI.click(findTestObject('AlbertObjFolder/AcceptanceObj/button_OK'))

WebUI.click(findTestObject('AlbertObjFolder/AcceptanceObj/h2_o'))

WebUI.click(findTestObject('AlbertObjFolder/AcceptanceObj/p_hha'))

WebUI.click(findTestObject('AlbertObjFolder/AcceptanceObj/p_ab'))

WebUI.closeBrowser()
