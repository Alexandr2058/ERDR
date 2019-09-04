package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginECP extends ParentPage{
    public LoginECP(WebDriver webDriver) {
        super(webDriver);
    }

    public void loginECP () throws MalformedURLException {
        URL serverURL = new URL("http://127.0.0.1:4723/");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "Root");

//        Console.WriteLine(FileName);
//        DesiredCapabilities appCapabilities = new DesiredCapabilities();
//        appCapabilities.SetCapability("app", "Root");
//        var DesktopSession = new WindowsDriver<WindowsElement>(new Uri("http://127.0.0.1:4723"), appCapabilities);
//        var PSDAPP = DesktopSession.FindElementByName("Personal DS service");
//        var PSDAPPTopLevelWindowHandle = PSDAPP.GetAttribute("NativeWindowHandle");
//        PSDAPPTopLevelWindowHandle = (int.Parse(PSDAPPTopLevelWindowHandle)).ToString("x");
//
//        DesiredCapabilities appCapab = new DesiredCapabilities();
//        appCapab.SetCapability("appTopLevelWindow", PSDAPPTopLevelWindowHandle);
//        var PDSSession = new WindowsDriver<WindowsElement>(new Uri(WinAppDriverUrl), appCapab);
    }
}
