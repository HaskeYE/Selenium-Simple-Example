package htmlElements;

import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface Message extends ExtendedMyWebElement<Message> {
    @Description("Message text")
    @FindBy(".//div[contains(@class, 'text-content')]")
    ExtendedMyWebElement messageText();

    @Description("Message time")
    @FindBy(".//span[contains(@class, 'message-time')")
    ExtendedMyWebElement messageTime();
}
