package pages

import geb.Page
import modules.SearchBoxModule
import modules.SearchResultsBarModule


class SearchResultsPage extends BasePage {

    static url = ''

    static at = { title.contains("Amazon.co.uk:")
    }

    static content = {
        searchBox { module SearchBoxModule }
        searchResultsBar { module SearchResultsBarModule }
    }

}
