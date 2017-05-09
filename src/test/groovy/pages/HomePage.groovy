package pages

import geb.Page
import modules.HeaderModule
import modules.SearchBoxModule

class HomePage extends Page {

    static url = ""
    static at = {
        title.contains("Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay")
    }

    static content = {
        header { module HeaderModule }
        searchBox { module SearchBoxModule }
    }




}
