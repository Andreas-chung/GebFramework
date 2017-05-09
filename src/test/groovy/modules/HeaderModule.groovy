package modules

import org.openqa.selenium.By

class HeaderModule extends BaseModule {

    static content = {
        welcomeMessage(wait:true) { $(By.id('gh-ug')) }
    }

}
