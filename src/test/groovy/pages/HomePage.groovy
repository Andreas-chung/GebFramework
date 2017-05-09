package pages

import geb.Page
import modules.HeaderModule

class HomePage extends Page {

    static url = "/"
    static at = {title == "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay" }

    static content = {
        headerBar { module HeaderModule }
    }


}
