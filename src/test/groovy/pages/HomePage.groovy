package pages

import geb.Page
import modules.HeaderModule
import modules.SearchBoxModule

class HomePage extends BasePage {

    static url = ""
    static at = {
        title.contains("Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more")
    }

    static content = {
        header { module HeaderModule }
        searchBox { module SearchBoxModule }
    }




}
