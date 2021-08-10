const constData = require('../../constant.js')
class ElementUtil{
    doClick(element){
        element.waitForDisplayed();
        element.click();
    
    }
    doSetValue(element,value){
        element.waitForDisplayed();
        element.setValue(value)
    }
    doGetText(element){
        element.waitForDisplayed();
        return element.getText();
    }
    doIsDisplayed(element){
        element.waitForDisplayed();
        return element.isDisplayed()
    }
    doGetTitle(){
        browser.waitUntil(function(pageTitle){
            return browser.getTitle === pageTitle
        },10000,'title is not displayed after the given time')
        return browser.getTitle()
    }

}
module.exports = new ElementUtil();