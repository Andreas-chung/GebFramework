package specs

import pages.HomePage

class SearchSpec extends BaseSpec {

    def "As a logged out user, search for products on the site" () {

        given: "Bob is at the ebay website"
        to HomePage

        when: "bob is not logged in"
        header.getWelcomeMessage() == "Welcome."

        then: "header"
        header.getWelcomeMessage() == "Welcome."

    }

}

