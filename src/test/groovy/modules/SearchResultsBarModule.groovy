package modules

import geb.Module


class SearchResultsBarModule extends Module{

    static content = {
        sortByDropDown(wait:true) {$('#DashSortByContainer')}
        sortByOptions(wait:true) {$('#SortMenu')}
    }

    void selectSortByOption(String option) {
//        interact {moveToElement.(sortByDropDown)}
        sortByOptions.click()
    }


}
