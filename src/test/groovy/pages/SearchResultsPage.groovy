package pages

import geb.Page
import modules.SearchResultsBarModule


class SearchResultsPage extends Page {

    static url = '/sch/i.html'

    static at = { title.contains("eBay")
    }

    static content = {
        searchResultsBar { module SearchResultsBarModule}
    }

}
