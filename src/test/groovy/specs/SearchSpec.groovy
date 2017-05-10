package specs

import pages.HomePage

import pages.SearchResultsPage

class SearchSpec extends BaseSpec {

    def "As a logged out user, search for products on the site" () {

        given: "Bob is on the amazon website"
        to HomePage

        when: "Bob searches for iPhone 6s "
        searchBox.enterSearchText("iPhone 6s")
        searchBox.searchButtonIsClicked()

        then: "Bob is then taken to the search results page"
        at SearchResultsPage

        when: "Bob selects his sort order "
        searchResultsBar.selectSortByOption("Price: Low to High")

        then: "the search results page should be updated according to the sort order"
        isQueryParameterSet("ref", "sr_st_price-asc-rank")

    }

}

