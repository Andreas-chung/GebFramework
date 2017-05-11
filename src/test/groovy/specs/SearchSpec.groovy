package specs

import pages.HomePage

import pages.SearchResultsPage

class SearchSpec extends BaseSpec {


    def setup() {
        //any test setup specific for this spec is done here. This would be good to set up data for these tests
    }

    def cleanup() {
        //any clean up if needed
    }

    def "As a logged out user, search for #searchItem on the site"() {

        given: "Bob is on the amazon website"
        to HomePage

        when: "Bob searches for a #searchItem "
        searchBox.enterSearchText(searchItem)
        searchBox.searchButtonIsClicked()

        then: "Bob is then taken to the search results page"
        at SearchResultsPage
        isQueryParameterSet("keywords", searchKeyWord)

        when: "Bob sorts the results by #sortOrder"
        searchResultsBar.selectSortByOption(sortOrder)

        then: "the search results page should be updated according to the sort order"
        isQueryParameterSet("sort", sortOptionUrl)

        //In the perfect world, we would have full control over the applicaiton under test, it would be running locally or on a build server,
        // which we then can setup data and test the sorting logic. The sorting logic would probably be in another service which handles search requests.

        when: "apple brand is selected"
        sideBar.selectBrand(refineBy)

        then: "somehting happens"
        println "then"
        where:
        searchItem  | searchKeyWord | sortOrder              | sortOptionUrl        | refineBy
        "iphone 6s" | "iphone+6s"   | "Featured"             | "featured-rank"      | "Apple"
        "iphone 6s" | "iphone+6s"   | "Price: Low to High"   | "price-asc-rank"     | "Apple"
        "iphone 6s" | "iphone+6s"   | "Price: High to Low"   | "price-desc-rank"    | "Apple"
        "iphone 6s" | "iphone+6s"   | "Avg. Customer Review" | "smooth-review-rank" | "Apple"
        "iphone 6s" | "iphone+6s"   | "Newest Arrivals"      | "date-desc-rank"     | "Apple"
        "iphone 6s" | "iphone+6s"   | "Newest Arrivals"      | "date-desc-rank"     | "JETech"
    }




}

