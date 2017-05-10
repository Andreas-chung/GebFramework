package modules

import geb.Module


class SearchResultsBarModule extends Module {


    static content = {
        sortByDropDown(wait:true) {$('#DashSortByContainer')}
        sortByOptions(wait:false) {$('#SortMenu')}
    }

    void selectSortByOption(String option) {
        interact {moveToElement(sortByDropDown)}
        sortByOptions.children().find { it.text() == option }.click()
    }


}
