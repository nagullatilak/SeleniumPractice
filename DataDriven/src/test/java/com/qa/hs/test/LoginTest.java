package com.qa.hs.test;

import com.qa.hs.keyword.base.Base;
import com.qa.hs.keyword.engine.KeyWordEngine;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest {
    public KeyWordEngine keyWordEngine;

    @Test
    public void loginTest() throws IOException {
        keyWordEngine = new KeyWordEngine();
        keyWordEngine.startExecution("Sheet1");
    }


}
