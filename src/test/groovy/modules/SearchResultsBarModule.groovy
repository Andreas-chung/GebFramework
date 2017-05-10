package modules

import geb.Module


class SearchResultsBarModule extends Module {


    static content = {
        sortByDropDown(wait:true) {$('#sort')}
    }

    void selectSortByOption(String option) {
        sortByDropDown.value(option)
    }
}
