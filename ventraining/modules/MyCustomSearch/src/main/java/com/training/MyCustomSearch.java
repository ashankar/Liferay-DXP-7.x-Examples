package com.training;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.search.BaseIndexerPostProcessor;
import com.liferay.portal.kernel.search.BooleanClauseOccur;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.IndexerPostProcessor;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.TermQuery;
import com.liferay.portal.kernel.search.filter.BooleanFilter;
import com.liferay.portal.kernel.search.generic.TermQueryImpl;
import com.liferay.portal.kernel.util.Validator;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
			"indexer.class.name=com.liferay.journal.model.JournalArticle"
	},
	service = IndexerPostProcessor.class
)
public class MyCustomSearch extends BaseIndexerPostProcessor {

	@Override
	public void postProcessSearchQuery(BooleanQuery searchQuery, BooleanFilter booleanFilter,
			SearchContext searchContext) throws Exception {

		String keywords=searchContext.getKeywords();
		
		System.out.println("Keyword: " + keywords);
		
		if(Validator.isNotNull(keywords))
		{
			String[] searchTerm=keywords.toLowerCase().split(" ");
			
			for(String s: searchTerm)
			{
				if(s.equals("developer"))
				{
					TermQuery termQuery=new TermQueryImpl(Field.ASSET_TAG_NAMES, "liferay");
					termQuery.setBoost(100);
					searchQuery.add(termQuery, BooleanClauseOccur.SHOULD);
				}
			}
			
		}
		
	}
	

}