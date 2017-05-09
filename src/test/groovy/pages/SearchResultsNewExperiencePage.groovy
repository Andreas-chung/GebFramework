package pages

import geb.Page

class SearchResultsNewExperiencePage extends Page {


static at = { title.contains("eBay")

}

    static content = {
        viewAllResultsLink(wait:true) { $('#mainContent > section.b-module.b-searchhook > div > a') }
    }

    void viewAllResultsLinkIsClicked() {
        viewAllResultsLink.click()
    }


}
