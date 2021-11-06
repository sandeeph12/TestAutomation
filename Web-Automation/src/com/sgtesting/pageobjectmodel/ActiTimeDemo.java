package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeDemo {
	
	public ActiTimeDemo(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//User Name WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//Minimize flyOut Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	//createUser
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement Create;
	public WebElement getCreate()
	{
		return Create;
	}
	//addUser  
	@FindBy(xpath="//*[@id='createUserDiv']/div/div[2]")
	private WebElement addUser;
	public WebElement getaddUser()
	{
		return addUser;
	}
	//nameField
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement firstname;
	public WebElement getfirstname()
	{
	return firstname;
	}
	@FindBy(id="userDataLightBox_lastNameField")
	private WebElement lastname;
	public WebElement getlastname()
	{
	return lastname;
	}
	@FindBy(id="userDataLightBox_emailField")
	private WebElement emailfield;
	public WebElement getemailfield()
	{
	return emailfield;
	}
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement usernameField;
	public WebElement getusernameField()
	{
	return usernameField;
	}
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement Password;
	public WebElement getPasswordField()
	{
	return Password;
	}
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement retypepasswordfield;
	public WebElement getretypepassword()
	{
	return retypepasswordfield;
	}
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement usercreated;
	public WebElement getusercreated()
	{
	return usercreated;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement  iconmodify;
	public WebElement geticonmodify()
	{
	return iconmodify;
	}
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement modifylastname;
	public WebElement getlastnameField()
	{
	return modifylastname;
	}
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement  modifybutton;
	public WebElement getmodifybutton()
	{
	return modifybutton;
	}

	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement  icondeleteUser;
	public WebElement geticondeleteUser()
	{
	return icondeleteUser;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement deleteUser;
	public WebElement getdeleteUser()
	{
	return deleteUser;
	}
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement createCustomer;
	public WebElement getCustomer()
	{
	return createCustomer;
	}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addnewCustomer;
	public WebElement getaddnewCustomer()
	{
	return addnewCustomer;
	}
	
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement newCustomer;
	public WebElement getnewCustomer()
	{
	return newCustomer;
	}
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement  customernameField;
	public WebElement getCustomernameField()
	{
	return customernameField;
	}	
	
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement  create1Customer;
	public WebElement getcreateCustomer()
	{
	return create1Customer;
	}
	@FindBy(xpath="/html/body/div[12]/div[1]/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement  addnewProject;
	public WebElement getaddnewProject()
	{
	return addnewProject;
	}
	
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement  newProject;
	public WebElement getnewProject()
	{
	return newProject;
	}
	
	@FindBy(id="projectPopup_projectNameField")
	private WebElement  ProjectnameField;
	public WebElement getProjectnameField()
	{
	return ProjectnameField;
	}
	
	@FindBy(xpath="/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]/div/span")
	private WebElement  create1Project;
	public WebElement getcreateProject()
	{
	return create1Project;
	}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement  editbutton;
	public WebElement getEditButton()
	{
	return editbutton;
	}	
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement  modifyCustomer;
	public WebElement getmodifyCustomer()
	{
	return modifyCustomer;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement  actionbutton;
	public WebElement getactionButton()
	{
	return actionbutton;
	}
	
	@FindBy(xpath="//html/body/div[26]/div[2]/div")
	private WebElement icondeleteProject;
	public WebElement geticondeleteProject()
	{
	return icondeleteProject;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement deleteProject;
	public WebElement getdeleteProject()
	{
	return deleteProject;
	}
	
	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[4]/div/div[3]/div")
	private WebElement icondeleteCustomer;
	public WebElement geticondeleteCustomer()
	{
	return icondeleteCustomer;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement Edit1Button;
	public WebElement getEdit1Button()
	{
	return Edit1Button;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement action1Button;
	public WebElement getaction1Button()
	{
	return action1Button;
	}
	
	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[2]/div[1]/div[4]/div/div/div[5]/div[1]/div/span")
	private WebElement deleteCustomer;
	public WebElement getdeleteCustomer()
	{
	return deleteCustomer;
	}
	
	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[4]/div/div[3]/div")
	private WebElement icondelete1Customer;
	public WebElement geticondelete1Customer()
	{
	return icondelete1Customer;
	}
	
	@FindBy(xpath="/html/body/div[12]/div[2]/div[2]/div[2]/div[1]/div[4]/div/div/div[5]/div[1]/div/span")
	private WebElement delete1Customer;
	public WebElement getdelete1Customer()
	{
	return delete1Customer;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement Edit2Button;
	public WebElement getEdit2Button()
	{
	return Edit2Button;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")
	private WebElement action2Button;
	public WebElement getaction2Button()
	{
	return action2Button;
	}
	
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement icondelete1Project;
	public WebElement geticondelete1Project()
	{
	return icondelete1Project;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement delete1Project;
	public WebElement getdelete1Project()
	{
	return delete1Project;
	}
	

	
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement icondelete2Customer;
	public WebElement geticondelete2Customer()
	{
	return icondelete2Customer;
	}
	
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
	private WebElement delete2Customer;
	public WebElement getdelete2Customer()
	{
	return delete2Customer;
	}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement Edit4Button;
	public WebElement getEdit4Button()
	{
	return Edit4Button;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement action4Button;
	public WebElement getaction4Button()
	{
	return action4Button;
	}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement Edit3Button;
	public WebElement getEdit3Button()
	{
	return Edit3Button;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement modifyProject;
	public WebElement getmodifyProject()
	{
	return modifyProject;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement action3Button;
	public WebElement getaction3Button()
	{
	return action3Button;
	}
	
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement 	deletestep;
	public WebElement getdeletestep()
	{
		return deletestep;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement 	deletestep2;
	public WebElement getdeletestep2() {
		return deletestep2;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement 	deletestep3;
	
	public WebElement getdeletestep3() {
		return deletestep3;
	}

	@FindBy(xpath="//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")
	private WebElement 	deletestep4;
	public WebElement getdeletestep4() {
		return deletestep4;
	}
	
}





