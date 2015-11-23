package info.cleidimarviana.searchview.provider;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by cleidimar on 22/11/15.
 */
public class SearchableProvider extends SearchRecentSuggestionsProvider {
    public static final String AUTHORITY="info.cleidimarviana.searchview.provider.SearchableProvider";
    public static final int MODE = DATABASE_MODE_QUERIES;

    public SearchableProvider(){
        setupSuggestions(AUTHORITY,MODE);
    }
}
