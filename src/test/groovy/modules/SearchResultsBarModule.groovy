package modules

import geb.Module


class SearchResultsBarModule extends Module {


    static content = {
        sortByDropDown(wait:true) {$('#sort')}
        brandName(wait:true) { $('#s-result-count > span > a:nth-child(3)') } //better with id of course
    }

    void selectSortByOption(String option) {
        sortByDropDown.value(option)
    }

    String getBrandText() {
        brandName.text()
    }
}
