package specs

import pages.HomePage
import pages.SearchResultsNewExperiencePage
import pages.SearchResultsPage

class SearchSpec extends BaseSpec {

    def "As a logged out user, search for products on the site" () {

        given: "Bob is on the ebay website"
        to HomePage

        when: "Bob searches for iPhone 6s "
        searchBox.enterSearchText("iPhone 6s")
        searchBox.searchButtonIsClicked()

        /*
         //this goes away after opting out ?
        then: "Bob reaches the new shopping experience"
        at SearchResultsNewExperiencePage

        when: "Bob clicks on view all search results link"
        viewAllResultsLinkIsClicked()
*/

        then: "Bob is the search results page"
        at SearchResultsPage

        when: "Bob selects his sort by option"
        searchResultsBar.selectSortByOption("Lowest")

        then: "need a then"
        println "then"
    }

}

