const { default: $ } = require("webdriverio/build/commands/browser/$");
const elementUtil = require('../util/elementUtil')
const constData = require('../../constant.js')
class LoginPage{
    get userName(){
        return $('#username')
    }
    get password(){ return $('#password')}
    get logIn(){ return $('#loginBtn')}
    get signUpLink(){ return $('=Sign up')}

    //page actions
    getPageTitle(){

        return elementUtil.doGetTitle(constData.LOGIN_PAGE_TITLE)
    }
    isSignUpLinkExist(){
        elementUtil.doIsDisplayed(this.signUpLink)
    }
    doLogIn(emailId,password){
        elementUtil.doSetValue(this.userName,emailId)
        elementUtil.doSetValue(this.password,password)
        elementUtil.doClick(this.logIn)
    }
}
module.exports = new LoginPage()