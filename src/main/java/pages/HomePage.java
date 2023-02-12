package pages;

import htmlElements.ExtendedMyWebElement;
import htmlElements.ExtendedWebPage;
import htmlElements.Message;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public interface HomePage extends ExtendedWebPage {
    @Description("InputField")
    @FindBy("//input[@class='gLFyf gsfi']")
    ExtendedMyWebElement searchField();

    @Description("Messages")
    @FindBy("//div[contains(@class, 'Message')]")
    List<Message> messagesList();

    @Description("Dialogues")
    @FindBy("//h3[contains(@class, 'fullName')]")
    List<WebElement> dialogues();

}