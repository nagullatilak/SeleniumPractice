const { assert } = require('chai');
const logInPage = require('../../pages/logIn.page')
const configData = require('../../config.js')
const constData = require('../../constant.js')
describe('Login feature test',()=>{
    it('Verify login page title',()=>{
        browser.url('/');
        browser.maximize()
        const title = logInPage.getPageTitle()
        console.log("Login page title is "+title)
        assert.equal(constData.LOGIN_PAGE_TITLE,title,'title is not found')
    })
    it("Verify signup link",()=>{
        assert(true,logInPage.isSignUpLinkExist(),'Sign up link is exist')
    })
    it("Verify Login",()=>{
        logInPage.doLogin(configData.userName,configData.password )
    })
})