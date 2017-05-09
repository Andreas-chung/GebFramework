package modules

class SearchBoxModule extends BaseModule{


    static content = {
        searchBox(wait:true) { $('#gh-ac') }
        searchButton(wait:true) { $('#gh-btn') }
    }

    void enterSearchText(String searchText) {
        searchBox.value(searchText)
    }

    void searchButtonIsClicked() {
        searchButton.click()
    }
}
