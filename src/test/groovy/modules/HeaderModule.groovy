package modules

import org.openqa.selenium.By

class HeaderModule extends BaseModule {

    static content = {
        welcomeMessage(wait:true) { $('#gh-ug') }
    }

    String getWelcomeMessage() {
        welcomeMessage.text()
    }

}
